package com.java.nonAccessModifiers;

abstract class A {
	
	int a = 0;

	abstract void b();

	final void aa() {
		System.out.println("aa");
	}
}

//final class Final {
//}
//
//class Satya extends Final {
//}

class Demo extends A {

	static int a = 10;

	static int plus(int a, int b) {
		return a + b;
	}

	protected static void e() {
		System.out.println("e");
	}

	@Override
	void b() {
		// TODO Auto-generated method stub
	}
	
//	void aa( ) {
//		
//	}

}

public class NonAccessModifier {

	/*
	 * static abstract final synchronized strictfp transient volatile
	 */

	static int s = 10;

	static {
		System.out.println("static block");
	}

	{
		System.out.println();
	}

	static void run() {
		System.out.println("static method run");
	}

	public static void main(String[] args) {

		System.out.println(s);
		NonAccessModifier.run();
//		A a = new A();

	}

}
