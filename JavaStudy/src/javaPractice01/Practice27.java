package javaPractice01;

import java.util.Arrays;

public class Practice27 {
	
	public static void main(String[] args) {
		// 길이가 5인 배열 생성, 배열 길이 생략
		int[] a = new int[] {10, 20, 4, 25, 18};
		
		// 길이가 7인 배열 생성, new List[] 생략 가능
		int[] b = {1, 2, 3, 4, 5, 6, 7};
		
		// for문으로 배열 초기화
		int[] c = new int[10];
		for(int i = 0; i < c.length; i++) {
			c[i] = i;
		}
		
		// for문을 이용한 출력
		System.out.println(c.length);
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]);
		}
			
		// foreach문을 이용한 출력
		System.out.println();
		for(int d: c) {
			System.out.print(d);
			
		System.out.println();
		System.out.println(Arrays.toString(c));
		// Arrays.toString 매서드 사용.
		// 문자열 상태로 출력하며, 배열에 무엇이 있는지 모두 확인할 수 있는 가장 좋은 방법.
		}
		
	}
	

}
