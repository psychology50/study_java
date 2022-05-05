package dataBase;

import java.sql.ResultSet;
import java.sql.SQLException;

class DBSelect extends DB {
	// 추가된 코드
	public ResultSet querySelect(String sql) { // select 실행
		try {
			pstmt = conn.prepareStatement(sql); // 쿼리 실행 준비
			
			rs = pstmt.executeQuery(); // SELECT 수행 시 executeQuery() 사용
		}
		catch (SQLException e) {
			System.out.println("error." + e);
		}
		return rs;
	}
	
	public void printTablePerson(String sql) throws SQLException {
		ResultSet rs = querySelect(sql);
		int num = 1;
		// 데이터의 처음부터 읽어오브로 next를 만나면 한 줄을 읽어오고, 다음 줄로 내려간다.
		// 실행하면 한 줄 한 줄 내려가면서 데이터를 가져오고, 데이터가 끝까지 가면 종료된다.
		while(rs.next()) {
			System.out.println(num + "번째 회원");
			System.out.println("아이디 : " + rs.getString(1));
			System.out.println("이름 : "   + rs.getString(2));
			System.out.println("나이 : "   + rs.getString(3));
			System.out.println("직업: "    + rs.getString(4));
			System.out.println();
			num++;
		}
	}
}

public class DB_Select {
	public static void main(String[] args) throws SQLException {
		DBSelect myDB = new DBSelect();
		myDB.connectDB();
		String sql = "SELECT * FROM tb_user";
		myDB.printTablePerson(sql);
		myDB.closeDB();
	}

}
