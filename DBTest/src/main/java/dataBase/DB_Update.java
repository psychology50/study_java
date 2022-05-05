package dataBase;

import java.sql.SQLException;
import java.util.Scanner;

class DBUpdate extends DBSelect {
	private User modifyUser()
	{
		User user = new User();
		Scanner scanner = new Scanner(System.in);
		
		boolean validate = false;
		String validateTemp;
		do {
			System.out.println("정보 수정할 회원의 아이디를 입력하세요: ");
			user.userID = scanner.nextLine();
			System.out.println("회원의 이름을 입력하세요: ");
			user.name = scanner.nextLine();
			System.out.println("회원의 나이를 입력하세요: ");
			user.age = Integer.parseInt(scanner.nextLine());
			System.out.println("회원의 직업을 입력하세요: ");
			user.job = scanner.nextLine();
			
			System.out.println("수정된 회원 : " + user.userID + " / " + user.name + " / " + user.age + " / " + user.job +"이 맞습니까? (Y/N)");
			validateTemp = scanner.nextLine();
			
			// 입력 값이 Y가 아닌 경우 true, 같은 경우 false로 반환
			validate = !validateTemp.equals("Y");
		} while(validate);
		
		scanner.close();
		return user;
	}
	
	public void updateUser() throws SQLException {
		User user = modifyUser();
		String updateSQL = " UPDATE tb_user SET name = '" + user.name + "', age = '"
						   + user.age + "',job'" + user.job + "' WHERE id = '" + user.userID + "'";
//		System.out.println(updateSQL);
		
		pstmt = conn.prepareStatement(updateSQL); // 쿼리 실행 준비
		int rs = pstmt.executeUpdate(); // 영향을 받은 데이터 개수 반환
//		pstmt.executeQuery() : select
//		pstmt.executeUpdate() : insert, update, delete
		
		if(rs > 0) {
			System.out.println("영향 받은 데이터 :" + rs);
			System.out.println("데이터 수정에 성공하셨습니다.");
		}
		else {
			System.out.println("데이터 수정에 실패하셨습니다.");
		}
	}
}

public class DB_Update {
	
	public static void main(String[] args) throws SQLException {
		DBUpdate myDB = new DBUpdate();
		myDB.connectDB();
		myDB.updateUser();
		
		String sql = "SELECT * FROM tb_user";
		myDB.printTablePerson(sql);
		myDB.closeDB();
	}

}
