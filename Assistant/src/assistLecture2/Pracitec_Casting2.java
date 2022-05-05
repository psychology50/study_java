package assistLecture2;

public class Pracitec_Casting2 {
	
	public static void main(String[] args) {
		
		System.out.println("============ [4] 실수형 형변환 ============\n");
        //1. doulbe -> float 강제 형변환(float타입 범위 내 값)
        double d1 = 1.1234;
        float f1 = (float)d1;
        System.out.println("[double -> float] d1의 값 :"+d1+", f1의 값:"+f1);
        
        //2. doulbe -> float 강제 형변환(float타입 최소 값보다 작은 경우)
        double d2 = 1.0e-50;
        float f2 = (float)d2;
        System.out.println("[double -> float] d2의 값 :"+d2+", f2의 값:"+f2);
        
        //3. doulbe -> float 강제 형변환(float타입 최대 값보다 큰 경우)
        double d3 = 1.0e100;
        float f3 = (float)d3;
        System.out.println("[double -> float] d3의 값 :"+d3+", f3의 값:"+f3);
        
        //4. doulbe형과 float의 정밀도 차이
        double d4 = 9.123456789;
        float f4 = (float)d4;
        System.out.println("[정밀도 차이] d4의 값 :"+d4+", f4의 값:"+f4);
        /*
         · 범위 내 값에서 강제 형변환 할 경우 데이터의 손실없이 변환된다.
		 · float이 가질 수 있는 최소 값보다 작은 경우 0이 된다.
		 · float이 가질 수 있는 최대 값보다 큰 경우 무한대가 된다.
 		 · float의 범위 내 값이지만 소수점 아래 값에서의 정밀도 차이가 난다. 
                 
         */
        
        
        System.out.println("\n============ [5] 정수형과 실수형 형변환 ============\n");
        //float -> int 강제 형변환
        float f5 = 12345.67f;
        int i1 = (int)f5;
        System.out.println("[float -> int] f5의 값 :"+f5+", i1의 값:"+i1); // 소수점 이하 값을 버린다.
        
        //double -> int 강제 형변환                
        double d5 = 12345.678;
        int i2 = (int)d5;
        System.out.println("[double -> int] d5의 값 :"+d5+", i2의 값:"+i2); // 소수점 이하 값을 버린다.
        
        
        System.out.println("\n============ [6] 다소 유별난 String의 형변환 ============\n"); // 출력문은 따로 작성 안하겠습니다 :)
      //자바 문자를 숫자로 변환
      //자바 숫자를 문자로 변환

      //java String을 int로 변환 [String to int]
      String str1 = "1";
      Integer.parseInt(str1);

      //java String을 Float으로 변환 [String to float]
      String float1 = "2.0";
      Float.parseFloat(float1);

      //java String을 Double으로 변환 [String to double]
      String double1 = "3.0";
      Double.parseDouble(double1);

      //java int를 String으로 변환 [int to string]
      int int2 = 1;
      String.valueOf(int2);

      //java float을 String으로 변환 [float to string]
      float float2 =  3.5f;
      String.valueOf(float2);

      //java double을 String으로 변환 [double to string]
      double dobule2 = 5.5d;
      String.valueOf(dobule2);

      //java boolean을 String으로 변환 [boolean to string]
      boolean boolean2  = true;
      String.valueOf(boolean2);

      //java char를 String으로 변환 [char to string]
      char[] charArray = {'a','b','c'};
      String.valueOf(charArray);

      //java object String으로 변환 [object to string]
      Object object1 = new Object();
      String.valueOf(object1);
        
	}

}
