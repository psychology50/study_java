package ddazua;

// Interface
// Def : inter(사이의) + face(마주하다) : 물체들 사이에서 상호작용 할 수 있도록 하는 매개 역할
// 추상 클래스가 설계도라면 인터페이스는 규격이다. (적어도 이 기능은 있어야 한다 를 정의)

// 엔터페이스의 멤버 (1) 상수 : final 타입 변수명 = 값;					=> 변수는 안 된다.
//					 (2) 추상 메서드 : abstract 리턴타입 메서드명();	=> 일반 메서드는 안 된다.
// <구현> interface 인터페이스명{ 필드 }
//		  class 클래스명 implements 인터페이스명 { 추상 메서드 구현 }
 
/* 
   <인터페이스 주의할 점!!!!>
   1. 일반 메서드 불가능
   2. 인터페이스 내 변수 불가 (final이 생략된 상수만 가능)
   3. 인터페이스로 객체 생성 불가
   4. 인터페이스 내 멤버 메서드 abstract 생략 가능 
 */

public class WhatInterface {
	
	public static void main(String[] args) {
//	    a1 = new A(); 인터페이스 객체 생성 불가
		A a1 = new B(); // 인터페이스 업 캐스팅은 가능
//		a1.a = 20; 인터페이스 내 상수 변경 불가
		a1.methodA();
		a1.methodB();
		
		B a2 = new B();
		a2.methodA();
		
		
		TourGuide guide = new TourGuide();
		guide.leisureSports();
		guide.sightseeing();
		guide.food();
		
		// ====== Interface Polymorphism (인터페이스 다형성) ====== //
		
		MyCellPhone phone1 = new MyCellPhone();
		Camera phone2 = new MyCellPhone();
		Call phone3 = new MyCellPhone();
		Memo phone4 = new MyCellPhone();
		Clock phone5 = new MyCellPhone();
		PhoneUser user1 = new PhoneUser();
		user1.call(phone1);
//		user1.call(phone2); Call 타입의 변수만 들어갈 수 있다.
		user1.call(phone3);
//		user1.call(phone4);
//		user1.call(phone5);
	}

}

// Example 1

interface A {
	int a = 4; // final이 생략되어 있다.
	void methodA(); // abstract가 생략되어 있다.
	void methodB();
}
class B implements A {
	@Override
	public void methodA() {
		// TODO Auto-generated method stub
		System.out.println("method A");
	}
	@Override
	public void methodB() {
		// TODO Auto-generated method stub
		System.out.println("method B");
	}
}

// Example 2

interface Providable {
	void leisureSports();
	void sightseeing();
	void food();
}
class KoreaTour implements Providable {
	public void leisureSports() {
		System.out.println("한강에서 수상스키 투어");
	}
	public void sightseeing() {
		System.out.println("경복궁 관람 투어");
	}
	public void food() {
		System.out.println("전주 비빔밥 투어");
	}
}
class TourGuide {
//	private Providable tour = new KoreaTour(); // Upcasting
	private Providable tour = new JapanTour(); // 인터페이스로 업캐스팅을 하면 클래스 간 관계가 느슨해져 코드 수정이 간편하다.
	public void leisureSports() {
		tour.leisureSports();	
	}
	public void sightseeing() {
		tour.sightseeing();
	}
	public void food() {
		tour.food();
	}
}


// Example 3 : TourGuide 클래스가 JapanTour 클래스로 변경되어야 한다면?
class JapanTour implements Providable {
	public void leisureSports() {
		System.out.println("도쿄타워 번지점프");
	}
	public void sightseeing() {
		System.out.println("오사카 관람투어");
	}
	public void food() {
		System.out.println("초밥 투어");
	}
}

// Example 4 : 인터페이스 다중구현 (추상 클래스와 결정적 차이점)
interface Camera{
	void photo();
}
interface Call {
	void calling();
}
interface Memo {
	void write();
}
interface Clock {
	void clock();
}

class MyCellPhone implements Camera, Call, Memo, Clock {

	@Override
	public void clock() {
		// TODO Auto-generated method stub
		System.out.println("clock()");
	}

	@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("write()");
	}

	@Override
	public void calling() {
		// TODO Auto-generated method stub
		System.out.println("calling()");
	}

	@Override
	public void photo() {
		// TODO Auto-generated method stub
		System.out.println("photo()");
	}
	
}
class PhoneUser {
	void call (Call c) { // Call 타입의 변수를 받는다.
		System.out.println("전화를 걸었습니다.");
	}
}
