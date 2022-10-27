package common;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Template {
	
	private Template() {}
	public static SqlSession getSqlSession() {
		// mybatis.org에서 마이바티스 다운받아 lib 에 설치
		SqlSession session = null;
		try {
			InputStream stream = Resources.getResourceAsStream("/mybatis-config.xml");
			// resources 패키지 안에 mybatis-config.xml 파일 만들어서 스트림으로 불러오기
			
			SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();
			SqlSessionFactory ssf = ssfb.build(stream);
			// SqlSessionFactoryBuiler => SqlSessionFactory => SqlSession
			
			session = ssf.openSession(false);
			// 자동커밋, autocommit 을 하지 않겠다
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return session;
	}
//commit, rollback, close : JDBCTemplate 와 달리 Template 의 SqlSession이 모든 기능을 한 번에 해 준다.
}
