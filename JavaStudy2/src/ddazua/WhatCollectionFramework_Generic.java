package ddazua;

/*
 Collection Framework : 데이터를 효율적으로 다루기 위한 클래스들의 집합
 자료구조(Data Structure) : 자료들을 저장할 때, 효율적인 구조로 저장하는 것 (데이터 구조)
 컬렉션 프레임웍 : 자바에서 제공하는 자료구조

 <Collection 인터페이스>
 1. Set	   2. List    3. Queue    4. Map
 
 <제공된 메서드>
 add(E e) / contains(Object obj) / isEmpty() / isIterator() / remove(Object obj) / size() 
*/

/* ================================================================================================================================
 Generic : 클래스가 다룰 객체를 미리 명시하는 기법. (제네릭 == 일반화)
 			 "어떤 데이터를 다루든 일단 내가 일반화해서 처리하겠다."
           => 제네릭은 모든 종류의 타입을 다룰 수 있도록, 클래스나 메서드를 타입 매개변수를 이용하여 선언한 기법
 ex) 내가 BMW나 벤츠든 뭐든 팔 건데 그냥 전부 '차'라고 명칭하고 다루겠다.
 
 <사용 방법>
 : 클래스 명 뒤에 <E>, <K>, <V>와 같은 형식으로 사용. 단, <> 안에는 구현 시는 알파벳, 사용 시엔 클래스만 들어갈 수 있다.
 
 <제네릭 사용 구간>
 (1) 제네릭 클래스 : 클래스 뒤에 제네릭 기법 사용
 (2) 제네릭 메서드 : 메서드 뒤에 제네릭 기법 사용
 
 <제네릭타입 매개변수> (관례적으로 널리 사용되는 타입명은 하나의 대문자 알파벳 사용)
 (1) E(Element)	: 배열이나 집합들의 요소 타입을 지정
 (2) T(Type)	: 변수의 자료형과 같은 타입을 지정
 (3) S,U(...)	: 여러개의 제네릭 기법을 사용할 때 자주 사용
 (4) K(Key)		: 키 타입 지정 시 사용
 (5) V(Value)	: 값 타입 지정 시 사용
*/


public class WhatCollectionFramework_Generic {
	
	public static void main(String[] args) {
		// 1 //
		Value v = new Value();
		v.typeSearch(3);
		// v.<Integer>typeSearch(3); => 정확한 표현. 3이 Integer 타입 객체로 들어간다. 하지만 버전 업그레이드로 auto boxing이 된다.
		v.typeSearch(3.14);
		v.typeSearch(3.14f);
		v.typeSearch('a');
		v.typeSearch("hello" );
		
		System.out.println();
		// 2 //
		Ag<Integer> a1 = new Ag<Integer>();
		a1.x=3;
		a1.y=10;
		System.out.println(a1.x + a1.y);
		
		Ag<String> a2 = new Ag<>(); // <> 안에 다시 안 적어도 알아서 인식한다.
		a2.x = "hello ";
		a2.y = "world";
		System.out.println( a2.x + a2.y );	
		// 즉, 제네릭이란 '사용할 때' 타입을 정의해서 사용하겠다. 라는 의미이다.
		
	}

}

// Generic method
class Value {
	public <T> void typeSearch(T x) {
//  접근제어자_제너릭_리턴타입_메서드명
		if (x instanceof Integer) {
			System.out.println(x + "는 정수입니다.");
		}
		else if(x instanceof Double||x instanceof Float) {
			System.out.println(x + "는 실수입니다.");
		}
		else if(x instanceof Character) {
			System.out.println(x + "는 문자형입니다.");
		}
		else if(x instanceof String) {
			System.out.println(x+"는 문자열입니다.");
		}
		else if(x instanceof Boolean) {
			System.out.println(x + "는 논리형입니다.");
		}
	}
}

// Generic Class
class Ag<T> { // 클래스를 이용하여 객체를 생성할 때, 타입을 지정하겠다!
	T x;
	T y;
}
