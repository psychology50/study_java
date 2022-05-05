package study07;

// Process : 실행 중인 프로그램 자원(resources)과 쓰레드로 구성
// Thread : 프로세스 내에서 실제 작업을 수행	// 모든 Process는 최소한 하나 이상의 Thread를 가지고 있다.

// Single-Threaded Process : 자원 + 쓰레드
// Multi-Threaded Process : 자원 + 쓰레드 + 쓰레드 + ..... + 쓰레드

class MyThread extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("스레드 진행 중 " + i);
		}
	}
}

class MyThread2 implements Runnable {	// Runnable 인터페이스는 몸체가 없는 메소드인 run() 메소드 단 하나만을 가지는 간단한 인터페이스이다.
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println("러너블 진행 중 " + i);
		}
	}
}

public class Practice039 {	// cpu에 여유가 되는 순서대로 일을 처리하기 때문에 매번 다른 값이 출력된다.
	
	public static void main(String[] args) {
		
		MyThread th1 = new MyThread(); // Thread를 상속한 클래스
		
		Runnable th2 = new MyThread2(); // Runnable를 구현한 클래스
		Thread t = new Thread(th2);
		
		th1.start();
		t.start();
		
		for(int i = 0; i < 10; i++) {
			System.out.println("메인 함수 진행 중 " + i);
		}
		
	}

}

