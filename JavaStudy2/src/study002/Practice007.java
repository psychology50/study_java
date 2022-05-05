package study002;

class A {

	@Override				// right click -> Source -> Override / implement Method
	public String toString() {

		return "A클래스로 만든 객체입니다.";
	}
	
	
}

public class Practice007 {
	
	public static void main(String[] args) {
		Object ob1 = new Object();
		System.out.println(ob1.toString());			// *** equals(Object obj) / hashCode() / toString()
		// java.lang.Object@2b80d80f   (객체 생성 클래스)@(객체 주소 = hashCode)
		
		A ob2 = new A();
		System.out.println(ob2.toString());
		// study001.A@2eee9593 (class A가 공란이었을 때 출력값)
		// A클래스로 만든 객체입니다.
	}		

}
