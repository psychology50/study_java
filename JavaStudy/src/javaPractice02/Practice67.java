package javaPractice02;

class A {
	void methodA() {
		System.out.println("methodA");
	}
}

class B extends A {
	void methodB() {
		System.out.println("methodB");
	}
}

public class Practice67 {
	public static void main(String[] args) {
		
		A obj = new B(); // 부모 클래스의 타입으로 객체를 생성할 수 있다. (다형성)
		obj.methodA();
		//obj.methodB(); // error 발생
	}

}
