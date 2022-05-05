package javaPractice02;

// 변수의 범위 및 오버로딩
// 클래스 메서드와 인스턴스 메서드

class MyMath2 {
	int a, b;
	
	// 인스턴스 변수 a, b만을 이용하여 작업하므로 매개변수가 필요없다.
	int add() { System.out.print("add() 실행 : "); return a + b; } // a, b는 인스턴스 변수
	int subtract() { System.out.print("subtract() 실행 : ");	return a - b; }
	int multiply() { System.out.print("multioply() 실행 : ");	return a * b; }
	double divide() { System.out.print("divde() 실행 : "); 	return a / b; }
	
	// 인스턴스 변수와 관계없이 매개변수만으로 작업이 가능하다.
	static int add(int a, int b) { System.out.println("static add() 실행"); return a + b; }
	// a, b는 지역변수
	static int subtract(int a, int b) { return a - b; }
	static int multiply(int a, int b) { return a * b; }
	static double divide(int a, int b) { return a / b; }
		
}

public class Practice57 {
	
	public static void main(String[] args) {
		// 클래스 메서드 호출
		System.out.println(MyMath2.add(200, 100)); // 300
		System.out.println(MyMath2.subtract(200, 100)); // 100
		System.out.println(MyMath2.multiply(200, 100)); // 20000
		System.out.println(MyMath2.divide(200, 100)); // 2.0
		
		MyMath2 mm = new MyMath2();
		mm.a = 200;
		mm.b = 100;
		//인스턴스 메서드는 객체생성 후에만 호출이 가능함
		System.out.println(mm.add()); // 300
		System.out.println(mm.subtract()); // 100
		System.out.println(mm.multiply()); // 20000
		System.out.println(mm.divide()); // 2.0
	}

}