package study07;

// yield() 메서드를 활용하면 급하지 않은 작업의 시간을 양보하여 다른 작업부터 수행한다.
// 이 또한 절대적이지는 않지만 전반적으로 비슷한 결과가 출력되는 경향성을 보여준다. 

class MyThread6 implements Runnable {
	public void run() {
		for(int i = 0; i <30; i++) {
			System.out.print("+");
			Thread.yield();  // 자신에게 주어진 시간 양보
		}
	}
}

class MyThread7 implements Runnable {
	public void run() {
		for (int i = 0; i < 30; i++) {
			System.out.print("*");
		}
	}
}

public class Practice042 {
	
	public static void main(String[] args) {
		MyThread6 s1 = new MyThread6();
		MyThread7 s2 = new MyThread7();
		Thread t1 = new Thread(s1);
		Thread t2 = new Thread(s2);
		t2.start();
		t1.start();
	}

}
