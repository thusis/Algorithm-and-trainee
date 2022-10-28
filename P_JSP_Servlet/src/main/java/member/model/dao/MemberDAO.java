package member.model.dao;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import member.model.vo.Member;
public class MemberDAO {
	
	private Properties prop = new Properties();
	
	public MemberDAO() {
		//MemberDAO 클래스 호출시 자동으로 property 불러오기
		String fileName = MemberDAO.class.getResource("/sql/member/member-query.properties").getPath();
		try {
			prop.load(new FileReader(fileName));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Member login(Connection conn, Member m) {
		PreparedStatement pstmt = null;
		ResultSet rset =null;
		Member loginUser = null;
		
		String query = prop.getProperty("login");
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, m.getUserId());
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	
}
