package study08;

import java.io.FileInputStream;
import java.io.IOException;

public class Practice053 {

	public static void main(String[] args) {
		// byte 배열로 읽기
		// 자료를 read() 메소드로 한 바이트씩 읽는 것보다 배열을 사용해서 한꺼번에 많이 읽으면 처리 속도가 훨씬 빠르다.
		// read(byte[] b) 메서드는 선언한 바이트 배열의 크기만큼 한꺼번에 자료를 읽는다.
		// 그리고 읽어들인 자료의 수를 반환한다.
		
		try (FileInputStream fis = new FileInputStream("input.txt")) {
			byte[] bs = new byte[10];
			int i;
			while ((i = fis.read(bs)) != -1) {
				/* for(byte b : bs) {				// for-each 문을 쓰게 되면 배열을 출력할 때, 이전의 배열에 새로운 값을 덮어 씌우는 과정을 거치게 되는데
				 * 	 System.out.print((char)b);		// 마지막 6바이트 배열에서 Z까지 출력하고 남은 4칸의 배열은 따로 덮어씌워지거나 지워지지 않기 때문에 QRXT가 그대로 출력되는
				 * } 								// 오류가 발생하게 된다.
				 */
				for(int k = 0; k < i; k++) {
					System.out.print((char)bs[k]);
				}
				System.out.println(": " + i + "바이트 읽음");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("end");
	}

}
