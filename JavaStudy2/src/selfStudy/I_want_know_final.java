package selfStudy;

public class I_want_know_final {
	
	public static void main(String[] args) {
		
		// 1.1 원시타입 final
		final int x = 1; // 변경할 수 없는 상수값
//		x=3; // 불가능. 한 번 assign되면 변경할 수 없다.
		
		// 1.2 객체타입 final
		final Pet_test pet = new Pet_test(); // 다른 참조 변수를 덮어 씌울 수 없다. 객체의 속성 자체는 바꿀 수 있다.
//		pet = new Pet(); // 다른 객체로 변경할 수 없음.
		pet.setWeight1(3); // 객체 필드는 변경할 수 있음.
		
		// 1.3 메서드 인자 final
		// 1.4 멤버변수 final : 클래스 멤버변수에 쓰이면 write-once 필드로 한 번만 쓰이게 된다. 단, static 유무에 따라 초기화 시점은 달라짐
		/* 	(1) static final 멤버변수 (static final int x = 1)
				- 값과 함께 선언 시	   - 정적 초기화 블록에서
				정적 초기화 블록 : 클래스 로드 시, 한 번만 블록 실행
		    (2) instance final 멤버변수 (final int x = 1)
				- 값과 함께 선언 시    - 인스턴스 초기화 블록에서   - 생성자 메서드에서
				인스턴스 초기화 블록 : 객체 생성할 때마다 블록 실행, 부모 생성자 이후 실행, 생성자보다 먼저 실행
		*/								 
		
	}

}

class Pet_test {
	void setWeight1(int weight1) {
		System.out.println("Weight :" + weight1);
	}
	// 2. final 메서드
	public final void makeSound() { // 자식 클래스에서 override 불가능. 구현 코드 변경을 원치 않을 때 사용한다.
		System.out.println("ahaha");
	}

// 1.3 메서드 인자 final
	int weight2;
	public void setWeight2(final int weight2) { // 메서드 내에서 변수값을 변경할 수 없다.
//	weight = 1; // final인자는 메서드 안에서 변경할 수 없음
	}
}

class Dog extends Pet_test {
	// final로 된 메서드는 override할 수 없다.
//	public void makeSound() {
//		
//	}
}

// 3. final 클래스
// 클래스 상속 자체를 막음. ex) 상수 값을 모아준 클래스를 굳이 상속할 필요가 없는 경우
final class Pet_final {
	
}
//public class Dog_final extends Pet_final{ 
//	
//}
