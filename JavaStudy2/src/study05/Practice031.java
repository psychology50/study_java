package study05;

interface Camera {
	void photo();
}

interface Call {
	void calling();
}

interface Memo {
	void write();
}

interface Clock {
	void clock();
}

class MyCellPhone implements Camera, Call, Memo, Clock {
	public void clock() {
		// 시계 메서드
	}
	public void calling() {
		
	}
	public void write() {
	
	}
	public void photo() {
		
	}
}

class PhoneUser {
	void call(Call c) {
		System.out.println("전화를 걸었습니다.");
	}
}

public class Practice031 {
	
	public static void main(String[] args) {
		MyCellPhone phone1 = new MyCellPhone();
		Camera phone2 	   = new MyCellPhone();
		Call phone3 	   = new MyCellPhone();
		Memo phone4 	   = new MyCellPhone();
		Clock phone5 	   = new MyCellPhone();
		
		PhoneUser user1    = new PhoneUser();
		user1.call(phone3);
		user1.call(phone1);
		// user1.call(phone2); // 카메라로 구현을 했기 때문에 통화가 불가능 하다.
	}

}
