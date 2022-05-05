package study001;

class P05Animal {
	public void Sound() {
		System.out.println("소리낸다");
	}
}
class P05Dog extends P05Animal {
	String name;	// 확장
	public void Sound() {
		System.out.println("강아지가 소리낸다");
	}
	
}
class P05Cat extends P05Animal {
	String name;
	public void Sound() {
		System.out.println("고양이가 소리낸다");
	}
	
}

public class Practice005 {
	
	public static void main(String[] args) {
		
		try {
		// upCasting
		P05Animal ani1 = new P05Dog();
		P05Animal ani2 = new P05Cat();
		
		//downCasting
		P05Dog down1 = (P05Dog)ani1; // 정상적인 다운캐스팅. ani1이 가리키는 객체가 P06Dog 객체이고 연결하려는 참조변수도 P06Dog클래스로 만든 경우
		P05Dog down2 = (P05Dog)ani2; // 잘못된 다운캐스팅. ani2가 가리키는 객체가 P06Cat인데 연결하려는 참조변수는 P06Dog클래스로 만든 경우
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("나머지 실행코드~~~");
	}

}
