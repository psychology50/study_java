package assistLecture4;

/*
   [1] 입력문
   	   1. def. 사용자로부터 값을 입력받기 위한 코드
   	   2. Scanner
   	   	  (1) Scanner Class란?
   	   	  	  C언어는 scanf_s(), 파이썬은 input(), C++은 cin 과 같은 함수가 존재하는데
   	   	  	  Java는 특이하게 단순히 함수가 아니라 Scanner라는 클래스를 사용한다. (C#도 마찬가지, 아마 객체 지향 언어 성격을 극대화하려는 의도가 아닐까 싶습니다.)
   	   	  	  => 이런 이유로 Scanner 클래스가 정의되어 있는 java.util package를 import 시켜주어야 한다.
   		  (2) 사용방법
   		  	  · 선언
   		  	  	Scanner 객체명 = new Scanner(System.in)	  	  	 
   		  	  	 <전혀 몰라도 되는 부분~~~~~~~>
	  			   Scanner sc = new Scanner(System.in); 를 하나하나 뜯어보자   # 그러려니 하고 넘기시면 됩니다. 몰라도 사용하는 데 전혀 지장 없습니다.
	   	 			ⓐ Scanner : Scanner 클래스 호출
	   	 			ⓑ sc	   : Scanner 클래스의 객체명을 'sc'라고 정함
	     			ⓒ new	   : heap 영역에 공간을 할당시킴
	     			ⓓ Scanner(System.in) : System.in(IOPackage)으로 바이트 단위로 입력받은 것을 Scanner에게 던져줌.
	   
	     			요약하자면, 'System.in'이 사용자에게 입력을 요구해서 값을 받아 바이트를 읽고
	   	     			        'Scanner Class'에서 타입에 맞게 형변환시켜 저장받는 겁니다. 
	   	   
	     			이보다 깊이 들어가면 너무 어려워지니까 지금은 이 정도만 알아두셔도 엄청 많이 배우신 겁니다.
	     			왜냐하면 System.in을 설명하려면 IOStream이란 개념이 기반에 깔려 있어야 하는데 이거 정규 수업 커리큘럼 제일 끝에서 배웁니다.
   		  	  · Method
   		  	      <숫자, boolean 자료형>
   		  	    - nextByte()  :	byte 자료형   		
   		  	    - nextShort() :	short 자료형    		
   		  	    - nextInt()	  : int 자료형		
   		  	    - nextLong()  :	long 자료형    		
   		  	    - nextFloat() :	float 자료형    		
   		  	    - nextDouble()  : double 자료형	    		
   		  	    - nextBoolean()	: boolean 자료형
  				  <문자열 자료형>
   		  	    - next() 	 : String 자료형 (공백을 기준으로 한 단어 read)  		
   		  	    - nextLine() : String 자료형 (개행을 기준으로 한 줄을 read) 	  
	    		
*/



import java.util.Scanner; // ctrl을 누른채로 Scanner을 클릭해보면 실제로 Scanner 클래스라는 파일이 존재함을 확인할 수 있다.

public class Practice_Scanner {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // Scanner 클래스의 객체 sc 생성
		
		// ========= 1. Scanner 클래스 ========= //
				
		byte bt;
		System.out.println("byte형 입력");
		bt = sc.nextByte(); // byte bt = sc.nextByte();
		System.out.println(bt);				
		
		short st;
		System.out.println("short형 입력");
		st = sc.nextShort();
		System.out.println(st);
		
		int it;
		System.out.println("int형 입력");
		it = sc.nextInt();
		System.out.println(it);
		
		long lg;
		System.out.println("long형 입력");
		lg = sc.nextByte();
		System.out.println(lg);
		
		float ft;
		System.out.println("float형 입력");
		ft = sc.nextFloat();
		System.out.println(ft);
		
		double db;
		System.out.println("double형 입력");
		db = sc.nextDouble();
		System.out.println(db);
		
		boolean bl;
		System.out.println("boolean형 입력");
		bl = sc.nextBoolean();
		System.out.println(bl);
		
		/*
		 int a = sc.nextInt(); 라고 써도 된다.
		 
		 어찌됐건 이렇게 입력을 받으면 바로 a에 값이 들어가는 것이 아니라 '버퍼'라는 영역에 머무르다가 주인(변수)에게 간택당할 때까지 기다린다.
		 언제까지? 바로 내가 '엔터'를 입력하는 순간까지!
		 변수로 받아주지 않으면 입력받은 데이터는 버퍼를 타고 그냥 빠져나가버린다.
		 
		 ※ 이 개념을 잘 알고 있어야 한다. 문자열을 받을 때 이거 때문에 다소 골치 아파지는 경우가 있다.
		 
		 */
		
		
	}
	
}
