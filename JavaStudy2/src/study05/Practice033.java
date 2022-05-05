package study05;

interface Skinnable {
	int BLACK = 0;		// public(다른 클래스에서 접근 가능한) static(메모리 할당 x, 객체를 생성하지 않아도 사용가능) final이 생략되었다.
	int RED = 1;		// static 덕에 객체를 생성하지 않아도 나중에 사용가능하다.
	int GREEN = 2;
	int BLUE = 3;
	int LEOPARD = 4;
	void changeSkin(int skin);	// * 스킨 변경,  public abstract 생략
}

class PortablePlayer implements Player, Skinnable {
	private int skin = BLACK;
	
	public PortablePlayer() { }		// 생성자
	
	public void play() {
		System.out.println("⋄ 재생시작!");  // 재생
	}
	
	public void stop() {
		System.out.println("⋄ 재생종료!");  // 정지
	}
	
	public void changeSkin(int skin) {			// 스킨 변경
		System.out.print("스킨을 ");
		switch(skin) {
		 case BLACK:  	System.out.print("흑색");		  break;	// 0번, 1번...으로 써놓으면 구분이 잘 안가므로 열거형 사용
		 case RED:  	System.out.print("적색");	 	  break;
		 case GREEN:  	System.out.print("녹색");	 	  break;
		 case BLUE:  	System.out.print("청색");	      break;
		 case LEOPARD:  System.out.print("표범무늬");	  break;
		 default:		System.out.print("기본값");       break;
		}
		System.out.println("(으)로 변경하였습니다.");
	}
}

public class Practice033 {
	
	public static void main(String[] args) {
		PortablePlayer a= new PortablePlayer();
		a.play();
		a.stop();
		// System.out.println(Skinnable.LEOPARD);
		a.changeSkin(Skinnable.LEOPARD); 	// a.changeSkin(4) 보다 가독성이 좋음.
	}

}
