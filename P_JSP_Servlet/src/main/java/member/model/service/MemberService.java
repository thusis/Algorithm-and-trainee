package member.model.service;
import static common.JDBCTemplate.close;
import static common.JDBCTemplate.getConnection;

import java.sql.Connection;

import member.model.dao.MemberDAO;
import member.model.vo.Member;

public class MemberService {
	public Member login(Member m) {
		Connection conn = getConnection();
		Member loginMember = new MemberDAO().login(conn, m);
		close(conn);
		return loginMember;
	}

}
