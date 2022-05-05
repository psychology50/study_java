package assistLecture2;

// Casting(형변환) : 사전적 의미로 주조하다. 즉, 재료를 형틀에 맞춰 굳히는 것을 의미합니다.
//					 => 기존 타입의 값을 원하는 다른 타입으로 바꾸겠다!! (Object타입에 대해 배우시지 않으셨다면 짚어드리는 것만 보시면 됩니다.)

/*
   1. 형변환의 종류 
      (1) 자동 형변환
  	  (2) 강제 형변환
  
   2. 형변환의 목적
   	  : 다른 타입간의 대입, 연산등을 할 때 서로의 타입을 맞춰주기 위함.
   	     => 그런데.. 값이 큰 데이터 자료형을 보다 작은 데이터 자료형으로 바꾸면 어떻게 될까?
   
   3. 자동 형변환
      · 작은 데이터 값에서 큰 데이터 값 방향으로는 자동 형변환이 가능하다.
      · byte -> short(=2byte) -> int(=4byte) -> long(=8byte) -> float(=4byte) -> double(=8byte)
    						char↗					정수			실수    => 값의 범위 크기 차이로 오류가 날 수 있긴 하다.
   4. 강제 형변환 (명시적 형변환)
      · 자동 형변환의 역순으로 진행시키기 위한 작업.												
 */

// 외우실 필요 없습니다. 필요할 때 찾아서 적용할 수 있을 정도만 익혀두시면 됩니다.
// 설명을 모두 듣고 복습하시면 느낌이 오시겠지만 명시적 형변환 과정을 거치면 버려지는 값들이 존재하기도 하고, 여러모로 까다롭기 때문에
// 자주 쓰는가? 라고 물어보신다면 기초 단계에선 '아니오'라고 답할 수 있습니다. 그래도 알아두시면 좋습니다!!

public class Practice_Casting1 {
	public static void main(String[] args) {
				
		System.out.println("============ [1] 자동 형변환 ============\n");
		// 1. 자동 형변환
		int i = 100;
		double d = i; // int -> double
		
		char c = 'a';
		int j = c; // char -> int
			
		System.out.println("int타입 변수 j의 값: " +j);    // 97    -> ASCII
		System.out.println("double타입 변수 d의 값: " +d); // 100.0
			
		System.out.println("\n============ [2] String -> int ============\n"); // 절대 이해 불가능
		// 2. int형을 String형으로 바꾸는 방법
		int strTest1 = 1;
		int strTest2 = 2;
		System.out.println(strTest1 + strTest2); // 3
		
		String strCast1 = String.valueOf(strTest1);
		String strCast2 = String.valueOf(strTest2);
		System.out.println(strCast1 + strCast2); // 12 (문자열을 더한 것이므로)
		
		System.out.println("\n============ [3] int -> byte ============\n");
		// 3. int 타입을 byte로
		// (1) 값이 클 경우
		int intTest1 = 10;
		byte byteTest1 = (byte)intTest1; // 명시적 형 변환을 하지 않으면 에러 발생
		System.out.println("[int -> byte] i의 값 : " + intTest1 + ", byteTest의 값 : " + byteTest1);
		
		// (2) 값이 작을 경우
		int intTest2 = 1000;
		byte byteTest2 = (byte)intTest2;
		System.out.println("[int -> byte] i의 값 : " + intTest2 + ", byteTest의 값 : " + byteTest2); // byte의 값의 범위를 초과 => 쓰레기 값 출력
		
		
	}
}
