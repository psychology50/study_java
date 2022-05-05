package dataBase;

import java.sql.SQLException;

// 테이블 생성 
class DBCreate extends DB {
	// 테이블 생성 메서드
	// 생성할 테이블 이름과 생성하는 sql 문을 매개 변수로 받음.
	public void createTable(String tableName, String sql) {
		try {
			// 테이블 존재유무 확인
			String tableSql = "show tables";
			boolean isTable = false;
			
			// 아래 두 항목은 부모 클래스에서 정의
			// SQL문을 전송할 수 있는 PreparedStatement 객체를 생성
			pstmt = conn.prepareStatement(tableSql); // 쿼리 실행 준비
			rs = pstmt.executeQuery(); // 쿼리 실행 후 결과 받음
			
			while(rs.next()) {
				if (tableName.equals(rs.getString(1))) { // 동일한 테이블이 존재하는 경우
					isTable = true;
				}
//				System.out.println(tableName);
//				System.out.println(rs.getString(1));
				
				if(isTable == true) { // 테이블이 존재하는 경우
					System.out.println(tableName + "이란 이름의 테이블이 존재합니다.");
				}
				else { // 테이블이 없는 경우 생성한다.
					pstmt = conn.prepareStatement(sql); // 쿼리 실행 준비'
					rs = pstmt.executeQuery(); // 쿼리 실행 후 결과 받음
					System.out.println(rs);
					System.out.println(tableName + " 테이블 생성에 성공하셨습니다.");
				}
					
				
			}
			}
			catch (Exception e) {
				System.out.println("db connect err : " + e);
			}
	}
}

public class DB_Create {
	public static void main(String[] args) throws SQLException {
		DBCreate myDB = new DBCreate();
		myDB.connectDB();
		String sql = " CREATE TABLE tb_user (id VARCHAR(100) COLLATE utf8_general_ci, name VARCHAR(100) COLLATE utf8_general_ci, "
					 + "age INT, job VARCHAR(100) COLLATE utf8_general_ci)";
		myDB.createTable("tb_user", sql);
		myDB.closeDB();
	}

}
