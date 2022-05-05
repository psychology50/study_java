package study07;

class Account {
	int money = 0;
	// 입금, 출금
	public int showMoney() {
		return money;
		
	}
	public synchronized void setMoney() {
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
	Son(Account account) {
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
	Mom(Account account) {
		this.account = account;
	}
	
	public void run() {
		for(int i = 0; i<10; i++) {
			account.setMoney();
		}
	}
}


public class Practice045 {
	
	public static void main(String[] args) {
		Account account = new Account();
		Son son = new Son(account);
		Mom mom = new Mom(account);
		son.start();
		mom.start();
	}

}
