package study08;

import java.io.IOException;

public class Practice047 {
	
	public static void main(String[] args) {
		// 표준 입출력 : 화면에 출력하고 입력받는 표준 입출력 클래스
		
		// 문자 여러 개를 입력 받기
		System.out.println("알파벳 여러 개를 쓰고 [Enter]를 누르세요.");
		
		int i;
		try {
			while ((i = System.in.read()) != -1) { // System.in : 표준 입력 스트림. // 아스키 코드는 -1 단위가 나올 수가 없다. 즉, 이 코드는 더이상 읽을 게 없을 때 -1을 반환받아 멈춤
				System.out.print((char)i); // System.out : 표준 출력 스트림
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
