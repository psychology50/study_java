package assistLecture4;

public class Practice_ByteOperator {
	public static void main(String[] args) {
		
		// 비트 연산자는 말 그대로 값들을 비트 단위(2진수)로 계산하는 것.
		
		// 정확하게 하려면 32비트까지 쪼개서 0000 0000 0000 0000 0000 0000 0000 0000 으로 표현해야 하나..가독성을 위해 줄였습니다 ^^
		// 이유를 대략적으로 설명해드리자면 자바에서 비트연산을 위해 정수를 bit화 시키면 4byte(1byte = 8bits) -> 32bit의 공간이 할당됩니다.
		// 32비트의 공간이 있다는 것은 2^32개의 숫자를 표현할 수 있음을 의미하는데,
		// 제일 왼쪽의 31번째칸에 1이 들어가면 '음수'로 전환됩니다. (오른쪽부터 0번 인덱스)
		// 또 어이가 없는 게 31번째 칸에 1만 없으면 그럼 모두 양수냐? 아닙니다...31번째를 제외하고 모두 1로 채우면 정수값으로 -1이 됩니다. (음수는 -1이 가장 큰 수이므로)
		// 그래서 사실상 한 칸을 잃었기 때문에 양수일 때는 표현할 수 있는 수가 (2^31)-1개 입니다. 
		// 이걸 int 타입으로 바꾸면 범위가 (-2,147,483,648 ~ 2,147,483,647)이 되는 것입니다.
		
		// 10진수 ->   2진수
		//   0    -> 0000 0000
		//   1    -> 0000 0001
		//   2    -> 0000 0010
		//   3    -> 0000 0011
		//   4    -> 0000 0100
		//   5    -> 0000 0101
		//       ...
		//   15   -> 0000 1111
		//   16   -> 0001 0000 
		// => 2진수 간단 요약 (2칸 단위로 끊어서 00 01 10 11 로 계속 채우시면 됩니다.)
		
		// 즉, 0과 1로 표현 가능한 정수 타입 or 정수 타입으로 형변환 가능한 자료형만 연산 가능
		
		System.out.println("============= [1] 비트 이동 연산자 =============");
		/*    
		   [1] 비트 이동 연산자 (<< , >> , >>>)
			   (1) x << y : 정수 x의 비트를 y만큼 왼쪽으로 이동 (빈 자리는 0으로 채움)
			       2  ->      0000 0000 0000 0000 0000 0000 0000 0010
			       ↓
			     2 << 3
			       ↓
			       16 -> (000)0000 0000 0000 0000 0000 0000 0001 0___		
		*/
		System.out.print("2 << 3 = ");
		System.out.println(2<<3);
		
		
		/*
			   (2) x >> y : 정수 x의 비트를 y만큼 오른쪽으로 이동 (빈자리는 정수 a의 최상위 부호비트와 같은 값으로 채움) 
			      -16 -> 1111 1111 1111 1111 1111 1111 1111 0000
			       ↓
			   -16 >> 3
			       ↓
			       -2 -> ___1 1111 1111 1111 1111 1111 1111 1110(000) 
			              ↘ 빈 자리에 최상위에 있는 값을 채움. 즉 양수면 0, 음수면 1을 채움	
		*/
		System.out.print("-16 >> 3 = ");
		System.out.println(-16>>3);
		
		
		/*
			   (3) x >>> y : 정수 x의 각 비트를 y만큼 오른쪽으로 이동 (빈자리는 0으로 채움)	  		  
			      -16 -> 1111 1111 1111 1111 1111 1111 1111 0000
			       ↓
			   -16 >>> 3
			       ↓
			536870910 -> ___1 1111 1111 1111 1111 1111 1111 1110(000)	
			       		  ↘ 자바에만 있는 연산자. 빈자리에 '무조건' 0을 채움
		*/
		System.out.print("-16 >>> 3 = ");
		System.out.println(-16>>>3);
		
		
		System.out.println("\n============= [2] 비트 논리 연산자 =============\n");
		
		/*
		[2] 비트 논리 연산자 (&, |, ^, ~)
			(1) & (AND) : 둘 다 1이면 1, 그 외엔 모두 0			
			       15 -> 0000 1111
			       25 -> 0001 1001 
			       ↓
			    15 & 25
			       ↓
			       9  -> 0000 1001			
		*/
		System.out.println("15 & 25 = " + (15&25));
		
		/*
		    (2) | (OR) : 둘 중 하나'가' 1일 경우에는 1
			       15 -> 0000 1111
			       25 -> 0001 1001 
			       ↓
			    15 | 25
			       ↓
			       31 -> 0001 1111			    
		*/
		System.out.println("15 | 25 = " + (15|25));
		
		/*
	    	(3) ^ (XOR) : 둘중 하나'만' 1이여야 1
			       15 -> 0000 1111
			       25 -> 0001 1001 
			       ↓
			    15 ^ 25
			       ↓
			       22 -> 0001 0110		    
		*/
		System.out.println("15 ^ 25 = " + (15^25));
		
		/*
	    	(4) ~ (보수) : 값을 반전
			       25 -> 0001 1001 
			       ↓
			      ~25
			       ↓
			      -26 -> 1110 0110		    
		*/
		System.out.println("   ~ 25 = " + (~25));
	}
}
