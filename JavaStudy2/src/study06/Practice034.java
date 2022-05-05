package study06;

// 클래스 자체가 단독적인 작동보다는 상속을 목적으로 한다.
// 애초에 혼자 코딩을 할 거면 딱히 추상 클래스를 만들 이유도 없음.

// ===== 도형 ===== //
abstract class Shape { // 추상 클래스
	// 그림 그리기(추상 메소드)
	abstract void draw();
}

// ===== 점 ===== //
class Point extends Shape { // 추상 클래스를 상속
	Point() { } // 생성자
	
	void draw( ) { // 추상 메소드를 정의
		System.out.println('+');
	}
}

// ===== 직사각형 ==== //
class Rectangle extends Shape { // 추상 클래스를 상속
	private int width;			// 폭
	private int height;			// 높이
	
	Rectangle(int width, int height) { // 생성자
		this.width = width;
		this.height = height;
	}
	
	void draw( ) { // 추상 메소드를 정의
		for (int i = 1; i<= height; i++) {
			for(int j = 1; j <= width; j++) {
				System.out.print('*');
			}
		System.out.println();
		}
	}
}

public class Practice034 {
	
	public static void main(String[] args) {
		// 아래 선언은 에러 : 추상 클래스는 인스턴스로 생성하 수 없다.
		// Shape s = new Shape()
		
		Shape[] a = new Shape[2];	// 추상 클래스이자 부모 클래스로 데이터 타입을 설정. // 추상 클래스는 객체를 만들 수는 없지만 다형성의 대상이 될 수는 있다.
		a[0] = new Point();
		a[1] = new Rectangle(4, 3);
		
		for (Shape s : a) {	// for-each 문
			s.draw();
			System.out.println();
		}
		
		for (int i = 0; i < a.length; i++) {
			a[i].draw();
			System.out.println();
		}
	}

}
