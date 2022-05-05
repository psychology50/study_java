package study08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Practice052 {
	
	public static void main(String[] args) {
		// 파일 끝까지 읽기
		// read() 메서드로 파일을 읽는 경우 파일의 끝에 도달을 하면 -1을 반환
		
		try (FileInputStream fis = new FileInputStream("input.txt")) {
			int i;
			while((i = fis.read()) != -1) {
				System.out.print((char)i);
			}
			System.out.println(" end");
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
