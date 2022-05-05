package javaPractice01;

import java.util.Scanner;

public class Practice42 {
	
	// 세 정수값의 최대값을 구하기(메소드를 이용)
	static int max(int a, int b, int c) {
		int max = a;
		if (b > max) max = b;
		if (c > max) max = c;
		return max;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수 a : "); int a = stdIn.nextInt( );
		System.out.print("정수 b : "); int b = stdIn.nextInt( );
		System.out.print("정수 c : "); int c = stdIn.nextInt( );
		
		System.out.print("최대값은 " + max(a, b, c) + "입니다.");
	}

}
