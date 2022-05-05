package mySQL;

import java.sql.*;

import javax.swing.*;

public class CB01DBConn extends JFrame{
	
	CB01DBConn() {
		super("프레임창 생성!");
		 setLocation(600, 300);
		 setSize(500, 500);
		 setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new CB01DBConn();
		
		// 드라이브 적재
		// DB Information (현재컴퓨터내/ 원격지, DB명, 계정)
		String Driver = "com.mysql.cj.jdbc.Driver";
		String Url = "jdbc:mysql://localhost:3330/employees";
		String user = "root";
		String pw = "aespa0519";
		
		// 연결객체 참조변수
		String sql;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName(Driver);
			System.out.println("Driver Loading Success");
			conn = DriverManager.getConnection(Url, user, pw);
			System.out.println("DB Connected");
			
			// String Url = "jdbc:mysql://localhost:3330/sqldb";를 쓸 때!
			/*
			sql = "insert into tbl_memo values(?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, 1);
			pstmt.setString(2,  "HELLO~");
			*/
			
			/*
			sql = "update tbl_memo set memo=? where id=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "WOW");
			pstmt.setInt(2,  1);
			*/
			
			// String Url = "jdbc:mysql://localhost:3330/employees";를 쓸 때!
			sql = "select emp_no, birth_date from employees";
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			if (rs != null) {
				while(rs.next()) {
					System.out.println(rs.getInt("emp_no") + "\t");
					System.out.println(rs.getString("emp_no"));
				}
			
			}
			
			pstmt.executeUpdate();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	
		
	}

}
