package study003;

public class Practice019 {
	
	public static void main(String[] args) {
		// 자동 Boxing
		Integer obj = 100;
		System.out.println("value : "+ obj.intValue());
		
		// 자동 UnBoxing
		int val = obj;
		System.out.println("value : "+ val);
				
		// 자동 UnBoxing
		int val2  = obj + 100;
		System.out.println("value : "+ val2);
		
		int num1 = Integer.parseInt("123");
		double num2 = Double.parseDouble("123.456");
	}

}
