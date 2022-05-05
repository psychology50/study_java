package study05;

// ==== 동물 클래스 ==== //
abstract class Animal {
	private String name;		// 이름
	
	public Animal(String name) { this.name = name; }
	
	public abstract void bark();		// 짖는다.
	public abstract String toString();  // 문자열 표현을 반환한다.
	
	public String getName() { return name; }
	
	public void introduce() {
		System.out.println(toString() + "입니다. ");
		bark();
	}
}

// ==== 냥이 클래스 ==== //
class Cat extends Animal {
	private int age;			// 나이
	
	public Cat(String name, int age) { 
		super(name); this.age = age; 
	}
	
	public void bark() { System.out.println("야옹!"); }
	
	public String toString() { return age + "살인 " + getName(); }
}

// ==== 댕댕이 클래스 ==== //
class Dog extends Animal {
	private String type;		// 견종
	
	public Dog(String name, String type) {
		super(name);	this.type = type;
	}
	
	public void bark() { System.out.println("멍멍!!"); }
	
	public String toString() { return type + "인 " + getName(); }
}

public class Homework_abstract {
	public static void main(String[] args) {
		Animal[] a = {
				new Dog("바둑이", "삽살개"),	// 댕댕이
				new Cat("야룽이", 7),			// 고양이
				new Dog("백두", "진돗개"),		// 댕댕이
		};
		
		a[0].bark();			// 멍멍!
		System.out.println();
		
		for (Animal k : a) {
			k.introduce();				// k가 참조하고 있는 인스턴스 형에 따라서 메소드가 호출된다.
			System.out.println();
		}
	}
}
