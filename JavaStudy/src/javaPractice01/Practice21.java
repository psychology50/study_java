package javaPractice01;

import java.util.*;

public class Practice21 {
	
	public static void main(String[] args) {
		int money = 10000;
		System.out.println("현재 가진 돈은 "+money+"원입니다.");
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("얼마를 사용하시겠습니까?");
			int i = sc.nextInt(); // 정수입력
			
			if (!(i >= 0 && i <= money)) {
			// if (i < 0 || i > money) {
			// 현재 가진 돈보다 크거나, 음수를 입력하면 다시 입력 요구
				System.out.println("잔액이 부족합니다.");
				continue; // 현재의 반복을 벗어나서 다시 반복을 시작
			}
			
			money -= i;
			System.out.println("이제 "+money+"원이 남았습니다.");
			// printf는 포매팅을 입력할 때 사용
			// println은 '\n'을 내장하고 있음. 포매팅 사용 불가능
			if (money == 0) {
				break;
			}					
		}
		System.out.println("통장이 비었습니다.");
	}
	
	

}
