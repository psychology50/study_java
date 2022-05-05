package study003;

public class Practice017 {
	
	public static void main(String[] args) {
		StringBuffer str1 = new StringBuffer("JAVA");
		
		String str2 = new String("Java Server Page");
		String str3 = new String("Spring FramWork");
		System.out.println(str1);
		System.out.println("처음위치 : "+System.identityHashCode(str1));
		str1 = str1.append(str2);	// 반복적인 작업에선 append가 효율적이다.
		System.out.println(str1);
		System.out.println("1회 붙임 : "+System.identityHashCode(str1));
		str1 = str1.append(str3);
		System.out.println(str1);
		System.out.println("2회 붙임 : "+System.identityHashCode(str1));
				
	}
}
