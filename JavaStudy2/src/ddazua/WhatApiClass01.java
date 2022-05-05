package ddazua;

// API: Application Programming Interface
// 자바에서 개발자들을 위해 기본적으로 제공하는 클래스

// Object 클래스 : 모든 클래스의 조상 클래스
// 모든 클래스는 Object 클래스의 필드를 상속받는다.

// <<문자열 클래스>>
// 1. String 클래스 : immutable(변하지 않는) 객체. 자주 사용할 수록 인스턴스를 만들기 때문에 느려짐
// 		객체 생성 방법 : 클래스명 인스턴스변수명 = new 생성자()
//		Sring 객체 생성: String 변수명 = 값
// String 클래스는 객체 생성 시, 보통 클래스와 달리, 기본 자료형 선언처럼 사용

// 2. StringBuffer 클래스 : 객체 안의 데이터를 내부적으로 변경할 수 있음.


// 3. StringTokenizer 클래스 : 특정 구분문자를 통해 문자를 끊어줄 때
//		라이브러리: import java.util.StringTokenizer;
//		"이름:전화번호" 문자열에서 ':'문자를 기준으로 이름과 전화번호로 나누고 싶을 때
// 	1) 문자열 생성 	2) 구분할 문자열 생성	3) StringTokenzier 객체 생성
//												StringTokenizer st = new StringTokenizer(문자열, 구분문자열);
// 주요 메서드 : nextToken(): 다음 토큰으로 이동 / hasMoreTokens(): 다음 토큰이 존재하면 true, 아니면 false / countTokens() : 남은 토큰 개수

import java.util.StringTokenizer;

public class WhatApiClass01 {
	public static void main(String[] args) {
		
		//----------------------String Class--------------------------//
		String str = "hello";
		System.out.println(str.concat(" world!")); // concat : 문자열 연결
		System.out.println(str); // 문자열 자체가 변경된 것은 아니다. 출력값이 달라질 뿐이다.
				
		System.out.println(str.substring(2, 4)); // substring(시작위치, 끝위치) : 시작위치~끝위치 전까지 호출
		
		System.out.println(str.length()); // length() // 5
		
		System.out.println(str.toUpperCase());
		System.out.println("Test".toLowerCase());
		
		// charAt(인덱스), indexOf(문자열), equals(문자열)
		System.out.println(str.charAt(1)); // 글자 가져오기
		System.out.println(str.indexOf("o")); // 해당 문자 위치 찾기
		System.out.println("hellow world".indexOf("world")); // -1 : 못 찾음
		System.out.println(str.equals("hello")); // boolean 값으로 출력
		
		// trim(), replace, replace
		System.out.println("    test   ".trim()); // 앞 뒤 공백 제거
		System.out.println("hello world".replace('l', 'L')); // 문자 대체
		System.out.println("hello world".replaceAll("hello", "bye"));
		
		System.out.println();
		
		//----------------------StringBuffer Class--------------------------//
		String str_test = "test";
		StringBuffer buffer = new StringBuffer("test");
		
		str.replace('t', 'T');
		System.out.println(str_test); // 대문자로 바뀌지 않는다. str_test 문자열 자체가 바뀌지는 않기 때문
		
		buffer.replace(1, 3, "ES");
		System.out.println(buffer); // buffer 값 자체적으로 바뀜. 수정이 아니라 새로운 값이 저장되는 것
		
		System.out.println();
		
		//----------------------StringTokenizer Class--------------------------//
		// 문자열 생성
		String str_last = "kim:010-1234-1234";
		String delim=":";
		StringTokenizer st = new StringTokenizer(str_last, delim);
		System.out.println(st.countTokens());		// 2
		System.out.println(st.nextToken());			// kim
		System.out.println(st.hasMoreTokens());		// true
		
		System.out.println(st.countTokens());		// 1
		System.out.println(st.nextToken());			// 010-1234-1234
		System.out.println(st.countTokens());		// 0
		System.out.println(st.hasMoreTokens());		// false
		
	}

}
