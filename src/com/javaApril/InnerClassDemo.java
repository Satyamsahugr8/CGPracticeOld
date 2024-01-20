package com.javaApril;

class A {
	
	int i = 10;

	void m3() {
		System.out.println("m3-A");
		//System.out.println(j);---->error
	}

	class B {
		int j = 20;
		//static int k=30;--->error
		static final int k = 30;

		void m1() {
			System.out.println("m1-B");
			System.out.println(i);
			m3();
		}

		void m2() {
			System.out.println("m2-B");
		}
	}
}

public class InnerClassDemo {
	
	public static void main(String args[]) {
		
		// Inner class
		A.B ab = new A().new B();
		ab.m1();
		ab.m2();
//		ab.i;
//		ab.m3(); //--->error
		
		// Outer Class
		A a = new A();
		a.m3();
//		a.m1();  //--->error
//		a.m2();  //--->error

	}
}
