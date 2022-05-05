package dataBase;

import java.sql.*;

public class DB {
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null; // 쿼리 시에 결과를 저장하는 용도로 사용. select에 주로 사용
	
	public void connectDB() {
		final String driver = "org.mariadb.jdbc.Driver";
		//final String DB_HOST = "localhost";
		final String DB_HOST = "127.0.0.1";
		final String DB_PORT = "3306";
		final String DB_NAME = "db_test"; // 데이터 베이스 이름
		final String DB_URL =
				"jdbc:mariadb://"+ DB_HOST + ":" + DB_PORT + "/" + DB_NAME;
		
		final String DB_USER = "root";
		final String DB_PASS = "aespa0519";
		
		// DB Connecting
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
			if (conn != null) {
				System.out.println("DB 접속 성공");
			}
		}
		catch (ClassNotFoundException e) {
			System.out.println("드라이버 로드 실패");
			e.printStackTrace();
		}
		catch (SQLException e) {
			System.out.println("DB 접속 실패");
			e.printStackTrace();
		}
	}
	
	public void closeDB() {
		try {
			if (rs != null) { // 열린 경우 닫음
				rs.close();
			}
			if (pstmt != null ) { // 열린 경우 닫음
				pstmt.close();
			}
			
			if (conn != null && !conn.isClosed()) {
				conn.close();
				System.out.println("DB 접속 해제");
			}
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
}