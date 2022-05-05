package javaPractice01;

import java.util.Scanner;

public class Practice43 {
	
	static int max(int a, int b) {
		//return이 여러 번 나와도 된다
		if ( a > b)
			return a;
		else
			return b;
	}	
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수 a : "); int a = stdIn.nextInt( );
		System.out.print("정수 b : "); int b = stdIn.nextInt( );
		
		System.out.print("최대값은 " + max(a, b) + "입니다.");
	}

}
