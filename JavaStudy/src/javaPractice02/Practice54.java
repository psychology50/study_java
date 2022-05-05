package javaPractice02;

class Area {
	
	static void manual() { // static이 있으믈 ㅗ클래스 메서드
		System.out.println("현재 사용 가능한 함수 목록");
		System.out.println("triangle : 삼각형 넓이");
		System.out.println("rectangle : 사각형 넓이");
		System.out.println("입니다.");
	}
	
	double triange (int a, int b) { // 삼각형 넓이를 반환하는 메서드
		return (double)a*b/2;
	}
	
	int rectangle(int a, int b) { //사각형 넓이를 반환하는 메서드
		return a*b;
	}
}

public class Practice54 {
	
	public static void main (String[] args) {
		
		Area.manual(); // 클래스 메서드 접근 가능
		//Area.triagle( 3, 5); // 에러발생
		//Area.rectange( 3, 5); // 에러발생
		
		Area cal = new Area();
		cal.manual();
		System.out.println(cal.triange(3, 5));
		System.out.println(cal.rectangle(3, 5));
		
	}

}
