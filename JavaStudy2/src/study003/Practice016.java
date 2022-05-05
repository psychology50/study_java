package study003;

public class Practice016 {
	
	public static void main(String[] args) {
		String str1 = new String("JAVA");
		String str2 = new String("Java Server Page");
		String str3 = new String("Spring FramWork");
		System.out.println(str1);
		System.out.println("처음위치 : "+System.identityHashCode(str1));
		str1 = str1.concat(str2);	// concat : 문자열 이어 붙이기. 반복적인 작업에서 다소 비효율적이다. 메모리 할당량을 지속적으로 추가시켜줘야 하기 때문.
		System.out.println(str1);
		System.out.println("1회 붙임 : "+System.identityHashCode(str1));
		str1 = str1.concat(str3);
		System.out.println(str1);
		System.out.println("2회 붙임 : "+System.identityHashCode(str1));
				
		
		
	}

}

