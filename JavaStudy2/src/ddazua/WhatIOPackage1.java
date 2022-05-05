package ddazua;

import java.io.*;

/*
  [1] IO와 Stream
  	  1. IO
  	     : Input(입력), Output(출력)
  	  2. Stream
  	     : 일련의 데이터 흐름 (입력스트립, 출력스트림) 
  	  	 · 단방향이다.
  	 	 · FIFO(선입선출) 구조를 가지고 있다.
  	 	 · 출력 단위에 따라 바이트 기반과 문자 단위로 나뉜다.    |	   ↗ Byte 기반 - InputStream, OutputStream
  	 	   >> 출력단위 : 1byte -> 바이트 기반 스트림			 |  IO
  	 	  				  문자 -> 문자 기반 스트림		         |	   ↘ Char 기반 - Reader, Writer
  	 	  				 
  [2] 바이트 기반 스트림
      1. def
         : 바이트 단위로 데이터를 입출력하는 스트림
      2. 활용 
         (1) InputStream
             · abstract int read()
             · int read(byte[] b)
             · int read(byte []b, int off, int len)
         (2) OutputStream
             · abstract void write(int b)
             · void write(byte []b)
             · void write(byte []b, int off, int len)
        	 >>>> 입력과 출력에 따라, read()와 write()를 구현하여 사용한다.
         (3) Java Package -> 데이터를 읽거나 쓰는 대상에 따라 적절한 스트림을 사용한다.
        	      입력 스트림					출력 스트림						대상
        	    FileInputStream				  FileOutputStream				 	파일
        	    PipedInputStream	          PipedOutputStream					메모리
        	    AudioInputStream			  AudioOutputStream					오디오
        	  ByteArrayInputStream          ByteArrayOutputStream				프로세스
         (4) 스트림 사용할 때는 인스턴스 생성 시, 적절한 값을 전달한다.
        	 ex) 파일 입출력
        		 FileInputeStream fis = null; 			 // 생성자에 null값을 넣어준 상태
        		 fis = new FileInputStream("파일위치");   // 프로그램과 파일 사이에 스트림(fis)을 연결해준다.
        		 fis.read();
          		
  [3] 바이트 기반 보조 스트림
      1. def
         : 실제 바이트 기반 스트림의 성능을 '향상'시키는 역할
      2. 활용
         (1) Java Package
        	    입력 보조스트림				   출력 보조스트림					사용
        	    FileInputStream				  FileOutputStream			 필터를 이용한 입출력
        	  BufferedInputStream           BufferedOutputStream	      버퍼를 통한 입출력
        	    DataInputStream				  DataOutputStream			기본 단위로 데이터 처리
        	           x					    PrintStream			   print, printf, println 사용
        	 ex) BufferInputStream 활용
        	 	 FileInputStream fis = null;
        		 fis = new FileInputStream("파일위치");
        		 BufferedInputStream bis = new BufferedInputStream(fis);  // 보조 스트림 bis 생성. buffered 경우 데이터를 낱개가 아닌 묶음으로 보내는 처리방식

  [4] 경로
      1. 절대경로
     	 · 웹페이지 혹은 파일이 가지고 있는 고유한 경로
     	 · 보통 주소창을 복사하면 절대경로값을 건네받는다.
      2. 상대경로
      	 · '현재 위치한 곳' or '특정 위치'를 기준으로 원하는 파일의 경로
      	 · index라는 폴더 안에 A, B라는 폴더가 있다고 가정했을 때, B라는 폴더에서 A폴더 안의 test.txt 파일을 가져오기 위해 '../A/test.txt'로 접근한다.
      3. 기호
      	 - '/'	: 가장 최상의 디렉토리로 이동한다. (Web root)
      	 - './' : 파일이 현재 디렉토리를 의미한다.
      	 - '../ : 한 단계 상위 디렉토리로 이동한다.
        	    

 */

public class WhatIOPackage1 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		fis = new FileInputStream("prac.txt");    // 독립적으로 사용하지 못한다. 무조건 예외처리를 해야함. // 존재하는 파일과 연결해야 함
		fos = new FileOutputStream("result_prac.txt"); // 존재하지 않으면 파일 생성. 존재하면 파일 덮어쓴다.
		
		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		int data;
		while((data = bis.read()) != -1) {  // 'fis.read() != -1'이라고 코딩을 하면, 데이터 누실이 발생할 수 있다.
			bos.write(data);				// 데이터를 읽고 다음 바이트 값을 불러오다가, 기존 데이터가 흘러가버릴 때 붙잡지 못할 수 있기 때문.
		}									// read() 메서드는 더이상 읽어올 값이 없을 때 -1: EOF(End Of File)을 반환한다.
		
		bos.close(); // file과 program 사이의 연결을 닫아주는 작업.
		bis.close();
		
	}	// 구조 :  'pract.txt' 읽기!  ------[Buffer(bis)]------> Program ------[Buffer(bos)]------> 'result_prac.txt' 생성!

}
