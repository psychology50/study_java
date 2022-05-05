package javaPractice01;

public class Practice45 {
	
	static int sum (int a, int b) {
		System.out.println("인자가 둘인 경우 호출됨");
		return a + b;
	}
	
	static int sum (int a, int b, int c) {
		System.out.println("인자가 셋인 경우 호출됨");
		return a + b + c;
	}
	
	static double sum (double a, double b, double c) {
		System.out.println("double 타입인 경우 호출됨");
		return a + b + c;
	}
	
	public static void main(String[] args) {
		System.out.println(sum(3, 2));
		System.out.println(sum(2, 3, 4));
		System.out.println(sum(2.5, 3.5, 4.5));
	}

}
