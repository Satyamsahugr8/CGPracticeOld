package com.javaApril;

class MyThread extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("MyThread Thread");
		}

	}
}

class MyThread2 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("MyThread-2 Thread");
		}
	}
}

public class MyThreadDemo {

	public static void main(String[] args) {

		MyThread t1 = new MyThread();
		
		MyThread2 r2 = new MyThread2();
		Thread t2 = new Thread(r2);

		t1.start();
		t2.start();
	}

}
