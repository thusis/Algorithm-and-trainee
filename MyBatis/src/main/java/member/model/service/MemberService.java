package member.model.service;

import static common.Template.getSqlSession;

import org.apache.ibatis.session.SqlSession;

import member.model.dao.MemberDAO;
import member.model.exception.MemberException;
import member.model.vo.Member;

public class MemberService {

	public Member selectMember(Member m) throws MemberException {
		SqlSession session = getSqlSession();
		Member loginUser = new MemberDAO().selectMember(session,m);
		session.close();
		
		return loginUser;
	}

	public void insertMember(Member m) throws MemberException {
		SqlSession session = getSqlSession();
		int result = new MemberDAO().insertMember(session, m);
		
		session.commit();
		
		session.close();
	}

	public void updateMember(Member m) throws MemberException {
		SqlSession session = getSqlSession();
		
		new MemberDAO().updateMember(session, m);
		
		session.commit();
		session.close();
		
	}

	public void deleteMember(String userId) throws MemberException {
		SqlSession session = getSqlSession();
		new MemberDAO().deleteMember(session, userId);
		
		session.commit();
		session.close();
		// TODO Auto-generated method stub
		
	}

}
