package javaPractice02;

class Car3 {
	String color;		 // 색상
	String gearType;	 // 변속기 종류 - auto / manual
	int door;			 // 문의 개수
	
	Car3() {
		this("white", "auto", 4);
	}
	
	Car3(String c) {
		this(c, "auto", 4);
	}
	
	Car3(String c, String g, int d) {
		this.color = c; // c로 입력하면 color = c로 입력해도 무방하다. this를 사용하는 이유는 this.color = color; 처럼 입력하는 경우, 이게 가독성이 더 향상된다.
		this.gearType = g;	// this : 인스턴스 함수 자신을 가리키는 키워드. 매개변수와 멤버변수 이름이 동일한 경우에 사용한다.
		this.door = d;
	}
}

public class Practice60 {
	
	public static void main(String[] args) {
		Car3 c1 = new Car3();
		Car3 c2 = new Car3("blue");
		
		System.out.println("c1의 color = "+ c1.color + ", gearType = "+ c1.gearType + ", door = " + c1.door);
		System.out.println("c1의 color = "+ c2.color + ", gearType = "+ c2.gearType + ", door = " + c2.door);
		
		Car3 c3 = new Car3("black", "manual", 2);
		System.out.println("c1의 color = "+ c3.color + ", gearType = "+ c3.gearType + ", door = " + c3.door);
	}

}
