package javaPractice01;
import java.util.Scanner;

public class Practice10 {
	
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		int age;
		// 1)  정수로 받음
		// age = input.nestInt();
		
		// 2) 문자열로 입력받은 후에 정수화
		String tmp;
		tmp = input.nextLine();
		age = Integer.parseInt(tmp);
		
		if (age > 19) {
			System.out.println("성인입니다.");
			System.out.println("성인 요금이 적용됩니다.");
		} else if (age > 13) {
			System.out.println("청소년입니다.");
			System.out.println("청소년 요금이 적용됩니다.");
		} else if (age > 8) {
			System.out.println("어린이입니다.");
			System.out.println("어린이 요금이 적용됩니다.");
		} else {
			System.out.println("유아입니다.");
			System.out.println("유아 요금이 적용됩니다.");
		}
		
		System.out.println("결제를 진행해 주세요.");
	
	}	

}
