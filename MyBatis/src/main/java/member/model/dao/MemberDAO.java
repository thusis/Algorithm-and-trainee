package member.model.dao;

import org.apache.ibatis.session.SqlSession;

import member.model.exception.MemberException;
import member.model.vo.Member;

public class MemberDAO {

	public Member selectMember(SqlSession session, Member m) throws MemberException {
		/*
			(1) selectOne(String arg0)
			 	: 어떤 쿼리에 연결할지 mapper와 연결. mapper의 아이디 이용한다
		 	(2) selectOne(String arg0, Object args1)
		 		: 두 번째 매개변수(String, ArrayList, HashMap, Object...egal)로 위치홀더 채워준다
		*/
		
		Member loginUser = (Member)(session.selectOne("memberMapper.loginMember", m));
	
		if(loginUser == null) {
			session.close();
			//비정상 종료가 되면 Service클래스에서 close가 실행되지 않으므로 미리 close() 처리 해주기
			throw new MemberException("로그인을 실패하였습니다."); //예외강제발생
		}
		return loginUser;
	}

	public int insertMember(SqlSession session, Member m) throws MemberException {
		
//		Member newMember = 
		System.out.println("DAO1"+m);
		int result = session.insert("memberMapper.insertMember",m);
		System.out.println("DAO2"+m);
		
		if(result<=0) {
			session.rollback();
			session.close();
			throw new MemberException("회원가입을 실패했습니다.");
		} else {
			Member loginUser = (Member)(session.selectOne("memberMapper.loginMember",m));
			System.out.println(m.getNickName()+"님의 회원가입을 축하합니다.");
		}
		// TODO Auto-generated method stub
		return result;
	}

	public void updateMember(SqlSession session, Member m) throws MemberException {
		int result = session.update("memberMapper.updateMember", m);
		if(result<=0) {
			session.rollback();
			session.close();
			throw new MemberException("회원 수정을 실패하였습니다.");
		}
	}

	public void deleteMember(SqlSession session, String userId) throws MemberException {
		int result = session.update("memberMapper.deleteMember", userId);
		if(result<=0) {
			session.rollback();
			session.close();
			throw new MemberException("회원 삭제를 실패하였습니다.");
		}
		
		
	}

}
