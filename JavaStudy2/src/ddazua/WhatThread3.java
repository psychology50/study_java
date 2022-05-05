package ddazua;

// 1. Thread의 우선순위
//    : 시분할 방식으로 CPU의 시간을 분배하여 실행하지만 사용자가 우선순위를 지정해 특정 thread에 더 많은 실행시간을 부여할 수 있다.

//     - 우선 순위 지정 메서드
//		 · void setPriority(int newPriority) : 우선 순위 지정
//		 · int getPriority() : 우선 순위 반환
//    	    * 우선 순위는 1~10까지 가능하고, 디폴트 값은 5.. 값이 클수록 우선순위가 높다.


public class WhatThread3 {
	public static void main(String[] args) {
		Runnable t = new MyThread3(); // UpCasting => 굳이 runnable로 할 필요가 없다. 왠지 이상하다 했다..
		Thread t1 = new Thread(t, "thread1"); // new Thread(Runnable target, String name) => 쓰레드의 이름을 지정하는 것.
		t1.setPriority(1);
		System.out.println("t1의 우선순위: " + t1.getPriority());
		
		Thread t2 = new Thread(t, "thread2");
		System.out.println("t2의 우선순위: " + t2.getPriority());
		
		Thread t3 = new Thread(t, "thread3");
		t3.setPriority(10);
		System.out.println("t3의 우선순위: " + t3.getPriority());
		
		t1.start();
		t2.start();
		t3.start();
	}

}

class MyThread3 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i<5; i++) {
			System.out.println("<" + Thread.currentThread().getName() + ">");
		}
		
		for(int i=0; i<1000; i++) { // 시간지연	
		}	
	}	
}
