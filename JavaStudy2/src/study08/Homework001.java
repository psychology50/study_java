package study08;

import java.io.FileOutputStream;
import java.io.IOException;

public class Homework001 {
	
	public static void main(String[] args) {
		// OutputStream : 바이트 단위로 쓰는 스트림 중 최상위 스트림. 자료 출력 대상에 따라 다른 스트림을 제공
		
		// FileOutputStream : 바이트 단위로 파일에 자료를 씀
		// ByteArrayOutputStream : Byte 배열에 바이트 단위로 자료를 씀
		// FilterOutputStream : 기반 스트림에서 자료를 쓸 때 추가 기능을 제공하는 보조 스트림의 상위 클래스
		
		// OutputStream에서 제공하는 메소드
		// void write(int b) : 한 바이트를 출력
		// void write(byte[] b) : b[] 배열에 있는 자료를 출력
		// void flush() : 출력을 위해 잠시 자료가 머무르는 출력 버퍼를 강제로 비워 자료를 출력
		// void close() : 출력 스크림과 연결된 대상 리소스를 닫음
		// 출력 버퍼가 비워짐 ( EX: FileOutputStream인 경우 파일 닫음
		
		// 파일에 한 바이트 씩 출력하기
		
		// fos = new FileOutputStream("output.txt", true) 기존 자료에 이어서 출력할 경우
		try(FileOutputStream fos = new FileOutputStream("output.txt", true)) {
			fos.write(65); // A
			fos.write(66); // B
			fos.write(67); // C
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("출력이 완료되었습니다.");
	}

}
