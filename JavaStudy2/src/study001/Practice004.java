package study001;  // Q: 조상 클래스를 상속받은 자손 클래스를 상속받는 또 다른 자손 클래스가 가능한다?

class Animal {
	public void Sound() {
		System.out.println("소리낸다");
	}
}
class Dog extends Animal {
	String name;	// 확장
	public void Sound() {
		System.out.println("강아지가 소리낸다");
	}
	
}
class Cat extends Animal {
	String name;
	public void Sound() {
		System.out.println("고양이가 소리낸다");
	}
	
}

public class Practice004 {
	
	public static void main(String[] args) {
		// 프로그램에서의 실존한다 = 공간을 차지한다.
		// '사람'은 분류를 위한 정의일 뿐 실존하는 객체를 명시하는 것은 아니다. 하지만 '양재서'는 실존하는 객체이다.
		
		//Non-Casting			
		Dog poppi = new Dog();
		poppi.Sound();
		Cat yummi = new Cat();
		yummi.Sound();
		
		// 오버라이딩과 오버로딩의 차이점. 오버로딩 : 새로운 메소드를 정의, 오버라이딩 : 기존의 메소드를 재정의
		// 면접 때, 객체지향을 왜 사용하는지 등을 자주 질문한다.
		
		// casting : 클래스 자료형 변환
		// upCasting, downCasting 개념 이해
		// 상위 클래스의 참조변수 = 하위클래스 객체
		
		Animal ani1 = new Dog ();
		ani1.Sound(); // !!!! 상위 클래스의 참조변수는 하위 객체의 재정의된 함수를 사용할 수 있다.
		//ani1.name="뽀삐" // 상위 클래스의 참조변수는 하위 객체의 확장된 멤버에는 접근할 수 없다.
		
		Animal ani2 = new Cat ();
		ani2.Sound();
		
		
	}

}
