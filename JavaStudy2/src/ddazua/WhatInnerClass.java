package ddazua;

// Inner Class : 서로 간에 긴밀한 클래스가 있을 때 가독성을 높이기 위해 사용
// 1) 인스턴스 클래스	2) 스태틱 클래스	3) 지역 클래스	4) 익명 클래스  * 선언 위치에 따라 구분됨 *

/* 
 	1) 인스턴스 클래스
 	   - 외부 클래스에서 멤버 변수 위치에 선언
 	   - 클래스 내부에서 인스턴스(객체) 멤버처럼 다뤄지며, 인스턴스 멤버들과 상호작용 가능
 	  
 	   <구조>
 	   Class OuterClass{
 	   		static class InnerClass{ ... }
 	   }
 	   
 	2) 지역 클래스
 	   - 메서드 내부 지역변수 위치에 선언 // Stack 영역에 존재하는 클래스
 	   - 메서드나 초기화 블록의 내부에서 다뤄지며 선언된 영역 내부에서 사용
 	   
 	   <구조>
 	   Class OuterClass {
 	   		void A() {
 	   			class InnerClass{ ... }
 	   		}
 	   }
 	   
 	3) 익명 클래스 : 이름이 없음
 	   - 기존 클래스를 오버라이딩해서 만든다.
	   - 1회용 클래스. 단 한번만 사용할 때 생성한다.
	   - 인터페이스 혹은 추상클래스를 일회성 구현할 때 많이 사용한다.
 */

// 내부 클래스의 접근성 : 선언부에 접근제어자 사용 가능

public class WhatInnerClass {
	public static void main(String[] args) {
		
		// [1] OuterClass 객체 생성 후 멤버에 접근
		OuterClass oc = new OuterClass();
		System.out.println("OuterClass의 a의 값 : " + oc.a);
		System.out.println("OuterClass의 a의 값 : " + OuterClass.b); // static은 객체를 정의하지 않아도 사용 가능하다.
		
		// [2] 인스턴스 내부 클래스 접근
		System.out.println(" <<<< Inner 클래스 접근하기 >>>> ");
		OuterClass oc2 = new OuterClass();
		// 내부 클래스 객체 생성하는 방법 => 외부클래스.내부클래스명 객체명 = new 외부클래스생성자().내부클래스생성자();
		//																	      외부클래스객체.내부클래스생성자();
		OuterClass.Inner i = oc2.new Inner();
		
		System.out.println("Inner의 c값 : " + i.c);
		i.InnerMethod();
		
		// [3] 스태틱 내부 클래스 접근
		OuterClass.StaticInner si = new OuterClass.StaticInner();
		
		System.out.println("StaticInner의 d의 값: " + si.d);
//		si.staticMethod(); => static class의 경우 객체를 사용하지 않고 클래스 명을 사용해서 호출하는 것이 더 정확하다.
		OuterClass.StaticInner.staticMethod();
		
		// ==== 익명 클래스 ==== //
		OuterClass1 o = new OuterClass1() {
			void a() {
				System.out.println("새롭게 정의한 익명클래스 메서드");
			}
		};
		o.a();
		OuterClass1 ok = new OuterClass1();
		ok.a();
		
		
//		Inter1 i1 = new Inter1(); // 인터페이스 객체 생성 불가능
		Inter1 i1 = new Inter1() {
			public void f1() {
				System.out.println("f1()");
			}
		};
		i1.f1();
		
		Abstract ab = new Abstract() {
			void f2() {
				System.out.println("Abstract extends f2()");
			}
		};
		ab.f2();
	} 
}

// ==== Ex. 1 ==== // 
class A_inner {
	// 멤버 변수와 동일한 위치에 선언된 내부 클래스
	static class StaticInner{}
	class InstanceInner{}
	
	// 객체 생성 >> 두 클래스 모두 객체 생성 가능하다.
	StaticInner st1 = new StaticInner();
	InstanceInner ii1 = new InstanceInner();
	
	static void StaticMethod() {
		StaticInner st2 = new StaticInner();
//		InstanceInner ii2 = new InstanceInner(); // 스태틱 메서드는 인스턴스 멤버에 접근 불가능
		// Why? static이 붙는 순간 메모리 저장 영역도 다르고 객체 생성 이전에 미리 생성되는 영역이므로 객체 생성 후에 만들어지는 인스턴스 값은 접근 불가
	}
	void InstanceMethod() {
		StaticInner st3 = new StaticInner();
		InstanceInner ii3 = new InstanceInner();
	}
	
}

//==== Ex. 2 ==== // 
class OuterClass {
	int a;
	static int b = 4;
	class Inner {
		int c = 5;
		public void InnerMethod() {
			System.out.println("<Inner Class>");
		}
	}
	static class StaticInner {
		int d = 6;
		static int stat = 10;
		
		public static void staticMethod() {
			System.out.println("<Static Inner>");
		}
	}
}

//==== Ex. 3 ==== // 익명 클래스
class OuterClass1 {
	void a() {
		System.out.println("method a");
	}
	void b() { }
}

interface Inter1 {
	void f1();
}

abstract class Abstract {
	abstract void f2();
}