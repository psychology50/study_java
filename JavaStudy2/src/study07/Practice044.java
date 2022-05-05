package study07;

class MyThread10 implements Runnable {
	Ticketing ticket = new Ticketing();
	public void run() {
		ticket.ticketing();
	}
}

class Ticketing {
	int ticketNumber = 1;
	public synchronized void ticketing() { // synchronized : 동기화
	//public void ticketing() {
		if(ticketNumber>0) {
			System.out.println(Thread.currentThread().getName()+"가 티켓팅 성공");
			ticketNumber = ticketNumber - 1;
		}
		else {
			System.out.println(Thread.currentThread().getName()+"가 티켓팅 실패");
		}
		System.out.println(Thread.currentThread().getName()+"가 티켓팅 시도 후 티켓수 : "+ticketNumber);
	}
	
}

public class Practice044 {
	
	public static void main(String[] args) {
		MyThread10 s1 = new MyThread10();
		Thread t1 = new Thread(s1, "A");
		Thread t2 = new Thread(s1, "B");
		Thread t3 = new Thread(s1, "C");
		t1.start();
		t2.start();
		t3.start();
	}

}

/*
 <<< public void ticketing() 을 썼을 때 문제점. >>>
	A, B, C 쓰레드 3개가 동시에 진행되다 보니 if문에 갈 때 까지만 해도 셋 다 티켓이 1장씩 있다고 판단되어 모두 성공이 되었다고 출력된다.
	하지만 실제로 티켓수는 -2가 되는 오류가 발생한다.
 */
