package javaPractice01;

public class Practice07 {
	
	public static void main(String[] args) {
		int a = 15;	// 1111
		int b = 5;  // 0101
		
		System.out.println(a|b); //1111
		System.out.println(a&b); //0101
		System.out.println(a^b); //1010
		
		System.out.println(a>>2); //1111 -> 0011
		System.out.println(b<<4); //0101 -> 01010000
		System.out.println();
		
		int age = 23;
		System.out.println(age > 19 ? "성인입니다.":"청소년입니다.");
		System.out.println();
		
		int i = 3;
		int j = 5;
		
		j = i;
		System.out.println(j);
		
		i += 1;
		System.out.println(i);
		i /= 2;
		System.out.println(i);
		i *= i;
		System.out.println(i);
		
	}
	
}
