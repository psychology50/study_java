package javaPractice02;

class Rabbit extends Animal { // 동물 클래스를 상속한 토끼 클래스
	public String toString() {
		return "토끼";
	}
}
class Monkey extends Animal {
	public String toString() { // 동물 클래스를 상속한 원숭이 클래스
		return "원숭이";
	}
}

class Zookeeper1 { // 사육사 클래스
	void feed(Lion lion) { // 사자에게 먹이 주는 메서드
		System.out.println(lion + "에게 고기 추가");
	}
	void feed(Rabbit rabbit) { // 토끼에게 먹이 주는 메서드
		System.out.println(rabbit + "에게 고기 추가");
	}
	void feed(Monkey monkey) { // 원숭이에게 먹이 주는 메서드
		System.out.println(monkey + "에게 고기 추가");
	}
}

public class Practice69 {
	
	public static void main(String[] args) {
		Lion lion1 = new Lion(); // Lion 인스턴스 생성
		Zookeeper1 james = new Zookeeper1(); // james라는 이름의 사육사 인스턴스 생성
		james.feed(lion1); // james가 lion1에게 먹이를 줌
		
		Rabbit rabbit1 = new Rabbit();
		james.feed(rabbit1);
		
		Monkey monkey1 = new Monkey();
		james.feed(monkey1);
	}

}