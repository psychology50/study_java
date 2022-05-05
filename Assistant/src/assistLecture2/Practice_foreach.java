package assistLecture2;
import java.util.Scanner;

// for each문
// def. 배열을 순환시킬 때, 반복문보다 편리하게 순환시키는 문법.

/*
   for (자료형 변수형 : 배열명) {
   		변수가 배열을 순환하면서 반복할 명령;
   }
  
 */

public class Practice_foreach {
	
	public static void main(String[] args) {
		
		System.out.println("============ [1] ============\n");
		// (1) StringType for each
		String a[] = { "Java", "Hello", "Programing" };
		for(String i:a) {
			System.out.println(i);
		}
		
		System.out.println("\n============ [2] ============\n");
		// (2) IntType for each
		int b[] = { 1,2,3,4,5 };
		for(int i:b) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		System.out.println("\n============ [3] ============\n");
		// (3) 예제 : 3개의 과일을 저장하는 문자열 fruits[] 배열 생성 후,
	    //			  사용자에게 3개의 과일의 이름을 입력 받아 배열에 저장하고 출력
		Scanner sc = new Scanner(System.in);
		String fruits[] = new String[3];
		
		for(int i=0; i<fruits.length; i++) {	// 값을 입력 받는 for문
			System.out.println((i+1) +"번 째 주문할 과일 : ");
			fruits[i] = sc.next();
		}
		
		for(String array_print:fruits) {
			System.out.print(array_print + " ");
		}
		
		
		// byte 배열로 읽기
		// 자료를 read() 메소드로 한 바이트씩 읽는 것보다 배열을 사용해서 한꺼번에 많이 읽으면 처리 속도가 훨씬 빠르다.
		// read(byte[] b) 메서드는 선언한 바이트 배열의 크기만큼 한꺼번에 자료를 읽는다.
		// 그리고 읽어들인 자료의 수를 반환한다.
				
		
		
		
	}

}
