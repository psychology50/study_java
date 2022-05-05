package javaPractice01;

import java.util.*;

public class Practice18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String answer = "Y"; //while이 시작될 수 있또록 응답값을 초기화
		int count = 0;
		
		while (answer.equals("Y")) {
			System.out.println("음악을 재생하시겠습니까?(Y)");
			answer = sc.nextLine(); //사용자의 응답을 받습니다.
			
			/*
			if (answer.equals("Y")) {
				System.out.printf("음악을 %d번 재생했습니다.\n", ++count);
			}
			*/
			
			if (answer.equals("Y")) {
				++count;
				System.out.println("음악을 "+ count +"번 재생했습니다..");
			}
			
			if (count == 5) {
				System.out.println("재생을 종료하겠습니다.");
				break;
			}	
			
		}
	
	}
}