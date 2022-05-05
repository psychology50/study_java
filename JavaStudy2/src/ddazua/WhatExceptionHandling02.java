package ddazua;

// 1. 객체로서의 예외
//	  : 자바는 객체지향 언어이기에 예외도 객체로 처리한다. => 예외는 Exception클래스의 객체!
//      - 모든 예외 클래스들은 Exception 클래스를 상속받으므로 Exception으로 처리 가능
//		- 예외 클래스들에서 Exception 클래스의 메서드 사용 가능

// 2. throw와 throws 
//    <구조>
//	   Exception e = new Exception("Exception");
//	   throw e;    // 프로그래머가 고의로 예외를 발생 시킬 때 사용하는 방법

// 	  <구조>
//     void method() throws Exception{ ... } : 예외 발생 시, 현재 메서드가 예외처리하지 않고 자신을 호출한 쪽으로 책임을 넘기는 것.


public class WhatExceptionHandling02 {
	
	public static void main(String[] args) {
		
		try {
			Exception e = new Exception("고의 예외");
			throw e; // 고의로 예외를 던지겠다.
		}
		catch(Exception e) {
			System.out.println("예외 발생");
			System.out.println(e.getMessage());
		}
		
		System.out.println("================================");
		
		try {
			methodA();
		}
		catch(Exception e) {
			System.out.println("메인에서 처리");
		}
		
		System.out.println("================이중 예외 처리================");
		
		try {
			System.out.println("외부 try...");
			try {
			 System.out.println("내부 try...");
			 Exception e = new Exception();
			 throw e;
			}
			catch(Exception e) {
			 System.out.println("(내부 try-catch) exception" + e);
			 System.out.println("예외 던지기 한 번 더 : ");
			 throw e;
			}
			finally {
				System.out.println("finally 구문 출력");
			}
		}
		catch(Exception e) {
			System.out.println("(외부 try-catch) exception: " + e);
		}
		System.out.println("종료");
		
		System.out.println("================나만의 예외 클래스 만들기================");
		
		int age = -19;
		try {
			ticketing(age);
		}
		catch(AgeException e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	// EX.2
	public static void methodA() throws Exception { // main에게 예외 던지기 
		methodB();
	}
	public static void methodB() throws Exception { // A에게 예외 던지기
		methodC();
	}
	public static void methodC() throws Exception { // B에게 예외 던지기
		Exception e = new Exception();
		throw e; // 예외 발생
	}
	
	
	// EX.3
	public static void ticketing(int age) throws AgeException {
		if (age<0) {
			throw new AgeException("나이 입력이 잘못되었습니다.");
		}
	
	}

}

class AgeException extends Exception { // extends Exception : 예외 클래스 상속
	public AgeException() {}
	public AgeException(String message) {
		super(message);
	}
}
