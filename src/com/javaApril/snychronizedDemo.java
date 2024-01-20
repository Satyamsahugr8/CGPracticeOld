package com.javaApril;

class Display {

	public static synchronized void wish(String s) throws InterruptedException {

		System.out.println("Your Name : " + s);
		Thread.sleep(2000);
	}
}

class MyThread1 implements Runnable {

	Display d;
	String s;

	public MyThread1(Display d, String s) {
		super();
		this.d = d;
		this.s = s;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				d.wish(s);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}

}

public class snychronizedDemo {

	public static void main(String[] args) {

		Display d = new Display();
		Display d2 = new Display();

		MyThread1 r = new MyThread1(d, "Dhoni");
		Thread t = new Thread(r);

		MyThread1 r2 = new MyThread1(d2, "Yuvraj");
		Thread t2 = new Thread(r2);

		t.start();
		t2.start();

	}

}
