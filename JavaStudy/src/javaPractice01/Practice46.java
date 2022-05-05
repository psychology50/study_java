package javaPractice01;

import java.util.Scanner;

public class Practice46 {
	
	// --- 문자 '*'을 n개 연속 표시 --- //
	// void 메소드
	static void putStars(int n) {
		while (n-- > 0)
			System.out.print('*');
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in); // Scanner 객체명 = new Scanner(System.in); , System.in : 키보드에서 입력 받는다.
		
		System.out.println("좌하변이 직각인 직각삼각형을 표시합니다.");
		System.out.println("몇 단 : ");
		int n = stdIn.nextInt( ); // 입력받은 데이터 값을 해당 타입으로 반환한다.
		
		for (int i = 1; i <= n; i++) {
			putStars(i);
			System.out.println();
		}
	}

}
