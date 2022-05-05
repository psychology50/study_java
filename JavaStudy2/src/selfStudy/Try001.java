package selfStudy;

// 오버라이딩과 오버로딩

class Parent {
	void display() {
		System.out.println("부모 클래스의 display() 메소드입니다.");
	}
}

class Child extends Parent {
	void display() {
		System.out.println("자식 클래스의 display() 메소드입니다."); // 오버라이딩된 display() 메소드
	}
	void display(String str) {
		System.out.println(str); // 오버로딩된 display() 메소드
	}
}

public class Try001 {
	
	public static void main(String[] args) {
		Child ch = new Child();
		ch.display();
		ch.display("오버로딩된 display() 메소드입니다.");
	}

}
