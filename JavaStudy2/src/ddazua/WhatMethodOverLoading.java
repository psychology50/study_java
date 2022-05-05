package ddazua;

// Method란?
// Def : 여러 명령들을 나열한 묶음.
// 사용이유: 이름을 호출하는 것으로 여러 개의 명령을 한 번에 실행
// 리턴타입: void -> 리턴값이 존재하지 않는다.

// OverLoading이란? (loading : 메모리에 적재하다)
// Def : 매개변수의 개수, 타입은 다르지만 이름이 같은 메서드를 여러 개 정의하는 것
// 가장 가까운 예로 '+' 연산자는 (정수+정수), (실수+실수), (문자열+문자열) 모두 가능하다. : 연산자 오버로딩  

// 컴퓨터가 함수를 구분하는 시그니쳐
// 1) 함수명	2) 함수의 매개변수의 개수	3) 함수의 매개변수의 타입

public class WhatMethodOverLoading {
	
	public static void main(String[] args) {
		sum(10, 20);
		sum(1.23, 3.12);
		// 함수를 중복으로 정의하여, 굳이 sum_int, sum_double로 나누어줄 필요가 없어진다.
		sum(10,20,30);
		
		
		System.out.println();
		
		
		// 두 수를 전달받아 사칙연산 구현하기 (정수, 실수 모두 가능)
		System.out.println("-------- 정수의 사칙연산 --------");
		System.out.println("sum_calc(10, 20); " + sum_calc(10, 20));
		System.out.println("sub(10, 20); " + sub(10, 20));
		System.out.println("mul(10, 20); " + mul(10, 20));
		System.out.println("div(10, 20); " + div(10, 20));
		System.out.println("-------- 실수의 사칙연산 --------");
		System.out.println("sum_calc(10, 20); " + sum_calc(1.2, 2.3));
		System.out.println("sub(10, 20); " + sub(1.2, 2.3));
		System.out.println("mul(10, 20); " + mul(1.2, 2.3));
		System.out.println("div(10, 20); " + div(1.2, 2.3));
		
		// plus) 컴퓨터가 실수값을 정확하게 표현할 수 없는 이유
		// 유한한 개수의 비트를 가지고 무한한 실수를 표현을 해야하므로 근사값으로 출력한다. <실수의 오류>
	}
	
	// 메서드의 매개변수 타입에 변화
	static void sum(int x, int y) {
		System.out.println(x+y);
	}
	static void sum(double x, double y) {
		System.out.println(x+y);
	}
	
	// 메서드의 매개변수 갯수에 변화
	static void sum(int x, int y, int z) {
		System.out.println(x+y+z);
	}
	
	
	
	// 정수형의 사칙연산
	static int sum_calc(int x, int y) {return x+y;}
	static int sub(int x, int y) {return x-y;}
	static int mul(int x, int y) {return x*y;}
	static int div(int x, int y) {return x/y;}
	
	// 실수형의 사칙연산
	static double sum_calc(double x, double y) {return x+y;}
	static double sub(double x, double y) {return x-y;}
	static double mul(double x, double y) {return x*y;}
	static double div(double x, double y) {return x/y;}

}
