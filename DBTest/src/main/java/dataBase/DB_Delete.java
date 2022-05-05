package dataBase;

import java.sql.SQLException;
import java.util.Scanner;

class DBDelete extends DBSelect {
	public void DeletUser() throws SQLException {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("삭제할 유저의 아이디를 입력하세요: ");
		String userID = scanner.nextLine();
		
		String deleteSQL = " DELETE FROM TB_USER WHERE ID = '" + userID + "'";
		
		pstmt = conn.prepareStatement(deleteSQL); // 쿼리 실행 준비
		int rs = pstmt.executeUpdate(); // 영향을 받은 데이터 개수 반환
		
		if(rs==1) {
			System.out.println("영향을 받은 데이터 : " + rs);
			System.out.println("데이터 삭제에 성공하셨습니다.");
		}
		else {
			System.out.println("데이터 삭제에 실패하셨습니다.");
		}
		
		scanner.close();
	}
}

public class DB_Delete {
	public static void main(String[] args) throws SQLException {
		DBDelete myDB = new DBDelete();
		myDB.connectDB();
		myDB.DeletUser();
		
		String sql = "SELECT * FROM tb_user ";
		myDB.printTablePerson(sql);
		myDB.closeDB();
		
	}
}
