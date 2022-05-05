package javaPractice01;

public class Practice50 {
	
	public static void main (String[] args) {
		// 같은 패키지 내에 클래스가 생성된 파일이 하나만 있어도 다른 파일에서도 작동한다.
		// Practice49.java 에서 Car class를 생성했기 때문에 따로 다시 정의하지 않아도 사용할 수 있다.
		
		Car mycar1 = new Car(); //car 인스턴스 생성
		Car mycar2 = new Car(); //car 인스턴스 하나 더 생성
		
		mycar1.color = "red";	//mycar1의 색상 빨강
		mycar2.color = "black"; //mycar2의 색상 검정
		mycar1.speedUp(); // mycar1 엑셀 메서드 호출
		mycar2.wiper();   // mycar2 와이퍼 메서드 호출
		
		System.out.println("mycar1의 색 : " + mycar1.color);
		System.out.println("mycar2의 색 : " + mycar1.color);
		System.out.println("mycar1의 속도 : " + mycar1.speed);
		System.out.println("mycar2의 속도 : " + mycar1.speed);
		System.out.println("mycar1의 와이퍼 작동 여부 : " + mycar1.wiperOn);
		System.out.println("mycar2의 와이퍼 작동 여부 : " + mycar2.wiperOn);
		
	}

}
