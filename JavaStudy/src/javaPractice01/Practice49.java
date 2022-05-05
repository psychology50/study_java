package javaPractice01;

class Car {
	boolean powerOn; // 시동
	String color; // 차량의 색상
	int wheel; // 바퀴의 수
	int speed; // 속력
	boolean wiperOn; //와이퍼
	
	void power() {
		powerOn = !powerOn; // 시동 메서드
	}
	void speedUp() {
		speed++; // 엑셀 메서드
	}
	void speedDown() {
		speed--; // 브레이크 메서드
	}
	void wiper() {
		wiperOn= !wiperOn; // 와이퍼 메서드
	}
}

public class Practice49 {
	
	public static void main (String[] args) {
		Car mycar = new Car();
		System.out.println("시동 처음 초기화 : " + mycar.powerOn);		// false
		System.out.println("차의 색상 초기화 : " + mycar.color); 		// null
		System.out.println("바퀴의 수 초기화 : " + mycar.wheel);		// 0
		System.out.println("속력 초기화 : " + mycar.speed);				// 0
		System.out.println("와이퍼 작동 초기화 : " + mycar.wiperOn);	// false
		
		mycar.power(); // 시동 메서드 실행
		System.out.println("시동 메서드 동작 : " + mycar.powerOn);		// true
		mycar.power(); // 시동 메서드 실행
		System.out.println("시동 메서드 다시 동작 : " + mycar.powerOn);	// false
		
		mycar.color = "black"; // 색상 변수에 black 대입
		System.out.println("현재 차의 색상 : "+ mycar.color);			// black
	}

}
