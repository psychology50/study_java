package study05;

abstract class MyAbsParent {
	protected String name = "MyAbsParent";
	// 일반 메서드
	public void show() {
		System.out.println(name);
	}
	// 구현부가 없는 추상 메서드
	public abstract void abstractShow();
}

class MyChild extends MyAbsParent {
	// 추상 메서드는 반드시 재정의 해야한다.
	@Override
	public void abstractShow() {
		
		// TODO Auto-generated method stub
		System.out.println("MyChild's abstractShow()");		
	}
}

public class Practice029 {
	
	public static void main(String[] args) {
		MyChild child = new MyChild();
		child.show();	// 상속받은 일반 메서드 호출
		child.abstractShow(); 	// 재정의된 추상 메서드 호출
	}

}
