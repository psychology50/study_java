package ddazua;

import java.io.*;

/*
 [7] 객체 직렬화
 	 1. def
 	 	: 자바 시스텀 내부에서 사용하는 객체나 데이터들을 외부 시스템에서 사용 가능하도록 byte단위의 데이터로 변환시키고,
 	 	  변환된 데이터를 다시 객체로 변환하는 기술
 	 2. 객체 전송 단계
 	 	· 직렬화된 객체를 바이트 단위로 분해(marshalling)
 	 	· 직렬화되어 분해된 데이터를 순서에 따라 전송
 	 	· 전송받은 데이터를 복구(unmarshalling)
 	 3. 마샬링(Marshalling)
 	    : 데이터를 byte 단위의 데이터로 변환시키는 작업
 	    (1) 마샬링을 적용할 수 있는 데이터
 	    	· 기본 자료형 : boolean, char, byte, short, int, long, float, double, ...
 	    	· Serializable 인터페이스를 구현한 클래스로 만들어진 객체
 	    	  => class A implements Serializable { ... }
 	    	  	 A a = new A();
 	    	* 사용할 클래스 : ObjectOutputStream  (객체 출력 스트림)
 	 4. 직렬화
 	 	: Serializable 인터페이스는 메서드 없이 JVM에게 정보 전달 기능만 존재한다.
 	 5. 언마샬링(UnMarshalling)
 	 	· 객체 스트림을 통해 전달된 바이트 단위의 데이터를 원래의 객체로 복구하는 작업
 	 	· *주의할 점* 어떤 객체 형태로 복구할 지 형 변환을 정확하게 명시해주어야 한다.
 	 	* 사용할 클래스 : ObjectInputStream
 	 
 	    
 	 
  
  
 */

public class WhatIOPackage3 {
	public static void main(String[] args) {
		marshalling();
		unmarshalling();
	}
	
	public static void marshalling() {
		try {
			FileOutputStream fos = new FileOutputStream("user.ser");
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			ObjectOutputStream out = new ObjectOutputStream(bos);
			
			User u1 = new User("test1234", "1234", "홍길동");
			
			out.writeObject(u1); // u1 객체 전달
			out.close();		 // close를 안 해주면 아직 받아올 데이터가 있다고 생각해서 프로그램이 저장을 안 한다.
			System.out.println("직렬화 완료!");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void unmarshalling() {
		try {
			FileInputStream fis = new FileInputStream("user.ser");
			BufferedInputStream bis = new BufferedInputStream(fis);
			ObjectInputStream in = new ObjectInputStream(bis);
			
			User u2 = (User)in.readObject();	// 받아올 데이터를 명시적 형 변환을 통해 객체 타입 지정
			System.out.println(u2.toString());  // u2.toString => User [id=test, pw=1234, name=홍길동] 출력. '객체로 받아옴'
			System.out.println("객체복원 완료!");
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}

class User implements Serializable {
	private String id;
	private String pw;
	private String name;
	// 마우스 우클릭 -> Source -> Generate Constructor Using Field
	public User(String id, String pw, String name) {
//		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
	}
	// 마우스 우클릭 -> Source -> Generate toString()...
	@Override
	public String toString() {
		return "User [id=" + id + ", pw=" + pw + ", name=" + name + "]";
	}
	
	
}
