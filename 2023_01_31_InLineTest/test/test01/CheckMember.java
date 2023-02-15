package test01;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CheckMember {
	private PreparedStatement psmt;
	private int cnt;

	public int in(String userId, String userPassword) {
		DBconnect dao = new DBconnect();
		
		try {
			
			String sql = "select * from Membership where id=? and password=?";
			
			psmt = dao.conn().prepareStatement(sql);
			psmt.setString(1, userId);
			psmt.setString(2, userPassword);
			cnt = psmt.executeUpdate();
			
			psmt.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(cnt);
		
		return cnt;
	}
}
