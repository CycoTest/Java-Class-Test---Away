package test01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBconnect {
	private Connection connect = null;
	private PreparedStatement psmt = null;
	private String driver = "oracle.jdbc.driver.OracleDriver";

	public Connection conn() {
		try {
			Class.forName(driver);
			String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_user = "c##green";
			String db_password = "green1234";

			connect = DriverManager.getConnection(db_url, db_user, db_password);

			System.out.println("Connect Success");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connect;
	}
	
	public void closeDB() {
		try {
			if (connect != null) {
				connect.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void closePS() {
		try {
			if (psmt != null) {
				psmt.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
