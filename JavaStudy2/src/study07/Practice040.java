package study07;

// void setPriority(int newPriority);	우선 순위를 설정합니다.
//	int getPriority();					우선 순위를 반환합니다.

// Thread 우선 순위							// 가중치를 부여할 뿐, 실제로 먼저 작동할지에 대한 부분은 운영체제에 달려있다. 즉, 우선 순위가 절대적이지는 않다.
// setPriority(), getPriority()
// 기본이 5, 숫자가 높을 수록 우선 순위

class MyThread3 implements Runnable {
	public void run() {
		for(int i = 0; i < 5; i++) {
			System.out.println("<" + Thread.currentThread().getName() + ">");
		}
		for(int i = 0; i < 1000; i++) { } // 시간지연
		
		System.out.println("-------------------------");
	}
}

public class Practice040 {
	
	public static void main(String[] args) {
		Runnable t = new MyThread3();
		Thread t1 = new Thread(t, "thread1"); // 쓰레드의 이름 지정
		t1.setPriority(1); // 우선 순위 1로 지정
		System.out.println("t1의 우선순위는 : " + t1.getPriority());
		
		Thread t2 = new Thread(t, "thread2");
		// 아무 우선 순위도 지정하지 않을 경우 우선순위 5
		System.out.println("t2의 우선순위는 : " + t2.getPriority());
		
		Thread t3 = new Thread(t, "thread3");
		t3.setPriority(10);
		System.out.println("t3의 우선순위는 : " + t3.getPriority());
		
		t1.start();
		t2.start();
		t3.start();
	}

}
