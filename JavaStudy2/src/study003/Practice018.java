package study003;

public class Practice018 {
	
	public static void main(String[] args) {
		
		// Boxing (기본 자료형 -> Integer 자료형 변환)
		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer("200");
		Integer obj3 = Integer.valueOf("300");
		
		// UnBoxing (Integer 자료형 -> 기본자료형)
		int val1 = obj1.intValue();
		int val2 = obj2.intValue();
		int val3 = obj3.intValue();
		
		// 확인
		System.out.printf("%d\n", val1);
		System.out.printf("%d\n", val2);
		System.out.printf("%d\n", val3);
	}

}
