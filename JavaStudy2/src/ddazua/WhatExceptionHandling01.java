package ddazua;

/*
 	<예외처리>
 	def. 예외 발생 시, 이를 적절히 처리하여 비정상적으로 종료되는 것을 막는 방법
 	
 	1. 에러 : 개발자가 조치를 취할 수 없는 수준 : 메모리 부족, JVM 동작이상..
 	2. 컴파일 에러 : 컴파일 시 발생하는 에러 	: 오타, 잘못된 자료형..
 	3. 런타임 에러 : 프로그램 실행 도중 발생하는 에러    
 	4. 로직 에러 : 실행은 되지만 의도와는 다르게 동작하는 에러
 	5. 예외 : 다른 방식으로 처리 가능한 오류 	: 입력값 오류, 네트워크 문제
 */

// try - catch - finally
/*
 * 	<구조>
 *  try { 예외가 발생할 수 있는 명령; } 
 *  catch (발생할 수있는 예외 클래스명) { 예외 발생 시 실행할 명령; }
 *  finally { 예외가 발생하든 안 하든 무조건 실행시킬 명령; }
 */

public class WhatExceptionHandling01 {
	public static void main(String[] args) {
		int a = 0;
		int b = 2;
//		int c = b/a; // Exception in thread "main" java.lang.ArithmeticException: / by zero
		
		
		try {
			int a1[] = {2,0};
			int b1=4;
			int c = b1/a1[2]; // 산술오류, 배열의 인덱스 접근 오류 두 가지 발생
			System.out.println(c);
		}
		catch (ArithmeticException e) {
			System.out.println("산술 오류 발생");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 길이 오류 발생");
		}
		System.out.println("예외처리 공부 중");
		
		System.out.println();
		
		// finally는 NetWork 연결 시. 외부와의 연결 종료하는 작업에 주로 사용
		int a2 = 0;
		int b2 = 2;
		try {
			System.out.println("외부로 접속");
			int c2 = b2/a2;
		}
		catch(ArithmeticException e) {
			System.out.println("오류가 발생했습니다.");
		}
		finally {
			System.out.println("무조건 연결 해제");
		}
		
		
	}
}
