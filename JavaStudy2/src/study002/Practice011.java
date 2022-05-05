package study002;

public class Practice011 {
	
	public static void main(String[] args) {
		Object ob1 = new Object();
		Object ob2 = new Object();
		
		System.out.println(ob1);
		System.out.println(ob1.toString());
		System.out.println(ob1.hashCode());
		System.out.printf("%x\n", ob1.hashCode()); // 객체 주소
	}

}
