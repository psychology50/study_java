package ddazua;

// main도 Thread다!!

public class WhatThread2 {
	public static void main(String[] args) {
		Thread3 t3 = new Thread3();
		t3.start();
		
		System.out.println("Thread Name: "+Thread.currentThread().getName());
		System.out.println("Thread State: "+Thread.currentThread().getState());
		System.out.println("Thread Priority: "+Thread.currentThread().getPriority());
		
		
	}

}

class Thread3 extends Thread {
	public void run() {
		this.setName("Thread3");
		System.out.println("Thread Name: "+Thread.currentThread().getName());
		System.out.println("Thread State: "+Thread.currentThread().getState());
		System.out.println("Thread Priority: "+Thread.currentThread().getPriority());
	}
}
