package ddazua;

class Car {
	boolean powerOn;
	String color;
	int wheel;
	int speed;
	boolean wiperOn;
	
	void power() {powerOn =! powerOn;} // true -> false, false -> true
	void speedUp() {speed++;}
	void speedDown() {speed--;}
	void wiper() {wiperOn =! wiperOn;}
}

public class WhatClass_ObjectOriented02 {
	public static void main(String[] args) {
		Car myCar = new Car();
		System.out.println("시동 처음 초기화: "+myCar.powerOn);
		System.out.println("차의 색상 초기화: "+myCar.color);
		System.out.println("바퀴의 수 초기화: "+myCar.wheel);
		System.out.println("차의 속력 초기화: "+myCar.speed);
		System.out.println("와이퍼 초기화: "+myCar.wiperOn);
		
		myCar.power();
		System.out.println("시동 메서드 동작: " + myCar.powerOn);
		myCar.power();
		System.out.println("시동 메서드 다시 동작: " + myCar.powerOn);
		
		myCar.color = "black";
		System.out.println("현재 차의 색상: " + myCar.color) ;
		
		// 하나의 클래스로 여러 개의 객체 생성이 가능하다.
		
		Car myCar1 = new Car();
		Car myCar2 = new Car();
		myCar1.color = "Red";
		myCar2.color = "white";
		myCar1.speedUp();
		myCar2.wiper();
		
		System.out.println("myCar1의 색: " + myCar1.color);
		System.out.println("myCar2의 색: " + myCar2.color);
		System.out.println("myCar1의 속도: " + myCar1.speed);
		System.out.println("myCar2의 속도: " + myCar2.speed);
		System.out.println("myCar1의 와이퍼 작동 여부: " + myCar1.wiperOn);
		System.out.println("myCar2의 와이퍼 작동 여부: " + myCar2.wiperOn);
	}

}
