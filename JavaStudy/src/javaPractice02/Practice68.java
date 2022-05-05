package javaPractice02;

class Animal {
	void breath() {
		System.out.println("숨쉬기");
	}
}

class Lion extends Animal {
	public String toString() { // 동물 클래스를 사속한 원숭이 클래스
		return "사자";
	}
}

class Zookeeper { //사육사 클래스
	void feed(Lion lion ) { // 사자에게 먹이 주는 메서드
		System.out.println(lion + "에게 고기 주기");
	}
}

public class Practice68 {
	
	public static void main(String[] args) {
		Lion lion1 = new Lion(); //Lion 인스턴스 생성
		Zookeeper james = new Zookeeper(); // james 라는 이름의 사육사 인스턴스 생성
		james.feed(lion1); // james가 lion1에게 먹이를 줌.
	}

}
