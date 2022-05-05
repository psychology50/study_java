package study06;

class OuterClass {
	int a = 3;
	static int b = 4;
	
	class Inner {	// 내부 클래스
		int c = 5;
		public void innerMethod() {
			System.out.println("<Inner Class>");
		}
	}
	
	static class StaticInner { // static 내부 클래스
		int d = 6;			 // static 클래스 안에 있어도 static 메모리에 올라가지 않는다. 인스턴스 변수는 기본적으로 힙 영역으로 올라간다.
		static int stat = 10;
		public static void staticMethod() {
			System.out.println("<Static Inner>");
		}
	}
}

public class Practice036 {
	
	public static void main(String[] args) {
		OuterClass oc = new OuterClass();
		System.out.println("OuterClass의 a값 = " + oc.a); // 3
		
		// static 변수라서 클래스명으로 접근 가능
		System.out.println("OuterClass의 b값 = " + OuterClass.b); // 4
		System.out.println("OuterClass의 StaticInner의 stat값 = " + OuterClass.StaticInner.stat); // 10
		//System.out.println("OuterClass의 d값 = " + OuterClass.StaticInner.d); // 아무리 static 클래스 안에 있어도 d는 인스턴스 변수이므로 객체를 만들어주어야 접근 가능하다.
		
		System.out.println("\n============= inner 클래스 접근하기 =============\n");
		OuterClass oc2 = new OuterClass();
		OuterClass.Inner i = oc2.new Inner();
		
		System.out.println("Inner의 c값 = " + i.c); // 5
		i.innerMethod(); // <Inner Class>
		
	    OuterClass.StaticInner si = new OuterClass.StaticInner();
	    System.out.println("StaticInner의 d값 = " + si.d); // 6
	    
	    // 객체를 사용해서 접근
	    si.staticMethod();// <Static Inner>
	    
	    // 클래스명으로 접근 : static에 접근 시, 이 방법 추천
	    OuterClass.StaticInner.staticMethod(); // <Static Inner>
		
	}

}
