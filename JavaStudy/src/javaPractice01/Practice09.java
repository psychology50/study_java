package javaPractice01;

public class Practice09 {
	
	public static void main(String[] args) {
		int age = 15;
		
		if (age > 19) {
			System.out.println("성인입니다.");
			System.out.println("성인 요금이 적용됩니다.");
		} else {
			System.out.println("청소년입니다.");
			System.out.println("청소년 요금이 적용됩니다.");
		}
		System.out.println("결제를 진행해 주세요.");
		System.out.println();
		
		int age1 = 15;
		
		if (age1 <= 19) {
			System.out.println("성인이 아닙니다.");
			System.out.println("청소년 요금이 적용됩니다.");
		} else {
			System.out.println("청소년이 아닙니다.");
			System.out.println("성인 요금이 적용됩니다.");
		}
		System.out.println("결제를 진행해 주세요.");
	}

}
