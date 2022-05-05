package study05;

// 추상 메서드 : 선언부만 정의하고 구체적 내용은 비워놓은 메서드.
//				 상속받은 하위 클래스에서 사용하고 싶다면 반드시 구현하라!

abstract class Pokemon { // 포켓몬 추상 클래스
	
	String name;
	
	abstract void attack(); // 공격 추상 메서드
	abstract void sound(); // 소리 추상 메서드
	
	public String getName() { // 포켓몬의 이름을 리턴하는 메서드
		return this.name;
	}
}

class Pikachu extends Pokemon { // 피카츄 클래스 // 구현부를 하나라도 생각하면 Pikachu에 빨간줄이 생긴다.
	Pikachu() { // 이름을 지정하는 생성자
		this.name = "피카츄";
	}
	void attack() { // 구체적으로 구현
		System.out.println("백만 볼트!");
	}
	void sound() {
		System.out.println("피카 삐까~!");
	}
}

class Squirtle extends Pokemon { // 피카츄 클래스
	Squirtle() { // 이름을 지정하는 생성자
		this.name = "꼬북이";
	}
	void attack() { 
		System.out.println("물대포!");
	}
	void sound() {
		System.out.println("꼬북 꼬북~!");
	}
}

public class Practice028 {
	
	public static void main(String[] args) {
		Pikachu pikachu1 = new Pikachu();
		System.out.println("이 포켓몬은 " + pikachu1.getName());
		pikachu1.attack();
		pikachu1.sound();
		
		Squirtle squirtle1 = new Squirtle();
		System.out.println("이 포켓몬은 " + squirtle1.getName());
		squirtle1.attack();
		squirtle1.sound();
	}

}
