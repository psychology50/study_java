package study002;

class C03Simple {
	int num;
	C03Simple(int num) {
		this.num = num;
	}
	@Override
	public boolean equals(Object obj) {	 //Object obj=sim2 // 상위 클래스가 하위 클래스에 접근하기 위해 다운캐스팅 과정이 필요하다.
		
		if(obj instanceof C03Simple) {	 // obj가 연결한 객체가 C03Simple이 맞는지 확인
		C03Simple down = (C03Simple)obj; // downCasting
		return (this.num == down.num);	 // 멤버 값 비교 후 결과(true // false) 리턴
		}
		return false; // obj가 연결한 객체가 C03Simple이 아니라면 false리턴
	}
	
}

public class Practice009 {
	
	public static void main(String[] args) {
		
		// Object ob1 = new Object();
		// Object ob2 = new Object();
		
		//System.out.println(ob1.equals(ob2));
		
		C03Simple sim1 = new C03Simple(100);
		C03Simple sim2 = new C03Simple(100);
		System.out.println(sim1.equals(sim2));
	}

}
