package javaPractice01;

import java.util.Random;
import java.util.Scanner;

public class Practice44 {
	
	static Scanner stdIn = new Scanner(System.in);
	
	// --- 지속 여부의 확인 --- //
	// 매개변수를 전달받지 않는 메소드
	static boolean confirmRetry( ) { // 매개변수를 전달받지 않음
		int cont;
		do {
			System.out.print("다시 한 번? <Yes-1/No-0> : ");
			cont = stdIn.nextInt( );
		} while (cont != 0 && cont != 1);
		return cont == 1; // cont가 1이면 true, 아니면 false
	}
	
	public static void main(String[] args) {
		Random rand = new Random( );
		
		System.out.println("암산 트레이닝");
		do {
			int x = rand.nextInt(900) + 100;	// 3자릿수의 수
			int y = rand.nextInt(900) + 100;
			int z = rand.nextInt(900) + 100;
			
			while (true) {
				System.out.print( x + " + " + y + " + " + z + " = ");
				int k = stdIn.nextInt( );
				if ( k == x + y + z)
					break;
				System.out.println("틀렸습니다!!");
			}
		} while (confirmRetry( ));
	}

}
