package study06;

// 내부 클래스 특징
// 1. 코드를 간결하게 만들 수 있다.
// 2. 하나의 클래스 내부에 클래스를 감추어 캡슐화할 수 있게 된다.
// 3. private를 걸어 다른 클래스에서 접근 자체를 막을 수 있다.

// 인스턴스 클래스 : Method인데 static이 붙어있지 않은 클래스(라고 보면 됨)
// 스태틱 클래스 : 인스턴스 클래스와 반대적인 개념
// 지역 클래스

class A {
	static class StaticInner{} // static 내부 클래스
	
	class InstanceInner{} // 내부 클래스 스태틱 멤버간의 접근 가능
	
	StaticInner st1 = new StaticInner();
	
	// 인스턴스 멤버간의 접근 가능
	InstanceInner ii1 = new InstanceInner();
	// ======== 여기까진 두 개의 다른 종류의 내부 클래스의 차이점이 드러나지 않음 ========= //
	
	static void StaticMethod( ) {
		// 스태틱 멤버가 스태틱 내부 클래스에 접근 가능
		StaticInner st2 = new StaticInner();
		
		// 스태틱 멤버는 인스턴스 멤버에 접근 불가 // static : 메모리 공간을 따로 할당받아 사용한다. 
		// InstanceInner ii2 = new InstanceInner(); // error
	}
	
	void instanceMethod() {
		// 인스턴스 멤버는 모두 접근 가능
		StaticInner st3 = new StaticInner();
		
		InstanceInner ii3 = new InstanceInner();
	}
}

public class Practice035 {
	
	public static void main(String[] args) {
		
	}

}
