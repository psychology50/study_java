package ddazua;

// 1. Thread의 Synchronized(동기화)
//    (1) def. 멀티 스레드 작업 시, 스레드 간 작업이 서로 간섭이 되지 않도록 하는 것.
//	  (2) multi thread의 문제점
//		  : 멀티 스레드 기법은 자원을 공유하는데, 이 때 동시에 같은 자원을 처리하면 자원 값이 실제 처리해야 하는 작업보다 더 많은 작업이 발생할 수 있다.
//          ex) 하나의 통장에서 두 명이 동시에 인출을 할 때 발생하는 잔액 출력 오류. 출금이 중복처리 되서 하나의 계산을 프로그램이 놓치게 된다.
//			ex) 티케팅 예제도 있다.

public class WhatThread5 {
	public static void main(String[] args) {
		ATM atm = new ATM();
		Thread mom = new Thread(atm, "엄마");
		Thread son = new Thread(atm, "아들");
		
		mom.start();
		son.start();
	}

}

class ATM implements Runnable {
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
	void withdraw (int money) {
		Thread.yield();
		this.money -= money;
		System.out.println(Thread.currentThread().getName() + "이(가)" + money + "원 출금");
	}
	void printInfo() {
		System.out.println("현재 잔액" + money + "원");
	}
}