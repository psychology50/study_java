package study06;

interface OuterInterface {
	int x = 100;	// public final static 생략
	
	interface InnerInterface {
		int y = 200;
		void display(); // public abstract 생략 (얘는 구현을 해줘야 하기 때문)
	}
	class InnerClass implements InnerInterface { // 내부 클래스
		private int z;
		public InnerClass() { // 생성자 : 보통 초기값 잡는 용도
			 this.z = 300;
		}
		public void display() {
			System.out.println("x = " + x);
			System.out.println("y = " + y);
			System.out.println("z = " + z);
		}
	}
}

public class Practice038 {
	
	public static void main(String[] args) {
		
		OuterInterface.InnerInterface oi1 = new OuterInterface.InnerInterface() {
			public void display() {
				System.out.println("y = " + y);
			}
		};
		OuterInterface.InnerClass oi2 = new OuterInterface.InnerClass();
		
		oi1.display(); // y = 200
		oi2.display();
		// x = 100	y = 200	 z = 300
		
		System.out.println("x = " + OuterInterface.x); // x = 100
		System.out.println("y = " + OuterInterface.InnerInterface.y); // y = 200
		//System.out.println("z = " + OuterInterface.InnerClass.z); // 에러
		//OuterInterface.InnerClass.display(); // 에러
	}

}
