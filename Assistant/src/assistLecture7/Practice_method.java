package assistLecture7;

/*
[method(메서드)란...]
  사실 길게 설명할 게 없으니, 설명은 코드로 보여드리겠습니다.
한 가지 짚고 넘어갈 것은 메서드란 결국 함수입니다. 다만, 클래스 안에 선언된 함수를 메서드라고 합니다.

[클래스의 구조]
class 클래스명 {
	속성 (변수)
	동작, 기능 (메서드)
}
 
 */

// 클래스란?
// 현실세계의 객체를 본따서 시스템 상으로 옮겨 놓은 것을 말합니다.
// 클래스는 하나의 설계도고, main에서 이 설계도를 통해 인스턴스 변수를 선언할 때 비로소
// 프로그램이 '인지할 수 있는' 것이 됩니다.

class House_plan { // 나에게 어떤 집의 설계도가 있다.
	String color;  // 색상
	int roomsu; // 방의 개수
	void bell() {
		System.out.println("초인종이 울린다.");
	}
	void move() {
		System.out.println("하울의 움직이는 성...");
	}
	
	House_plan(String color, int roomsu) {
		this.color = color;
		this.roomsu = roomsu;
	}
	
	// 그런데 여기서 속성에 이 집의 거주자에 대한 정보를 담을 필요가 있을까?
	// 내가 만들고 싶은 것은 '집'이라는 객체지, 그 안에 살고 있는 사람에 대한 정보를 담을 필요는 없다.
	// (현실에서 집을 만들 때, 보통은 집을 만들고 거주자가 입주하지...거주자까지 설계도로 만들고 이런 건 말이 안 되니까요)
	// 만약 거주자와 집이 상호작용하는 프로그램을 만들고 싶다면, 집이라는 객체와 거주자라는 객체를 만들고
	// main에서 상호작용 시키는 것. 그것이 '객체 지향 언어'이다.
	
}

public class Practice_method {
	public static void main(String[] args) {
		House_plan house1 = new House_plan("pink", 8);
		// House_plan이란 설계도를 이용해 house1을 짓는다. (=메모리에 할당시킨다)
		// new 명령어로 메모리 할당을 요구하고, House_plan() 생성자에 의해 지어진다.
		
		System.out.println(house1.color);  // pink
		System.out.println(house1.roomsu); // 8
		/* (.)이란 ~안에 있다는 것을 의미하며, 이 경우엔 house1 인스턴스 변수 안의 color 값을 불러온다. */
		
		// 여기가 진짜 메서드 타임
//		bell(); // 컴파일 에러 -> 컴퓨터가 bell 함수의 존재 조차 인식하지 못 함.
		house1.bell(); // house1이 메모리에 올라가서 실존하는 상태가 되었으므로, 객체를 통해 bell 메서드 실행 가능
		
		house1.move(); // 즉, 집의 기능을 사용하고 싶다면, 일단 집을 지어라! 설계도는 아무런 기능을 하지 못 한다.
	}

}




