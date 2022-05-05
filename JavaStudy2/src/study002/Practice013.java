package study002;

// 알아보기. 인터페이스와 추상 클래스의 차이

abstract class tmp{
	
	public abstract void showMember(); // 본체가 빠져 있어 객체를 생성할 수 없다. (추상 클래스) 무조건 overriding이 선행되어야 한다.
									 // 추상 클래스에는 무조건 미완성된 함수가 하나 이상 있어야 한다. but, 함수를 만들 수 있긴 하다. 
	public void member() {
		
	}
	
	
}

class C07Simple implements Cloneable{
	int num1;
	double num2;
	String name;
	C07Simple(int n1, double n2, String n3) {
		this.num1 = n1;
		this.num2 = n2;
		this.name = n3;
	}
	public void ShowMember() {
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		System.out.println("num3 : " + name);
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
}

public class Practice013 {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		C07Simple obj1 = new C07Simple(10, 10.5, "홍길동");
		obj1.ShowMember();
		System.out.println("-------------");
		
		C07Simple obj2 = (C07Simple)obj1.clone();
		System.out.println("obj1 : " + obj1);
		System.out.println("obj2 : " + obj2);
		obj2.ShowMember();
	}

}


