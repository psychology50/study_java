package ddazua;

// [스레드 제어]
/* 
   1. wait() : 스레드 대기
	  · void wait() : notify()가 호출될 때까지 대기
	  · void wait(long timeout) : timeout시간만큼 대기
   2. notify() : 스레드 깨우기
	  · notify()    : 대기 중인 한 스레드만 깨움
	  · notifyAll() : 대기 중인 모든 스레드를 깨움
*/

public class WhatThread7 {
	public static void main(String[] args) {
		Account account = new Account();
		Son son = new Son(account);
		Mom mom = new Mom(account);
		son.start();
		mom.start();
	}
}

class Account {
	int money = 0;
	// 입금, 출금
	public int showMoney() {
		return money;
		
	}
	public synchronized void setMoney() { // 임계영역
		try {
			Thread.sleep(1000);
		} catch(InterruptedException ie) {
			System.out.println(ie.toString());
		}
		this.money += 300000;
		
		System.out.println("월급이 입금되었습니다. 현재 잔액 " + this.showMoney());
		
		this.notify();
	}
	
	public synchronized void getMoney() {
		if (money <= 0) {
			try {
				System.out.println("ASAP~ 내 통장 잔고 반쪼가리~");
				this.wait( ); // 이 메서드를 호출한 놈이 잔다.
			} catch(InterruptedException e) {	
			}
		}
		this.money -= 300000;
		System.out.println("재서가 월급을 출금했습니다. 현재 잔액 " + this.showMoney());
	}
}

class Son extends Thread {
	private Account account;
	Son(Account account) {			// 같은 자원을 전달하기 위해 생성자에서 받아온다.
		this.account = account;
	}
	
	public void run() {
		for(int i = 0; i<10; i++) {
			account.getMoney();
		}
	}
}

class Mom extends Thread {
	private Account account;
	Mom(Account account) {			// 같은 자원을 전달하기 위해 생성자에서 받아온다.
		this.account = account;
	}
	
	public void run() {
		for(int i = 0; i<10; i++) {
			account.setMoney();
		}
	}
}