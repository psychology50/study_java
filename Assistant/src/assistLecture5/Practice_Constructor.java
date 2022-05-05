package assistLecture5;


//Constructor(생성자) : 객체 생성시 호출되어, 변수들을 초기화하는 메서드
//						- 클래스와 이름이 같고, 리턴 타입 및 반환값이 없다.
// 클래스명 참조변수 = new 클래스명(); 에서 '클래스명()' 이 바로 생성자다. 

/*	기본 생성자
	[구조]
	- 선언부 : 클래스명() {}
		Aclass() { x=100; }
	- 구현부 : 클래스명()
		new Aclass();   

*/

class Aclass001{
	// 기본생성자(default 생성자)
	Aclass001() {
		System.out.println("Aclass 기본생성자( )");
	}
}

class CellPhone {
	String model = "Galaxy Flip3";
	String color = "Lavender";
	int capacity = 256;

	CellPhone() { // Cellphone의 default 생성자
		System.out.println("model: " + model);
		System.out.println("color: " + color);
		System.out.println("capacity: " + capacity);
	}
}

/*	매개변수 생성자
	[구조]
	- 구현부 : 클래스명(자료형 변수명..) {}
		Bclass(int a) { x = a; system.out.println("Bclass(): 매개변수 생성자, x: " + a);
	- 호출부 : 클래스명()
		new Bclass(10);

*/

class Bclass {
	String name;
//	Bclass () {} // 생성자 오버로딩
	Bclass(String name) { // 매개변수 생성자
		System.out.println("Bclass의 매개변수가 생성되었다.");
		this.name = name;	// this : 현재 객체를 지칭하는 키워드. 매개변수 변수명과 객체 내 멤버 변수 이름이 같을 경우 구분
	}
}

class Iphone {
	String model;
	String color;
	int capacity;
	
	Iphone() {	} // 디폴트 생성자도 존재하는 생성자 오버로딩
	Iphone(String model, String color, int capacity) {
		this.model = model;
		this.color = color;
		this.capacity = capacity;
	}
	void info() {
		System.out.println("model : " + model);
		System.out.println("color : " + color);
		System.out.println("capacity : " + capacity);
	}
}

public class Practice_Constructor {
	public static void main(String[] args) {
		new Aclass001(); // 기본 생성자
		
		Aclass001 a = new Aclass001(); // 객체 생성
		// Aclass001 객체 값을 담을 수 있는 구조 a의 공간을 new로 만들고 Aclass001()로 만든 객체 값을 a에 담아라
		
		CellPhone myPhone = new CellPhone();
		
		System.out.println();
		
		Bclass b = new Bclass("가길동");
//		Bclass b2 = new Bclass(); // 에러 : 매개변수 생성자를 만들면, 디폴트 생성자는 자동으로 생성되지 않는다.
		// 매개변수 생성자를 만들지 않으면 컴파일러가 자동으로 기본 생성자를 생성해준다. 하지만 내가 디폴드 값을 정하면 자동으로 생성하지 않는다.
		// 만약 매개변수 생성자를 입력하지 않았을 때, 기본 생성자를 만들고 싶다면 Bclass 메서드에 'Bclass() {}'를 코딩해주면
		// 생성자 오버로딩으로 여러 개의 생성자 중복 정의가 가능하다.
		System.out.println(b.name);
		
		System.out.println();
		
		Iphone myPhone1 = new Iphone();
		Iphone myPhone2 = new Iphone("Iphone 13 pro", "blue", 64);
		System.out.println(myPhone1.model);	// null 값 출력
		System.out.println(myPhone2.capacity);		
	}
}
