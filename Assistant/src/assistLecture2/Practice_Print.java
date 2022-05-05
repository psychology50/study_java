package assistLecture2;

// 자바의 입출력문에 대한 심층적 고찰...

/*
  ####### 이해 안 가시는 게 정상이고, 아직 이해하려고 노력하실 필요조차 없는 내용입니다. #######
  
   1. System 클래스 => 저얼대 지금 이해하려고 하지 마세요. Java 기초 교육과정 제일 마지막에 직전에 배우는 내용입니다.
   
      · 자바의 입력문을 사용하기 위해서는 System 클래스를 import 해야합니다.
      · 하지만 System 클래스는 'java.lang' 패키지에 있고, 자바는 기본적으로 java.lang.*;을 적용하고 있습니다. ( * : 모두)
        (클래스와 패키지에 대해 이해하실 필요 없습니다. 중요한 건 별다른 작업을 수행하지 않고 쓸 수 있다는 것!!)
      · System을 치고 'ctrl + 마우스 좌클릭'을 하면 System 클래스 파일이 볼 수 있고 InputStream, PrintStream이 정의되어 있습니다.
        - 스트림(Stream)이란? 데이터들이 일차원적, 혹은 일렬로 흘러가는 형태
        - InputStream : 입력 받는 스트림 => in 을 쓸 수 있게 정의해둠
        - printStream : 출력 하는 스트림 => out 을 쓸 수 있게 정의해둠. 이로써 System.out 을 구현할 수 있다.
    
    2. System.out.(···)
      
      · System 안에(.) out 객체 안에 있는(.) 함수를 사용하겠다는 선언.
        "System.out.print 까지만 쳐보세요."
          => print, printf, println 를 사용할 수 있는 조건들을 보여준다.
      ★ 즉, print란 하나의 '함수'에 해당한다.
      · 세 가지 print의 차이
      	(1) print :  int , float, double, char, String, char[], boolean, Object
      	(2) println : print문에 자동으로 "\n"기능을 추가시켜준 것. 한 줄로 출력시키고 싶을 때는 print를 쓴다.
        (3) printf : String format   ( => c언어에서 따라온 친구)
            - 포매팅.. 설명보다 직접 보는 게 편합니다. 
*/

/*
    3. Summary 
       (1) 위에 내용 담으실 필요도 없고, 다 잊어버리셔도 됩니다.
       (2) print도 하나의 함수다.
       (3) 한줄로 출력하고 싶을 때 보통 print를 쓴다. 아니면 println
       (4) println으로 변수 출력하려는데 안 된다. or 좀 다르게 쓰고 싶다. 그러면 printf
 */


public class Practice_Print {
	public static void main(String[] args) {
		
		System.out.println("========= [1] print =========");
		System.out.print(111);		// int
		System.out.print("\n");
		System.out.print(7.8f);		// float
		System.out.print("\n");
		System.out.print(98.555);	// double
		System.out.print("\n");
		System.out.print('a');		// char
		System.out.print("\n");
		System.out.print("apple");	// String
		System.out.print("\n");
		char[] arr = { 'a', 'b', 'c' };
		System.out.print(arr);		// char array
		System.out.print("\n");
		System.out.print(true);		// boolean
		System.out.print("\n");
		Object obj = 'a';	
		System.out.print(obj);		// object
		System.out.print("\n");
		System.out.print("\n");
		
		System.out.println("========= [2] println =========");
		System.out.println(111);	   // int 
		System.out.println(7.8f);	   // float
		System.out.println(98.555);    // double
		System.out.println('a');	   // char
		System.out.println("apple");   // String
		System.out.println(arr);       // char array
		System.out.println(true);      // boolean
		System.out.println(obj);       // object
		
		System.out.println("========= [3] printf =========");
		// %d (int, 10진법 정수) , %f (float, 부동소수점) , %c (char, 유니코드 문자) , %s (String, 문자)
		// 변환 문자열이라고 더 있지만, 교육과정에서는 이 4가지 외엔 거의 안 씁니다.
		System.out.printf("정수형 : %d, 문자형 : %c\n", 500, 'c');		
		System.out.printf("버퍼 크기가 10인 정수 : %10d\n", 2525);
		System.out.printf("버퍼 크기가 10이고 소수점 아래 3자리까지 나타내는 실수 : %.3f\n", 2525.8849);
		System.out.printf("콤마 사용 정수 %,d\n", 7777777);
		System.out.printf("%s\n", "저는 문자열입니다!");
		
		String name = "양";
		int age = 99;
		String doc = "java"; 
				
		System.out.println("안녕, 내 이름은 " +name+"재서고, 나이는 " + age + "야");
		System.out.printf("안녕, 내 이름은 %s재서고, 나이는 %d야.", name, age);
		
	}

}
