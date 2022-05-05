package javaPractice01;

public class Practice19 {
	
	public static void main(String[] args) {
		int i = 100;
		
		/*
		while(i < 10) {
			System.out.println("적어도 한 번은 출력되는 문장");
		}
		
		=> 모순되는 문장. 실행되지 않음
		*/
		
		do {
			System.out.println("적어도 한 번은 출력되는 문장");
		} while(i < 10);
		
		// 적어도 한 번은 실행 후, 조건이 맞으면 반복하는 코드
		
		/*
		 System.out.println("적어도 한 번은 출력되는 문장");
		 while(i < 10) {
			System.out.println("적어도 한 번은 출력되는 문장");
			
		=> 위와 같은 결과가 나오지만 수정이 힘들고 코딩이 길어지면 가독성이 떨어짐.
		 */
		
	}

}
