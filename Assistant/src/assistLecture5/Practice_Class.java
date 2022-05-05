package assistLecture5;

/*
[1] 객체 지향 언어  
    : '클래스가 왜 사용되는가?'를 알기 위해선 객체 지향을 먼저 알아야 합니다.
       문제는 이 '객체 지향'이 가장 밑바탕이 되는 개념이면서, 어쩌면 가장 어려운 개념이기도 합니다.
       지금은 그냥 '클래스가 객체 지향 언어 때문에 나오는 애구나' 정도만 알고 넘어가시면 됩니다.
    1. def
       (1) 객체(Object) : 독립적으로 존재하는 것들
       (2) 객체 지향 : 코드(함수... 등)를 객체화하여 독립적으로 존재하도록 한다. 
    2. purpose
       (1) "코드의 재사용!"
       (2) 간편한 유지 및 보수
       
[2] 클래스
    1. def
       · 객체를 만들기 위해 속성과 기능을 정의하는 설계도
    2. concept
       (1) terms
       	   a) 선언부
       	   	  · 속성 : 해당 클래스의 속성..변수 선언
       	   	  · 기능 : 해당 클래스의 기능..메서드 선언
       	   	  · 메서드 : 함수가 클래스 안에서 선언되면 메서드(Method)라고 정의한다.
       	   	  			 함수와 달리 독단적으로 사용될 수 없으며, 객체가 구현되어야 한다.
       	   b) 구현부
           	  · 인스턴스(Instance) : 설계도(클래스)를 통해 구현된(메모리에 할당된) 형태
             	 >>> 인스턴스화 = 클래스를 통해 객체를 만드는 과정
           	  · 생성 연산자(new) : 메모리에 값을 할당하기 위한 명령어
       (2) frame
           a) 선언부
              class 클래스명 {  // 클래스명 첫 글자는 대문자로 시작
                  // 속성(변수)
                  // 기능(메서드)
              }
           b) 구현부
              클래스명 객체명 = new 클래스명();
              
              <45번 줄 해석>
  			  클래스명(설계도)에 기반한 인스턴스 변수(객체명)을 만든다.
  			  new 연산자가 컴퓨터에게 해당 객체를 메모리 공간에 할당할 것을 명령하고
  			  이 객체는 '클래스명()'의 기능을 사용할 수 있다.
 */

/*  선언부  */
class Dog {
	/* 강아지의 속성 */
	// 변수로 선언
	String name;   // 이름
	double weight; // 무게
	String color = "white";  // 색상
	
	/* 고양이의 기능(동작) */
	// 메서드로 선언
	void bark() {  // 짖는 동작
		System.out.println("멍멍!");
	}
	void eat() {   // 먹는 동작
		System.out.println("밥 먹기");
	}
	
	
}

public class Practice_Class {
	public static void main(String[] args) {
		/*  구현부  */
		Dog d1 = new Dog();
		
		// class에서 정의된 것은 강아지의 속성을 선언했을 뿐이라 값을 넣어주어야 한다.
		d1.name = "웅이";
		d1.weight = 5.1;
//		d1.color = "black"; // 클래스에서 값을 할당해서 기본값은 white지만, 값을 덮어 쓸 수 있다.
		
		System.out.println(d1.name);
		System.out.println(d1.weight + "kg");
		System.out.println(d1.color);
		
		d1.bark();
		d1.eat();
		
		System.out.println("=============");
		
		Dog d2 = new Dog();	// 설계도 하나로 여러 개의 인스턴스를 만들 수 있다. (코드의 재사용)
		
		System.out.println(d2.name); // 문자열 타입의 경우, 값이 없으면 null값을 출력한다.
		System.out.println(d2.weight); // 숫자 타입의 경우, 값이 없으면 0(정수), 0.0(실수) 출력
		
			
	}
}
