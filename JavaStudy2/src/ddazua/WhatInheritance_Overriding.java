package ddazua;

// 접근 제어자
// 1. public	: 같은 패키지든 다른 패키지든 모두 접근 가능
// 2. private	: 자식이 상속받을 수 없는 필드 (부모 클래스의 프라이버시)
// 3. default	: 같은 패키지 내에서만 가능
// 4. protected : 다른 패키지에서는 자식 패키지만 상속 가능

public class WhatInheritance_Overriding {
	public static void main(String[] args) {
		SportsCar mycar = new SportsCar("red", 300);
		System.out.println(mycar.color);
		System.out.println(mycar.speedLimit);
		
		Aclass01 a1 = new Aclass01();
		//a1. 까지만 치고 옆에 뜨는 창들을 보면 Object클래스 목록이 나온다.
		// 클래스를 만드는 창에서도 SuperClass에 java.lang.Object가 기본적으로 상속되도록 설정되어 있다.
		Aclass01 a2 = new Aclass01();
		
		//toString(): 객체 정보를 문자열 출력
		System.out.println(a1.toString());
		System.out.println(a1); // 객체 정보만 출력해도 동일하게 나온다. toString() 생략이 가능하다.
		//equals(): 두 객체가 동일한가를 비교한다.
		System.out.println(a1.equals(a2)); // 같은 클래스지만 동일한 객체는 아니다!
		//getClass(): 객체의 클래스 정보를 가져온다.
		System.out.println(a1.getClass());
	}
}

// super() 클래스 : 자식클래스에서 부모클래스의 코드를 사용할 수 있게 한다.

class Car01 {
	int wheel;
	int speed;
	String color;
	//Car() {} // 해결 방법1: 부모의 디폴트 생성자를 만들어 준다. 
	Car01(String color) {
		this.color = color;
	}
}
class SportsCar extends Car01 {
	int speedLimit;
	SportsCar(String color, int speedLimit) { 
		// 에러발생 : 자식클래스에서 생성자 호출 시, 컴파일러에 의해 부모 클래스 디폴트 생성자가 자동으로 호출되므로
		//			  부모의 디폴트 생성자가 존재해야 한다.
		super(color); // 해결 방법2: super 클래스로 매개변수 생성자를 호출시킨다.
		this.color = color;
		this.speedLimit=speedLimit;
	}
}

// Object Class : 모든 클래스의 조상클래스 (최상위 클래스)

class Aclass01{
	
}

