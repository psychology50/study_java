package ddazua;

// 스레드(Thread)
// def. 하나의 프로세스 안에서 두 가지 이상의 일을 하도록 하는 것

// Process : 실행중인 프로그램
// Thread  : 프로세스에서 작업을 수행하는 것
// Multi-Thread Process : 두 가지 이상의 작업을 하는 프로세스

/*
  [프로세스가 실행되는 방식] 
   1. 시간 분할 방식 : 모든 프로세스에 동일한 시간을 할당하고 골고루 실행되는 방식
   2. 선점형 방식 : 각각의 프로세스에게 우선 순위를 부여하고 우선 순위가 높은 순으로 실행되는 방식
   
  [스레드의 생성]
   1. JVM이 스레드 처리 시 하는 일 => Thread Scheduling   * JVM(Java Virtual Machine)
      - 스레드가 몇 개 존재하는가
      - 스레드가 실행되는 프로그램 코드의 메모리 위치는 어디인가
      - 현재 스레드의 상태는 무엇인가
      - 스레드의 우선 순위는 몇인가
      ★ 자바의 목적은 사용자가 메모리를 신경쓰지 않게끔 하는 것
      
   2. 개발자가 스레드 처리 시 하는 일
      - 자바 스레드로 작동할 작업이 무엇인지 코드로 작성
      - 스레드 코드가 실행할 수 있도록 JVM한테 요청      
 */

/*
   1. 스레드 작업 코드 작성 방법
      (1) Thread Class Inherit
      		
          class T1 extends Thread {
           		public void run() { // run() Method OverLiding
  				}
  		  }
  		  
  		  <구현부> - main
  		  
  		  T1 t1 = new T1(); // 인스턴스 생성
  		  t1.start();
  		  
  	  (2) Runnable Interface
  	  
  	  	  class T2 implements Runnable {
  	  	  		public void run() { // 인터페이스이므로 오버라이딩이 (1)번과 달리 필수가 된다.
  	  	  		}
  	  	  }
  	  	  
  	  	  <구현부> - main
  	  	  
  	  	  T2 t2 = new T2(); // 인스턴스 생성
  	  	  Thread t = new Thread(t2); // Thread 클래스 매개변수 생성자에 인자값으로 전달
  	  	  
  	  	  t.start();
  
 */

/* Thread vs Runnable
	
	Thread 클래스를 상속받는 것이 실행할 때 덜 번거로운 것은 사실이지만,
	Java의 다중 상속을 허용하지 않는 특성 때문에, Thread 클래스를 확장하는 클래스는 다른 클래스를 상속받을 수 없다.
	따라서 해당 클래스의 확장성이 중요한 상황이라면 Runnable 인터페이스를 구현하는 것이 많다.
	실제로 많은 개발자들이 Runnable을 상속받은 클래스를 구현하는 것을 선호한다.

 */


public class WhatThread1 {
	public static void main(String[] args) { // main도 하나의 Thread이다..!! 난 왜 이제 알았지?
		MyThread t1 = new MyThread();
		MyThread2 t2 = new MyThread2();
		
		t1.start();
//		t2.start(); -> 에러발생! .start() 메서드는 Thread 클래스의 것이기 때문
		
		Thread t = new Thread(t2); // Thread(Runnable target) : 매개변수 생성자 호출
		t.start();
		
		for(int i=0; i<10; i++) {
			System.out.println("main 진행 중 " + i);
		}
		
	}

}


class MyThread extends Thread {
	public void run() {
		for(int i=0 ; i<10 ; i++) {
			System.out.println("Thread 진행 중 " + i);
		}
	}
}
class MyThread2 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i<10; i++) {
			System.out.println("Runnable 진행 중 " +i);
		}
	}
	
}