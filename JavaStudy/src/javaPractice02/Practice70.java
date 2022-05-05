package javaPractice02;

class Zookeeper2 { // 사육사 클래스
	void feed(Animal animal) { // 사자에게 먹이주는 메서드
		System.out.println(animal + "에게 고기 추가");
	}
}

public class Practice70 {
	
	public static void main(String[] args) {
		Animal lion1 = new Lion(); // Lion 인스턴스 생성
		Zookeeper2 james = new Zookeeper2(); // james 라는 이름의 사육사 인스턴스 생성
		james.feed(lion1); // james가 lion1에게 먹이를 줌
		
		Animal rabbit1 = new Rabbit();
		james.feed(rabbit1);
		
		Animal monkey1 = new Monkey();
		james.feed(monkey1);
	}
}


