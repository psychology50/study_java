package study004;

import java.util.Scanner;
import study04_Controller.FrontController;

public class Practice027_Index {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FrontController fcontroller = FrontController.getInstance();
		
		while(true) {
			System.out.println("------------- M E N U -------------");
			System.out.println("1. 회원 가입");
			System.out.println("2. 회원 조회");
			System.out.println("3. 회원 수정");
			System.out.println("4. 회원 탈퇴");
			System.out.println("5.   종 료");
			System.out.println("------------- M E N U -------------");
			System.out.println("NO : ");
			String No = sc.nextLine();
			fcontroller.Forwarder(No);
			
		}
	}

}

// 순서
// index -> FrontController -> (1 선택시) memberJoinController -> memberDAO -> memberDTO(dao와 의존관계) // 다시 역순으로 돌아가 출력한다.