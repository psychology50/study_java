package dataBase;

import java.sql.SQLException;
import java.util.Scanner;

class User { // 회원 데이터 정의. 모델 클래스
	public String userID;
	public String name;
	public int age;
	public String job;
}

// 인서트
class DBInsert extends DB {
	private User setUser()
	{
		User user = new User();
		Scanner scanner = new Scanner(System.in);
		
		boolean validate = false;
		String validateTemp;
		do {
			System.out.println("신규 회원의 아이디를 입력하시오(영어 or 숫자) : ");
			user.userID = scanner.nextLine();
			System.out.println("신규 회원의 이름을 입력하시오 : ");
			user.name = scanner.nextLine();
			System.out.println("신규 회원의 나이를 입력하시오(only 숫자) : ");
			user.age = Integer.parseInt(scanner.nextLine());
			System.out.println("신규 회원의 직업을 입력하시오: ");
			user.job = scanner.nextLine();
			
			System.out.println("신규 회원 : " + user.userID + " / " + user.name + " / " + user.age + " / " + user.job + "이 맞습니까? (Y/N)");
			validateTemp = scanner.nextLine(); // 입력값 저장
			
			validate = !validateTemp.equals("Y"); // 입력 값이 Y가 아닌 경우 true, 같은 경우 false 반환
//			System.out.println(validate);
		} while (validate);
		
		scanner.close();
		return user;
	}
	
	public void insertUser() throws SQLException {
		User user = setUser();
		String insertSql = "INSERT INTO tb_user (id, name, age, job) VALUES" + "( '" + user.userID + "', '" + user.name + "', '" + user.age + "', '" + user.job + "' )";
		pstmt = conn.prepareStatement(insertSql); // 쿼리 실행 준비
		int rs = pstmt.executeUpdate(); // 영향을 받은 데이터 개수 반환
		//pstmt.executeQuery() : select
		//pstmt.executeUpdate() : insert, update, delete
		
		if(rs==1) {
//			System.out.println(rs);
			System.out.println("데이터 입력에 성공하셨습니다.");
		}
		else {
			System.out.println("데이터 입력에 실패하셨습니다.");
		}
	}
}



public class DB_Insert {
	
	public static void main(String[] args) throws SQLException {
		DBInsert myDB = new DBInsert();
		myDB.connectDB();
		myDB.insertUser();
		myDB.closeDB();
		
	}
	
}
