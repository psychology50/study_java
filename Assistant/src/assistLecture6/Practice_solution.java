package assistLecture6;
/*
 두 정수 left와 right가 매개변수로 주어진다. // 매개변수가 left, right인 함수를 만들어라. (int Type)
 left 부터 right까지의 모든 수들 중에서, 	 // 'left 부터 right까지' -> left ~ right 사이의 수
 약수의 개수가 짝수인 수는 더하고,			 
 약수의 개수가 홀수인 수는 뺀 수를 			 // 각각의 값의 약수 개수를 구하는 코드 구현 후, 짝/홀 판단. 짝수인 수는 더하고, 홀수인 수는 뺄 것.
 return 하도록 solution 함수를 완성하라. 	 // return 값이 있어야 한다. (=void X)
  
 */

// 우선, 함수를 만들기 전에 main에 코드를 구현 해보자 => 그 다음에 함수로 분리시킨다.
//    >>> 약수를 구하는 코드   
import java.util.Scanner;

public class Practice_solution {
	public static void main(String[] args) {
		
		/* 
	    1. 약수를 구하는 코드 => main에서 제대로 돌아가는 걸 확인했으니 함수에 옮겨서 적용해보면 됩니다.
	    
		Scanner sc = new Scanner(System.in);
		System.out.println("수를 입력하시오 : ");
		
		int num = sc.nextInt();
		int count = 0;
		
		System.out.println(num + "의 약수 개수 구하기");
		for(int i = 1; i <= num; i++) {
			if(num % i == 0) {
				System.out.println(i + " ");
				count++;
			}
		}
		System.out.println(num + "의 약수 개수는 " + count + "개 입니다.");
		*/
	
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 수를 입력해주세요: ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 수를 입력해주세요: ");
		int num2 = sc.nextInt();	
		
		
		System.out.println();
		int result = solution(num1, num2); // solution 함수에 값을 넘긴다. 그리고 return된 값을 result int type variable에 받아서 저장한다.
		
		System.out.println("결과 값은 " + result + " 입니다.");
	}
	
	public static int solution(int left, int right) { // 매개변수는 문제에 주어진 left, right 변수명으로 작성
		
		int total = 0; // 더하고 뺀 값을 할당받고, 최종적으로 값을 리턴시켜줄 변수
		
		// 고려할 것...left값이 right 값보다 클 경우
		
		// 1. 약수 개수 구하기
		if(left <= right) { // left 값이 right 보다 작은 경우
			for(int i = left; i <= right; i++) { // 처음에 초기값인 left를 i에 담고, right까지 반복한다.
				int count = 0; // count를 여기에 선언하는 이유: 반복문이 돌아올 때마다, 값을 초기화 하기 위함.
				System.out.printf("%d의 약수 : ", i);
				for(int j = 1; j <= i; j++) { // j를 0으로 하면...if 조건문에 i % j에서 0으로 나눈다고 에러 뜹니다. 예외 처리를 쓸 게 아니라면 그냥 1을 넣으면 됩니다.
					if(i % j == 0) {	// i % j == 0 이다. (=짝수) (=해당 값의 약수이다.)
						System.out.printf("%d, ", j); // 잘 작동하는지 체크하기 위해서 약수 출력
						count++; // if문이 실행될 때마다 count값 1씩 증가시켜서 약수 개수 파악
					}
				}
				
				if (count % 2 == 0) { // count(=약수 개수)가 짝수면 total값에 더하고, 아니라면 빼기
					total += i;
				}
				else {
					total -= i;
				}
				
				System.out.println("\n");
			}
			
		}
		else { // right 값이 left 보다 작은 경우			
			for(int i = right; i <= left; i++) {
				int count = 0;
				System.out.printf("%d의 약수 : ", i);
				for(int j = 1; j <= i; j++) {
					if(i % j == 0) {
						System.out.printf("%d, ", j);
						count++;
						
					}
				}

				
				if (count % 2 == 0) {
					total += i;
				}
				else {
					total -= i;
				}
				
				System.out.println("\n");
			
			}
		}
		
		
		return total; // total값 main에 반환
	}

}
