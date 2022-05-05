package study08;

import java.io.*;

public class Practice050 {
	
	public static void main(String[] args) {
		// 파일 복사 프로그램 (스트림의 예외 처리)
		
		// 파일 입출력에 관계된 입출력 스트림을 각각 생성
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		// 각각 버퍼를 사용할 수 있도록 보조 스트림의 인스턴스를 생성
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		try {
			fis = new FileInputStream("C:\\Users\\qud12\\OneDrive\\바탕 화면\\재서\\코딩\\JAVA\\Test.txt"); // 읽어올 파일의 경로 지정
			fos = new FileOutputStream("result2.txt"); // 저장할 파일명을 작성. 프로젝트 폴더에 생성된다.
			
			bis = new BufferedInputStream(fis);
			bos = new BufferedOutputStream(fos);
				
			int data;
			while((data = fis.read()) != -1) { // 입력 스트림에서 읽어온 값이 -1이면 더 이상 읽어올 값이 없음
				bos.write(data);
			}
		} 
		catch (Exception e) { // 예외가 발생할 경우 예외 처리
			e.printStackTrace();
		} 
		finally {
			// 예외 발생 여부와 상관없이 사용한 스트림을 닫아줌
			// close()도 예외가 발생할 수 있어서 try-catch문 사용
			try {
				// 연결한 반대 순서로 close();
				bos.close(); 
				bis.close();
			}
			catch (IOException e) {
				e.printStackTrace();
			}
		}		
				
	}

}
