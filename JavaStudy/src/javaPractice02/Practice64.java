package javaPractice02;

class Car4 {
	int wheel;
	int speed;
	String color;
	
	Car4(String color) {
		this.color = color;
	}
}

class SportsCar extends Car4 {
	int speedLimit; // 제한속도 km
	
	SportsCar(String color, int speedLimit) {
		super(color); // 부모 클래스에는 매개변수를 명시하지 않은 상속자가 없기 때문에 이 라인이 없으면 에러가 뜬다. (?)
		//this.color = color;
		this.speedLimit = speedLimit;
	}
}

public class Practice64 {
	
	public static void main(String[] args) {
		SportsCar sportsCar1 = new SportsCar("red", 330);
		
		System.out.println(sportsCar1.color);
		System.out.println(sportsCar1.speedLimit);
		
	}

}

