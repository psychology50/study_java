package assistLecture;
import java.util.Random;

// 자바에서 랜덤함수를 사용하는 방법!!
// (1) Random 클래스		(2) Math 클래스에 내장된 random 메서드 불러오기

public class Practice_random {
	public static void main(String[] args) {
		
		// [1] Random Class 
		System.out.println("======== [1] Random Class ========");
		
		Random random = new Random();
		
		System.out.println(random.nextBoolean()); // true or false
		System.out.println(random.nextFloat());   // range : 0.0f ~ 1.0f
		System.out.println(random.nextInt());     // (-2,147,483,648 ~ 2,147,483,647) 사이의 정수
		System.out.println(random.nextInt(100));  // range : 0 ~ 99
//		System.out.println(random.nextInt(-100));        // Error!
		System.out.println(random.nextInt(100) * (-1));  // ok! 음수값을 랜덤으로 리턴하는 방법
//		<구조> int 변수 = random.nextInt(최대값 + 1) + 최소값
		
		
		
		
		// [2] Math Class - random method
		System.out.println("======== [2] Random method ========");
		// math 클래스란? 수학에서 자주 사용하는 상수, 함수들을 미리 이클립스에서 구현해놓음
		//				  가장 큰 특징은 객체 생성없이 사용할 수 있고 java.lang 패키지에 포함되어 있다.
		
		double randomValue = Math.random(); // random메서드는 그대로 사용하면 0.0f <= value < 0.1f 사이의 값을 반환한다.
											// Random클래스의 nextFloat() 메서드와 동일하다고 봐도 무방하다.
		int intValue = (int)(randomValue * 100) + 1; // (int)는 float타입을 int형으로 바꾸기 위해 명시적 형 변환한 것.
//		<구조> int 변수 = (int)(Math.random() * (최대값 +1)) + 최소값  
		
	}

}
