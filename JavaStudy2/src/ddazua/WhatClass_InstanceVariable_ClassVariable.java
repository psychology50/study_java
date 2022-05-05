package ddazua;

// 클래스   def: 객체를 만들기 위한 설계도
// 객체 	def: 독립적으로 존재할 수 있는 것
// 인스턴스 def: 클래스로 실제 메모리에 생성된 객체 (객체가 더 포괄적) 

/*
 	1. 인스턴스 변수 : 객체마다 갖는 고유한 변수
 		- 인스턴스를 생성할 때 만들어지며, 각각의 인스턴스 마다 자신의 값을 가짐
 		- 각 인스턴스마다 다른 값을 가져야 할 때 생성
 		- 인스턴스 생성'new 클래스명()' 시 메모리에 생성
 		   ex) class 회원 -> 이름, 나이, 성별 등 고유한 값을 가진 회원 정보 관리
 		- 생성방법
 			class 클래스명 { 자료형 변수명; } *기존방식과 동일
 			
 	2. 클래스 변수 : 모든 객체가 동일한 값을 갖는 변수
 		- 모든 인스턴스가 같은 저장공간 공유
 		- 클래스가 처음 메모리에 로딩될 때 생성
 		- 인스턴스 없이도 사용 가능
 		- 생성방법
 			class 클래스명 { static 자료형 변수명; }  
 
 */

class Member {
	// String centerName;
	static String centerName = "Bye"; // 클래스 변수로 전체 객체에 대한 정보수정 용이
	String name;
	int age;
	String gender;
	void info() {
		System.out.println("---------------------");
		System.out.println("center: " + centerName);
		System.out.println("name: " + name);
		System.out.println("age: " + age);
		System.out.println("gender: " + gender);
	}
}

public class WhatClass_InstanceVariable_ClassVariable {
	
	public static void main(String[] args) {
		Member member1 = new Member();
		Member member2 = new Member();
		Member member3 = new Member();
		Member member4 = new Member();
		
		//member1.centerName = "Hello"; -> 센터 이름이 바뀌면 변경작업이 힘듦
		member1.name = "김철수";
		member1.age = 32;
		member1.gender = "남자";
		
		//member2.centerName = "Hello";
		member2.name = "김민호";
		member2.age = 28;
		member2.gender = "남자";
		
		//member3.centerName = "Hello";
		member3.name = "이영희";
		member3.age = 24;
		member3.gender = "여자";
		
		//member4.centerName = "Hello";
		member4.name = "고석천";
		member4.age = 32;
		member4.gender = "남자";
		
		member1.centerName = "GoodMorning"; // 모든 값이 다 바뀐다!!!!!!
		// 왜냐하면, 클래스 변수는 모두 다 같은 주소값을 가지기 때문. 따라서 하나만 바꿔도 다 바뀜
		
		member1.info();
		member2.info();
		member3.info();
		member4.info();
	}
	
}
 