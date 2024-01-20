package com.javaApril;

class MyThreadD extends Thread {

	@Override
	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println("Lazy Thread");
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
//				e.printStackTrace();
			System.out.println("I am interrupt inside catch");
		}

	}
}

public class ThreadSleepDemo {

	public static void main(String[] args) {

		MyThreadD t = new MyThreadD();
		t.start();
		t.interrupt();

		System.out.println("end of Main method");
	}

}
