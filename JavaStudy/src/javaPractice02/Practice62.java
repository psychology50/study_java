package javaPractice02;

class Student2 {
	void learn() {
		System.out.println("배우기");
	}
	void eat() {
		System.out.println("밥먹기");
	}
	void say() {
		System.out.println("선생님 안녕하세요!"); // 보통의 학생
	}
}

class Leader extends Student2 {
	void lead() {
	}
	void say() {
		System.out.println("선생님들께 인사"); // 오버라이딩
	}
}

public class Practice62 {
	
	public static void main(String[] args) {
		Leader leader1 = new Leader();
		leader1.eat(); // 상속받은 메서드 사용
		leader1.say(); // 오버 라이딩한 메서드 사용		
	}

}
