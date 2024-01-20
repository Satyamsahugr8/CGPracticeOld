package com.javaApril;

class StudentExample {

	public StudentExample() {
		super();
		System.out.println("Object created");
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Object Distroyed");
		super.finalize();
	}

}

public class FinalizePractice {

	public static void main(String[] args) {

		StudentExample s = new StudentExample();
		s = null;

		int a = 10, b;
		final int c = 9;

		try {
//			b = 10 / 0;

		} catch (Exception e) {
			System.out.println("Exception occured");
		} finally {
			System.out.println("finally block");
		}

//		c = 10;
		System.gc();
	}

}
