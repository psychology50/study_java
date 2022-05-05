package assistLecture6;
/*
 두 정수 left와 right가 매개변수로 주어진다. // 매개변수가 left, right인 함수를 만들어라. (int Type)
 left 부터 right까지의 모든 수들 중에서, 	 // 'left 부터 right까지' -> left ~ right 사이의 수
 약수의 개수가 짝수인 수는 더하고,			 
 약수의 개수가 홀수인 수는 뺀 수를 			 // 각각의 값의 약수 개수를 구하는 코드 구현 후, 짝/홀 판단. 짝수인 수는 더하고, 홀수인 수는 뺄 것.
 return 하도록 solution 함수를 완성하라. 	 // return 값이 있어야 한다. (=void X)
  
 */

import java.util.Scanner;

public class Practice_solution_a {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 수를 입력해주세요: ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 수를 입력해주세요: ");
		int num2 = sc.nextInt();	
		
		
		System.out.println();
		int result = solution(num1, num2); 
		
		System.out.println("결과 값은 " + result + " 입니다.");
	}
	
	public static int solution(int left, int right) {
		
		int total = 0; 

		if(left <= right) {
			for(int i = left; i <= right; i++) {
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
