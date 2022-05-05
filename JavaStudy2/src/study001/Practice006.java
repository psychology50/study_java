package study001;

class P06Animal {
	public void Sound() {
		System.out.println("소리낸다");
	}
}
class P06Dog extends P06Animal {
	String name;	// 확장
	public void Sound() {
		System.out.println("강아지가 소리낸다");
	}
	
}
class P06Cat extends P06Animal {
	String name;
	public void Sound() {
		System.out.println("고양이가 소리낸다");
	}
	
}
class P06Tiger extends P06Animal {
	String name;
	public void Sound() {
		System.out.println("호랑이가 소리낸다");
	}
	
}

public class Practice006 {
	
	public static void main(String[] args) {
		
		try {
		P06Animal ani1 = new P06Dog();
		P06Animal ani2 = new P06Cat();
		P06Animal ani3 = new P06Tiger();
		
		P06Dog dog1 = changeDog(ani1);	// 정상적인 다운 캐스팅된 결과
		dog1.name = "뽀삐";
		dog1.Sound();
		
		P06Dog dog2 = changeDog(ani2); // 잘못된 다운캐스팅. 아래의 Animal ani까지는 받아지나 그 뒤에 에러
		}
		catch(Exception e) {
			System.out.println("예외 발생됨!!");
		}
	}
	
	public static P06Dog changeDog(P06Animal ani) throws Exception { // 업캐스팅 가능 매개변수
		P06Dog down = (P06Dog)ani; // 다운캐스팅. 잘못된 객체(Dog가 아닌 다른 객체)가 전달되면 예외발생!
		
		return down;			   // 다운캐스팅한 객체 주소전달
		
	} 

}
/*
 	예외 처리: 경미한 형태에 오류 상황에서 프로그램이 정지되지 않고 나머지 코드를 실행할 수 있도록 처리하는 코드
 	
 	상속: 상-하위 클래스 관계를 통해서 상위 클래스의 멤버들을 하위 클래스가 그대로 사용하거나, 고쳐쓰거나(재저으이)를 허용한 문법
 		  하위 클래스에서 재정의한 메서드는 상위 클래스 참조변수에서 접근 가능하지만
 		  하위 클래스에서 새로 선언한 멤버는 상위 클래스 참조변수에서 접근 불가능하다.
 		  
    UP : 상위 클래스 참조변수 - 하위 클래스 객체를 연결
    DOWN :
 */
