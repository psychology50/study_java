package javaPractice02;

// 생성자 오버로딩
// 매개변수가 있는 생성자

class Car2 {
	String color;		 // 색상
	String gearType;	 // 변속기 종류 - auto / manual
	int door;			 // 문의 개수
	
	Car2() {}
	Car2(String c, String g, int d) {
		color = c;
		gearType = g;
		door = d;
	}
}

public class Practice59 {
	
	public static void main(String[] args) {
		// 방법①
		Car2 c1 = new Car2();
		c1.color = "Black";
		c1.gearType = "auto";
		c1.door = 4;
		
		// 방법②
		Car2 c2 = new Car2("Yellow", "manual", 2); // 코딩 시, 편의성과 가독성이 증대된다.
		
		System.out.println("c1의 color = "+ c1.color + ", gearType = "+ c1.gearType + ", door = " + c1.door);
		System.out.println("c1의 color = "+ c2.color + ", gearType = "+ c2.gearType + ", door = " + c2.door);
	}

}
