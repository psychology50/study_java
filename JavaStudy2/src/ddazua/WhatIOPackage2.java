package ddazua;

import java.io.*;

/*
  [5] 문자 기반 스트림
      1. def
         : 16bit의 문자나 문자열을 읽고 쓰는 스트림
      2. 활용 
      	 (1) 자바의 char형 변수는 2byte이므로 바이트 기반 스트림을 불편하다
      	     -> 문자 단위로 입출력을 다루는 문자 기반 스트림 제공
        	                     Reader(입력)					                       Writer(출력)
        	  int read()										    void write(int c)
        	  int read(char[] cbuf)								    void write(char[] cbuf)
        	  abstract int read(char[] cbuf, int off, int len)      abstract void write(char[] cbuf, int off, int len)
  																    void write(String str)
  																    void write(String str, int off, int len)
  		 (2) 대상에 따른 스트림 종류
  		 	        입력 스트림					출력 스트림			  		대상
  		 	        FileReader				 	FileWriter					파일
  		 	        PipedReader					PipedWriter					메모리
  		 	      CharArrayReader				CharArrayWriter			   프로세스
  		 	 => ex) 파일 입출력
  		 	 		FileReader fr = null;
  		 	 		fr = new FileReader("파일 경로");
  		 	 		
    [6] 문자 기반 보조 스트림
      1. def
         : 실제 문자 기반 스트림의 성능을 '향상'시키는 역할
      2. 활용
         (1) Java Package
        	    입력 보조스트림				   출력 보조스트림 				  	   사용
        	     FilterReader				     FilerWriter			 필터를 이용한 문자 입출력
        	    BufferedReader                  BufferedWriter	         버퍼를 이용한 문자 입출력
        	 ex) BufferInputStream 활용
        	 	 FileReader fr = null;
        		 fr = new FileReader("파일경로");
        		 BufferedReader br = new BufferedReader(fr);
  
 */

public class WhatIOPackage2 {
	public static void main(String[] args) throws IOException {
		// 파일 복사 프로그램
		FileReader fr = null;
		FileWriter fw = null;
		
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		fr = new FileReader("prac.txt");
		fw = new FileWriter("result_prac2.txt");
		br = new BufferedReader(fr);
		bw = new BufferedWriter(fw);
		
		String readLine;
		while((readLine = br.readLine()) != null) { // 바이트 기반 스트림은 더이상 읽어올 값이 없으면 -1을
			bw.write(readLine);						// 문자 기반 스트림은 'null'값을 출력한다.
		}
		br.close();
		bw.close();
		
		
	}

}
