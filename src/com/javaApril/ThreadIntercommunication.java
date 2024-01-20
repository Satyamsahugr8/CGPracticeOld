package com.javaApril;

class Thread2 extends Thread {

	int total = 0;

	@Override
	public void run() {

		synchronized (this) {
			for (int i = 1; i <= 100; i++) {
				total = total + i;
				this.notify();
			}
		}

	}
}

public class ThreadIntercommunication {

	public static void main(String[] args) throws InterruptedException {

		Thread2 t = new Thread2();
		t.start();
		synchronized (t) {
			t.wait();
		}
		System.out.println(t.total);

	}

}
