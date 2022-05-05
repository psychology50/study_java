package javaPractice02;

class Data1 { // 생성자를 정의하지 않아서 컴파일러가 기본 생성자를 만든다.
	int value;
}

class Data2 { // 생성자를 정의해서 컴파일러가 기본 생성자를 만들지 않는다.
	int value;
	
	Data2() { // 매개변수가 없는 생성자 : 변수값을 입력받지 않으면 기본값을 출력한다.
		value = 5;
	}
	
	Data2(int x) { // 매개변수가 있는 생성자.
		value = x;
	}
}

public class Practice58 {
	
	public static void main(String[] args) {
		Data1 d1 = new Data1();
		
		Data2 d2 = new Data2();	
		System.out.println(d2.value);
		
		Data2 d3 = new Data2(5);
		System.out.println(d3.value);
	}

}
