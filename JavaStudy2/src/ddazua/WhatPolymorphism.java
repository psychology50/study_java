package ddazua;

// 다형성 : 한 가지 타입이 여러 가지 형태의 인스턴스를 가질 수 있다.
// 1. Upcasting		2. Downcasting       부모 자식간의 형변환

// Upcasting : 자식클래스의 객체가 부모클래스의 참조 변수로 형 변환 되는 것
// <구조> 부모클래스 변수 = 자식 객체값; // 부모클래스로 만들어진 변수에 자식클래스로 만들어지는 객체값을 담는다.

// Downcasting : 업캐스팅된 부모클래스 객체가 자식클래스 참조변수로 형 변환 되는 것
// <구조> 자식클래스 변수 = (자식클래스) 업캐스팅된 부모참조변수;
// 주로 업캐스팅으로 필요한 상황에 사용을 마치고 다시 자식 개체변수로 담고 싶을 때 사용한다.
// * 주의 * 		1. 업캐스팅된 변수만 가능 		2. 명시적 형변환

class Human {
	String name;
	int age;
	String hobby;
	
	public Human(String name, int age, String hobby) {
		this.name = name;
		this.age = age;
		this.hobby = hobby;
	}
	
	void info() {
		System.out.println("name: " + name);
		System.out.println("age: " + age);
		System.out.println("hobby: " + hobby);
	}
}

class Student extends Human {
	int grade;
	
	public Student(String name, int age, String hobby, int grade) {
		super(name, age, hobby);
		this.grade = grade;
	}
	void info() { // Overriding
		super.info();
		System.out.println("grade: "+grade+"학년");
	}
	void study() { 
		System.out.println("공부 중~~");
	}
}

public class WhatPolymorphism {
	
	public static void main(String[] args) {
		Student st1 = new Student ("가길동", 20, "게임하기", 3); 
		st1.info();
		st1.study();
		System.out.println();
		
		// ============= Upcasting ============= //
		Human h1 = new Student("나길동", 22, "운동하기", 1); // Q: Human 클래스의 공간을 할당받은 h1이라면 grade값은 메모리 어디에 할당되는 것인가..???
		h1.info(); // Student 클래스에서 만든 info가 출력되고 있음.
		//h1.study(); // 사용 불가능하다. 
		//System.out.println(h1.grade); // 마찬가지로 호출할 수 없다. study()와 grade 변수 호출 불가
		//h1에는 name, age, hobby 그리고 info 메서드만 있다. 값은 자식값으로 채우되, 그 값을 채우는 공간은 부모 클래스로 만들어졌기 때문
		//그렇다면 info()에서 grade는 어떻게 호출되는가?? ===> 동적 바인딩!!!
		
		// 동적 바인딩 : 컴파일 시점에선 부모클래스 필드로 인지하지만, 런타임 시점에선 자식클래스 필드로 호출 메서드를 묶는 것.
		
		// ============= Downcasting ============= //
		Student s1 = (Student)h1;
		s1.study(); // 사용이 가능해진다!
		
	}

}
