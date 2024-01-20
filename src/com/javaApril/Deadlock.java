package com.javaApril;

class Aa {
	synchronized void d1(B b) {
		System.out.println("Inside A d1");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		b.last();

	}

	synchronized void last() {
		System.out.println("Inside A last");
	}
}

class B {
	synchronized void d2(Aa a) {
		System.out.println("Inside B d2");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		a.last();
	}

	synchronized void last() {
		System.out.println("Inside B last");
	}
}

public class Deadlock extends Thread {
	Aa a = new Aa();
	B b = new B();

	public void m() {
		this.start();
		a.d1(b); // main thread is calling d1
	}

	@Override
	public void run() {
		b.d2(a); // child thread is calling d2
	}

	public static void main(String[] args) {
		Deadlock d = new Deadlock();
		d.m();

		System.out.println("End of the program");

	}

}

// Conclusion : If we remove one single synchronized keyword from the above program then program will 
// be terminated nicely.