package assistLecture;

// 1. 제어문 : 프로그램의 흐름을 제어하는 문법

// 2. 종류
//    (1) 조건문 (if, switch) : 정해진 조건에 따라 흐름을 제어
//	  (2) 반복문 (for, while, do-while) : 정해진 조건에 따라 흐름을 반복

// 3. for문
/*    · 구조식
		for(초기식 ; 조건식 ; 증감식) {
			<초기식에 선언된 변수가 조건식이 참일 동안 반복할 명령>;
		}
*/

public class Practice_for {
	
	public static void main(String[] args) {
		
		// [1] 기본적인 구조
		for(int i=1; i < 10; i++) {
			System.out.println("i : " + i);
		}
				
		// [2] 조건식, 증감식의 변화
		System.out.println("======== [2] ========");
		for(int i=0; i != 10; i += 2) {        // 말그대로 조건식이기 때문에 꼭 범위가 아니어도 된다.
			System.out.println("i : " + i); // 하지만 이런 형태로 쓰이는 경우는 드물기 때문에 원리만 이해하면 ok!
		}
		
		System.out.println("======== 역순 ========");
		for(int i=10; i > 0; i--) {
			System.out.println("i : " + i);
		}
		
		
		// * 예제1 * : 짝수만 출력하는 반복문
		System.out.println("======== * 예제 * ========");
		for(int i = 1; i <= 20; i++) {
			if(i % 2 == 0) {
				System.out.print(i + ", ");
			}		
		}
			
		// * 예제2 * : 반복되는 값을 더해주는 코드
		System.out.println("\n======== * 예제 * ========");
		int sum = 0;
		for(int i = 0; i<10; i++) {
			System.out.println(sum += i);
		}
			
	}

}
