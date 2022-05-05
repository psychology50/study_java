package assistLecture5;

/* 선언부 */
class Car {
	boolean powerOn; // 시동 on/off 여부 
	String color;    // 자동차 색상
	int wheel=4;     // 자동차 바퀴 수
	int speed;       // 자동차의 속력
	boolean wiperOn; // 와이퍼 on/off 여부
	
	void power() {powerOn = !powerOn;} // true -> false, false -> true
	void speedUp() {speed++;}
	void speedDown() {speed--;}
	void wiper() {wiperOn = !wiperOn;}
}

public class Practice_Class2 {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		System.out.println("#myCar");
		System.out.println("===== 초기화 =====\n");
		System.out.println("시동 처음 초기화: "+myCar.powerOn); // false
		System.out.println("차의 색상 초기화: "+myCar.color);   // null
		System.out.println("바퀴의 수 초기화: "+myCar.wheel);   // 4 
		System.out.println("차의 속력 초기화: "+myCar.speed);   // 0
		System.out.println("와이퍼 초기화: "+myCar.wiperOn);	// false
		
		System.out.println("\n===== 동작 =====\n");
		myCar.power();
		System.out.println("시동 메서드 동작: " + myCar.powerOn);		// true
		myCar.power();
		System.out.println("시동 메서드 다시 동작: " + myCar.powerOn);  // true
		myCar.color = "black";
		System.out.println("현재 차의 색상: " + myCar.color) ; // black
		
		// 하나의 클래스로 여러 개의 객체 생성이 가능하다.
		
		Car myCar1 = new Car();
		Car myCar2 = new Car();
		myCar1.color = "Red";
		myCar2.color = "white";
		myCar1.speedUp();
		myCar2.wiper();
		
		System.out.println("\n속성값 입력 후, Car1과 Car2");
		System.out.println("myCar1의 색: " + myCar1.color); // Red
		System.out.println("myCar2의 색: " + myCar2.color); // white
		System.out.println("myCar1의 속도: " + myCar1.speed); // 1
		System.out.println("myCar2의 속도: " + myCar2.speed); // 0
		System.out.println("myCar1의 와이퍼 작동 여부: " + myCar1.wiperOn); // false
		System.out.println("myCar2의 와이퍼 작동 여부: " + myCar2.wiperOn); // true
			
	}
}
