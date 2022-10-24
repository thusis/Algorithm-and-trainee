package member.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import member.model.service.MemberService;
import member.model.vo.Member;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login.me")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userId = request.getParameter("id");
		String userPwd = request.getParameter("pwd");
		Member m = new Member();
		m.setUserId(userId);
		m.setUserPwd(userPwd);
		Member loginUser = new MemberService().login(m);
		//로그인 멤버를 Member 객체로 받아오기
		if(loginUser!=null) {
			//로그인 정보는 세션으로 저장해야 한다
			HttpSession session = request.getSession();
			session.setAttribute("loginUser", loginUser);
			//세션은 기본 30분, 10분으로 설정하고 싶다면 600[=60초*10] 지정해주면 됨 
			session.setMaxInactiveInterval(600);
			response.sendRedirect(request.getContextPath());
			//해당 응답이 전해지는 곳은 ContextPath 그 자체
		}else {
			request.setAttribute("msg", "로그인을 실패하였습니다.");
			request.getRequestDispatcher("WEB-INF/views/common/errorPage.jsp");
		}
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
