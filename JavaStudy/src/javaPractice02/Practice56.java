package javaPractice02;

class Cellphone {
	String model = "Galaxy z Flip 3";
	String color;
	int capacity;
	
	// 생성자의 특징 1) 클래스의 이름과 같다 2) 반환형이 없다 3) 인스턴스 생성 시, 단 한 번만 자동 실행된다.
	
	// 생성자를 정의하지 않으면 void  생성자가 기본으로 제공
	// 생성자를 정의하면 자바가 제공이 되는 void 생성자가 사라짐
	// void 생성자를 사용하려면 따로 정의를 내려줘야 함
	
	Cellphone(String color, int capacity) { // 매개변수가 있는 생성자
		this.color = color;
		this.capacity = capacity;
	}
}

public class Practice56 {
	
	public static void main(String[] args) {
		// Cellphone myphone1 = new Cellphone(); // 에러 발생
		Cellphone myphone = new Cellphone("Black", 256); // 생성자를 만들었기 때문!!
		
		System.out.println(myphone.model);
		System.out.println(myphone.color);
		System.out.println(myphone.capacity);	
	}

}
