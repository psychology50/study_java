package assistLecture;
import java.util.Scanner;

//4. while문
/*   · 구조식
		while (조건식) { 			
			<조건식이 참일 동안 반복할 명령>;
		}
		
	 <for과 while의 차이>
	 · for문은 구체적으로 반복할 횟수를 알고 있을 때 주로 사용한다!!
	 · 반면, while문은 몇 번 반복될지는 모르지만 특정 상황에 반복문을 멈추게 하고 싶을 때 주로 사용한다.
*/

public class Practice_while {
	public static void main(String[] args) {
		
		// [1] 기본적인 구조
		int x = 1;
		while (x < 10) {
			System.out.println("x: " + x);
			x++;
		}
		
		// [2] 조건식의 변화
		System.out.println("======== [2] ========");
		int y = 1;
		
//		if(TorF(y) == true)				// 이해할 필요 없는 부분입니다!!
//			System.out.println("True"); // y가 true값을 반환한다는 것을 보여주기 위한 코드입니다.
//		else
//			System.out.println("False");
		
		while (y != 10) {		// y가 10이 아닐 때 true값이 반환되어 반복한다. 즉, y가 9면 멈춘다.
			System.out.println("y : " + y);
			y++;
		}
		
		// [3] 조건문 응용
		Scanner sc = new Scanner(System.in);
		String answer = "Y"; // while문이 실행되도록 초기값을 조건이 참일 값을 넣어준다.
		int count = 0;
		
		while(answer.equals("Y")) { // Y가 아니면 false값이 반환되어 반복문이 종료됨.
			System.out.println("음악을 재생하시겠습니까?(Y)");
			answer = sc.nextLine();
			
			if(answer.equals("Y")) {
				System.out.printf("음악을 %d번 재생했습니다.\n", ++count);
			}
		}
		
		
	}
	
	
	
	
	public static boolean TorF(int num) { // boolean으로 y가 10이 아니면 true값을 반환하는 함수
		return (num != 10);
	}

}
