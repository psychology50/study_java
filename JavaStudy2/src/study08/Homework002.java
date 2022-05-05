package study08;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Homework002 {
	
	public static void main(String[] args) throws FileNotFoundException {
		// 파일에 바이트 배열로 출력하기
		// write(byte[] b) 메소드는 바이트 배열에 있는 자료를 한꺼번에 출력
		
		FileOutputStream fos = new FileOutputStream("output2.txt", true);
		try(fos) { // java9부터 제공되는 기능
			//try(FileOutputStream fos = new FileOutputStream("output2.txt", true) java8까지
			
			byte[] bs = new byte[26];
			byte data = 65;		// 'A'의 아스키 값
			for (int i = 0; i < bs.length; i++) {  // A-Z까지 배열에 넣기
				bs[i] = data;
				data++;
			}
			
			fos.write(bs); // 배열 한꺼번에 출력하기
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("출력이 완료되었습니다.");
	}

}
