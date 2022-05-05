package javaPractice02;

class Leader2 extends Student2 { // 같은 패키지 내 다른 파일의 클래스 호출
	void lead() {
		
	}
	void say() {	// 부모 클래스보다 자식 클래스의 코딩이 우선 시 되지만 super. 을 붙이면 부모 클래스의 중복 코딩이 호출된다.
		System.out.println("선생님께 인사"); // 오버라이딩
		super.say(); // 상위 클래스의 메소드 참조
	}
}

public class Practice63 {
	
	public static void main(String[] args) {
		
		Leader2 leader2 = new Leader2();
		leader2.say(); // 오버 라이딩한 메서드 사용		
		// 선생님께 인사
		// 선생님 안녕하세요
		
	}

}
