package study06;

class OuterClass1 { // a와 b라는 메서드를 가진 클래스
	void a() {
		System.out.println("method a");
	}
	void b() { }
}

class OuterClass2 extends OuterClass1 {	
	void a() {
		System.out.println("새롭게 정의한 익명 클래스의 메서드 입니다.");
	}
}		// 만약 a()의 오버라이딩이 빈번하면 새로운 클래스를 만들어서 사용하는 것이 맞다.


public class Practice037 {
	
	public static void main(String[] args) {
		// 익명 클래스 : 이렇게 만드지 않았으면 또 다른 클래스에 a를 상속받아 재정의를 한 후에 사용하는 과정을 했어야 했다.
		//				 내부, 익명 클래스들의 장점은 나중에 확인할 때, 해당 클래스의 중요도를 쉽게 알아볼 수 있다.
		 OuterClass1 o = new OuterClass1() {
			 void a() {
				 // 익명 클래스 안에 있는 메서드는 객체o를 통해서만 가능하다.
				 System.out.println("새롭게 정의한 익명 클래스의 메서드입니다.");
			 } // 익명 클래스는 반드시 마지막에 ;를 붙여야 한다.
		 };
		 
		 // 익명 클래스로 오버라이드한 메서드를 출력
		 o.a(); // 새롭게 정의한 익명 클래스의 메서드 입니다.
		 
		 OuterClass1 ok = new OuterClass1();
		 o.a(); // 새롭게 정의한 익명 클래스의 메서드입니다.
		 
		 // 익명 클래스는 일회용이므로 다시 기존의 메서드가 출력
		 ok.a(); // method a
		 
		 OuterClass2 ot = new OuterClass2();
		 ot.a();
	}

}
