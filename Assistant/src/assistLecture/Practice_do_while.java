package assistLecture;

//5. do-while문
/*   · 구조식
	    do {
	    	<적어도 한 번은 작동하는 코드>;
	    } while(조건식);
			 
	 · 적어도 한 번은!!!! 작동하는 문장.
*/

public class Practice_do_while {
	public static void main(String[] args) {
		// [1] 기본 구조 (while과 do-while의 차이)
		
		int i = 100;
		do {
			System.out.println("적어도 한 번은 출력되는 문장 i편");
		} while(i<10);
		System.out.println("종료");
		
		
		int j = 100;
		while(j<10) {
			System.out.println("적어도 한 번은 출력되는 문장 j편");
		} 
		System.out.println("종료");
	}

}
