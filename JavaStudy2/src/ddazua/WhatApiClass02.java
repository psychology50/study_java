package ddazua;

import java.util.Random;
/* 
	1. Wrapper Class (이런 클래스가 존재하는 것이 아닌 여러 클래스를 묶어서 통칭하는 말
	   : 기본 자료형들을 객체로 다루는데 사용. // 자바는 객체 지향이므로, 객체 값을 다룰 일이 많아 일반 자료형 데이터를 객체 변환하는 작업이 필요 
		ex) boolean(기본 자료형) -> Boolean 클래스(래퍼 클래스) / int -> Integer 클래스 ...
		<생성 방법> Wrapper클래스명 객체명 = new Wrapper클래스멍(값);
		
		(1) Auto Boxing   : 기본 자료형 값을 자동으로 Wrapper 클래스 객체로 변환시켜 주는 것
		(2) Auto UnBoxing : Wrapper 클래스의 객체 값을 자동으로 기본 자료형 값으로 변환시켜 주는 것
		
	2. Random Class
	   : 무작위의 값을 얻고 싶을 때 사용하는 클래스
	   - Random 클래스는 내부적으로 무작위의 값을 추출하기 위한 내부 알고리즘이 존재한다.
	   - <생성 방법> Random 객체명 = new Random();
	   - 생성자 종류 > Random(): 현재 시간을 seed 값으로 인스턴스 생성		// default 생성자
	   				   Random(int seed): 받아오는 seed 값으로 인스턴스 생성
	   - 메서드
	     int nextInt() / int nextInt(int n) : 0보다 크고 n보다 작은 무작위 int값 반환 / boolean nextBoolean() / double nextDouble()

*/

public class WhatApiClass02 {
	public static void main(String[] args) {
		
		int i = 30;
		Integer ii = new Integer(i); // 작대기 그어지는 이유 : 웬만하면 사용하지 말라는 프로그램 경고문 -> auto boxing/unboxing으로 이어진다.
		System.out.println(ii);
		// 차이점 ii. 하면 여러 메서드 호출이 가능해짐. 즉 ii는 변수가 아닌 객체다.
		// 객체로 만들면 null값을 넣거나 메소드를 사용할 수 있고 .toString() 메소드를 통해 String타입으로 변환할 수도 있다.
		// int arr[] = new int[4];
		// ArrayList<int> list = new ArrayList<>() ==> error
		// ArrayList<Integer> list = new ArrayList<>()
		
		double d = 3.14;
		Double dd = new Double(d);
		System.out.println(dd);
		
		System.out.println("================Integer Wrapper=================");
		Integer ii2 = 30; // auto boxing
		// Integer -> int
		System.out.println(ii2.intValue()+3);
		// Integer -> Double
		System.out.println(ii2.doubleValue());
		// Integer -> float
		System.out.println(ii2.floatValue());
		// Integer -> String
		System.out.println(ii2.toString()+3); // 문자열인지 숫자인지 판단하는 방법
		
		System.out.println("================Auto Boxing/UnBoxing=================");
		// Auto Boxing
		Integer i2 = 10;
		Double d2 = 3.14;
		Float f2 = 3.14f;
		Character c2 = 'A';
		
		// Auto UnBoxing
		int ii3 = i2;
		double dd2 = d2;
		float ff = f2;
		char cc = c2;
		System.out.println(ii3);
		System.out.println(dd2);
		System.out.println(ff);
		System.out.println(cc);
		
		System.out.println("================Random=================");
		Random random = new Random();
		Random random2 = new Random(2);
		Random random3 = new Random(2); // 시드 값이 같기 때문에 random2와 random3는 같은 값이 출력된다.
		for(int j=0;j<5;j++) {
			System.out.println("기본 생성자: " + random.nextInt());
		}
		for(int j=0;j<5;j++) {
			System.out.println("random2: " + random2.nextInt());
		}
		for(int j=0;j<5;j++) {
			System.out.println("random3: " + random3.nextInt());
		}
		
	}

}
