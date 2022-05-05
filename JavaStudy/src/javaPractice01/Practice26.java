package javaPractice01;

public class Practice26 {
	
	public static void main(String[] args) {
		int[] student = new int[3]; //길이가 3인 배열 생성, int[] -> int 배열형을 의미함
		System.out.println("현재 자동으로 초기화된 값: " + student[0]);
		
		student[0] = 30; // 배열의 첫 번째 요소에 30을 저장
		student[1] = 20; // 배열의 두 번째 요소에 20을 저장
		student[2] = 10; // 배열의 세 번째 요소에 10을 저장
		
		System.out.println("현재 첫 번째 요소의 값: " + student[0]);
		
	}

}
