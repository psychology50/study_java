package ddazua;

// 2. 스레드 동기화 방법
//    (1) 동시에 작업하는 메서드에 synchronized 키워드 걸기 : 이 메서드가 자원을 사용하는 동안은 다른 스레드에서 사용할 수 없게 한다.
//		  · public synchronized void 메서드명() { }
//	  (2) synchronized 영역 지정하기
//		  · void 메서드명() { synchronized(스레드 객체){} }

public class WhatThread6 {
	public static void main(String[] args) {
		ATM2 atm = new ATM2();
		Thread mom = new Thread(atm, "엄마");
		Thread son = new Thread(atm, "아들");
		
		mom.start();
		son.start();
	}

}

class ATM2 implements Runnable {
	int money = 100000;
	public void run() {
		for(int i=0;i<50;i++) {
			withdraw(1000);
			printInfo();
			try {
				Thread.sleep(1000); // 다른 스레드에게 작업 양도
			} catch(InterruptedException e) {
				
			}
		}
	}
//	synchronized void withdraw (int money) {  // 방법 1
	void withdraw (int money) {
		synchronized(this) { 	// (this) 이 객체들을 동기화 시키겠다는 영역의 선언
		Thread.yield();
		this.money -= money;
		System.out.println(Thread.currentThread().getName() + "이(가)" + money + "원 출금");
		}
	}
	void printInfo() {
		System.out.println("현재 잔액" + money + "원");
	}
}
