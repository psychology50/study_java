package ddazua;

/* 2. Thread's Life Cycle
  · 스레드 상태
	(1) new : 스레드가 new 연산자를 통해 인스턴스화된 상태. Runnable이 될 수 있는 상태지만 아직 대기열에 올라가지는 못함
	(2) Runnable : start() 메서드가 호출되면 Runnable 상태가 된다. 이 상태가 되면 실행할 수 있는 상태로 대기하게 되며 Scheduler에 의해 선택되면 run()을 수행한다.
	(3) Blocked : 실행 중인 스레드가 sleep(), join() 메서드를 호출하면 이 상태가 된다. 스케쥴러에 의해서 선택받을 수 없게된다.
	(4) Dead(= Terminated) : run() 메서드의 실행을 모두 완료하면 스레드는 Dead 상태가 되어 할당받은 메모리와 정보 모두 삭제된다.
*/

public class WhatThread4 {
	public static void main(String[] args) {
		// ===== [1] ===== //
		SleepThread t = new SleepThread();
		t.start();
		
		// ===== [2] ===== //
		MyThread6 s1 = new MyThread6();
		MyThread7 s2 = new MyThread7();
		
		Thread t1 = new Thread(s1);
		Thread t2 = new Thread(s2);
		
		t1.start();
		t2.start();
		
		// ===== [3] ===== //
		MyThread8 s3 = new MyThread8();
		MyThread9 s4 = new MyThread9();
		
		Thread t3 = new Thread(s3);
		Thread t4 = new Thread(s4);
		t3.start();
		
		try {
			t3.join(); // t1을 제외한 다른 스레드(Lock), t1이 완료될 때까지 대기
		} catch (InterruptedException e) {
			System.out.println(e.toString());
		}
		t4.start();
		try {
			t4.join(); // t4을 제외한 다른 스레드(Lock), t4가 완료될 때까지 대기
		} catch (InterruptedException e) {
			System.out.println(e.toString());
		}
		for(int i=0;i<10;i++) {
			System.out.println("main : " +i);
		}

	}
}

// [1] sleep
//     : Thread를 지정한 시간 동안 block 상태로 만든다. 1000분의 1초까지 지정 가능하며, 지정된 시간이 지나면 다시 runnable 상태로 돌아간다.
class SleepThread extends Thread {
	
	public void run() { // OverRiding
		System.out.println("카운트 다운 5초");
		for(int i=5; i>=0; i--) {
			System.out.println(i);
			if(i != 0) {
				try {
					Thread.sleep(1000); // 1초동안 스레드 block. (1000당 1초)
				} catch(InterruptedException e) {
					System.out.println(e.toString());
				}
			}
		}
		System.out.println("종료"); 
	}
}

// [2] yield
//	   : 자신의 시간을 양보하는 메서드. 스레드가 작업 수행과정에서 yield()를 만나면, 할당된 시간을 다음 차례 스레드에 양도한다.
class MyThread6 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<30;i++) {
			System.out.print("★");
			Thread.yield(); // 자신에게 주어진 시간 양보
		}
	}	
}
class MyThread7 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i<30; i++) {
			System.out.print("☆");
		}
	}
	
}

// [3] join
//	   : 특정한 스레드가 작업을 먼저 수행할 때 사용. 실행 순서를 지켜야 하는 스레드 제어
//       단 컴파일 순서대로 위쪽의 스레드가 우선 작동됨은 변함이 없다. join을 만나야지 그제서야 우선권을 얻는다.
class MyThread8 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i=0;i<10;i++) {
			System.out.println("t1 : " + i);
		}
		System.out.println("<<t1 완료>>");
	}
	
}
class MyThread9 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i=0;i<10;i++) {
			System.out.println("t2 : " + i);
		}
		System.out.println("<<t2 완료>>");
	}
	
}