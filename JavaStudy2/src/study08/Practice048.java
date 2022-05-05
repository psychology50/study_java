package study08;

import java.util.*;

public class Practice048 {
	
	public static void main(String[] args) {
		// Scanner Test
		// 표준 입력 System.in을 사용하면 바이트 단위 자료만 처리할 수 있지만 Scanner는 다양한 자료형 입력이 가능하다.
		
		// 표준 입력을 매개변수로 Scanner 클래스를 생성
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름: ");
		String name = sc.nextLine(); // nextLine() : 문자열 입력
		System.out.print("직업: ");
		String job = sc.nextLine(); 
		System.out.print("사번: ");
		int num = sc.nextInt(); 	 // nextInt()  : 정수 입력
		
		System.out.println(name);
		System.out.println(job);
		System.out.println(num);
	}

}
