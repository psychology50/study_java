package study004;

class Company{
	// 싱글톤 패턴 : 전역 변수 없이 객체 하나만을 생성해서 어디서든지 참조할 수 있도록 하는 디자인 패턴
	private static Company instance = new Company();	// private : 이 클래스 내에서만 쓴다.
	private Company() {}	// 다른 클래스에서 이 객체를 만들 수 없다.
	public static Company getInstance() {	// 객체 Company의 주소를 반환한다.			
		if(instance == null) {								
			instance = new Company();	// 객체를 힙영역에 연결한다.
		}
		return instance;	// 객체의 주소를 전송한다.
	}
	
	int num1;
}
//스택영역 : {}
//힙 영역  : 객체 저장영역
//클래스 영역 (메서드 영역) : 생성자 메서드, static 메서드, static 변수, 일반 메서드

public class Practice026 {
	
	public static void main(String[] args) {
		
		Company com1 = Company.getInstance();
		Company com2 = Company.getInstance();
		System.out.println(com1 == com2); // 주소가 같으니 true 값 출력
		
		com1.num1 = 222;
		System.out.println(com2.num1);		
	}

}
//  stack 	<--------->	 heap  <---------->  Class
//  com1		      Company 객체 			instance
//	com2