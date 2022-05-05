package javaPractice01;

class Tv {
	//Tv의 속성(멤버변수)
	String color;	// 색상
	boolean power;  // 전원상태 (on / off)
	int channel;	// 채널
	
	// Tv의 기능(메서드)
	void power( ) {  power = !power;  }  // Tv를 켜거나 끄는 기능을 하는 메서드
	void channelUp() {		++channel;  }  // Tv의 채널을 높이는 기능을 하는 메서드
	void channelDown() {		--channel;  }  // Tv의 채널을 낮추는 기능을 하는 메서드
}

public class Practice53 {
	
	public static void main (String[] args) {
		
		Tv t;						// TV 인스턴스를 참조하기 위한 변수 t를 선언
		t = new Tv();				// TV 인스턴스 생성
		t.channel = 7 ;				// TV 인스턴스의 멤버변수 channel의 값을 7로 한다.
		t.channelDown();			// TV 인스턴스의 메서드 channelDown()을 호출한다.
		System.out.println("현재 채널은 " + t.channel + "번 입니다."); // 현재 채널은 6번 입니다.
		
		// 메서드 사용
		
		for (int i = 0; i < 4; i++) {
			t.channelUp();
		}
		System.out.println("현재 채널은 " + t.channel + "번 입니다."); // 현재 채널은 10번 입니다.
	}

}
