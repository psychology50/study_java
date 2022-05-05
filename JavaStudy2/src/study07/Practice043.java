package study07;

// join 함수 없이도 구현할 수 있는 코드이기 때문에 코드 자체에 의미를 두지 말고, join의 작동원리에 중점을 두고 볼 것.

class MyThread8 implements Runnable {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("t1 : " + i);
		}
		System.out.println("<<< t1 완료 >>>");
	}
}

class MyThread9 implements Runnable {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("t2 : " + i);
		}
		System.out.println("<<< t2 완료 >>>");
	}
}

public class Practice043 {
	
	public static void main(String[] args) {
		MyThread8 s1 = new MyThread8();
		MyThread9 s2 = new MyThread9();
		Thread t1 = new Thread(s1);
		Thread t2 = new Thread(s2);
		
		t1.start();
		try {
			t1.join(); // t1을 제외한 다른 스레드 블록(block), t1이 완료될 때까지 기다린다.
		} catch (InterruptedException e) {
			System.out.println(e.toString());
		}
		
		t2.start();
		try{
			t2.join(); // t2를 제외한 다른 스레드 블록(block), t2가 완료될 때까지 기다린다.
		}catch (InterruptedException e) {
			System.out.println(e.toString());
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.println("메인스레드 : " + i);
		}
		
	}

}
