package study08;

import java.io.*;

public class Practice049 {
	
	public static void main(String[] args) throws IOException {
		// 파일 복사 프로그램
		
		// 파일 입출력에 관계된 입출력 스트림을 각각 생성
		FileInputStream fis = null;
		FileOutputStream fos = null;
		fis = new FileInputStream("C:\\Users\\qud12\\OneDrive\\바탕 화면\\재서\\코딩\\JAVA\\Test.txt"); // 읽어올 파일의 경로 지정
		fos = new FileOutputStream("result.txt"); // 저장할 파일명을 작성. 프로젝트 폴더에 생성된다.
		// C:\Users\qud12\eclipse-workspace\JavaStudy2 에 저장됨.
		
		// 각각 버퍼를 사용할 수 있도록 현재 입출력 스트림의 인자를 받아서 보조 스트림의 인스턴스를 생성
		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		int data;
		while((data = fis.read()) != -1) { // 입력 스트림에서 읽어온 값이 -1이면 더 이상 읽어올 값이 없음
			bos.write(data);
		}
		
		// 스트림도 외부와의 연결이기 때문에 반드시 close() 해야 함.
		// 연결한 반대 순서로 close()
		bos.close(); // 사용한 스트림은 닫아주기. 닫아주지 않으면 다른 사람이 사용하거나 할 때 다양한 문제가 생긴다.
		bis.close();
		
	}

}
