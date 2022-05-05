package ddazua;

// 추상 메서드: 선언부만 정의할 뿐, 구체적인 내용은 비워 놓은 메서드
// * 주의 * 추상메서드가 있는 클래스를 상속받는 자식 메서드는 반드시!! 부모 클래스 추상 메서드를 구현해야 함.
// <구조> abstreact 리턴타입 메서드명(); => 구현하지 않으므로 {} 생략, ;로 마무리

// 추상 클래스: 추상 메서드를 멤버(필드)로 갖는 클래스
// 1. 일반 메서드도 필드에 존재할 수 있지만, 추상 메서드를 하나라도 포함해야 함
// 2. new키워드를 사용해 생성자를 호출하는 객체 생성 코드 작성이 불가능하다.
// <구조> abstract class 클래스명 { ... abstract 리턴타입 메서드명(); }

// 추상 클래스의 사용 목적 : 구현은 자식 클래스가 하도록 메서드의 기능을 비워놓음.
// ex) 도형 class - draw():그리다 라는 추상클래스를 상속받는 사각형, 원, 선 각각의 클래스에서 각자에 맞는 형태를 그리도록 코딩한다.

public class WhatAbstract_Class_Method {
	
	public static void main(String[] args) {
		 Shape shapes[] = new Shape[3];
		 shapes[0] = new Rect(); // Upcasting
		 shapes[1] = new Circle();
		 shapes[2] = new Line();
		 
		 for(int i=0; i<3; i++) {
			 shapes[i].draw();
		 }
		 
		 System.out.println();
		 
		 Pokemon poketmon = new Pikachu();
		 System.out.println("이 포켓몬은 : " + poketmon.getName());
		 poketmon.attack();
		 poketmon.sound();
		 
		 poketmon = new Squirtle(); // 피카츄를 담은 값을 꼬북이로 덮어씌우기
		 System.out.println("이 포켓몬은 : " + poketmon.getName());
		 poketmon.attack();
		 poketmon.sound();
		 
		 
	}

}

// 추상 클래스를 사용하는 이유
// 현실적인 이유: 실무에서 작업할 때, 하나의 부모 클래스를 상속받는 여러 개의 자식 클래스 생성 과정 중, 필수 기능을 빼먹을 수 있음.
//				  하지만 그 기능이 모두 다르게 적용되어야 하는 경우 추상 메서드로 정의해버리면 잊어먹지 않고 추가할 수 있게 된다.
abstract class Shape {
//	void draw() {
//		System.out.println("도형을 그리다"); // 필요는 하지만 Shape 클래스에서 의미없는 기능. draw메서드를 구현해야 한다는 중요성만 강조해주면 된다.
//	}
	abstract void draw();
}
class Rect extends Shape {
	void draw() {
		System.out.println("사각형을 그리다"); // Overriding
	}
}
class Circle extends Shape {
	void draw() {
		System.out.println("원을 그리다");
	}
}
class Line extends Shape {
	void draw() {
		System.out.println("선을 그리다");
	}
}

// === 실습 === //
abstract class Pokemon {
	String name;
	abstract void attack();
	abstract void sound();
	
	public String getName() { // return값을 이름으로 받는 일반 메서드
		return this.name;
	}
}
class Pikachu extends Pokemon {
	Pikachu() {
		this.name = "피카츄";
	}
	void attack( ) {
		System.out.println("백만볼트");
	}
	void sound() {
		System.out.println("피카피카!");
	}
}
class Squirtle extends Pokemon {
	Squirtle() {
		this.name = "꼬북이";
	}
	void attack() {
		System.out.println("물대포!");
	}
	void sound() {
		System.out.println("꼬북꼬북!");
	}
}
