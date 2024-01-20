package com.java.oops;

class A {

	{
		System.out.println("Instance block A");
	}

	static {
		System.out.println("Static block A");
	}

	public A() {
		System.out.println("Constructor A");
	}
}

class B extends A {

	{
		System.out.println("Instance block B");
	}

	static {
		System.out.println("Static block B");
	}

	public B() {
		System.out.println("Constructor B");
	}
}

public class InstanceBlock {

	static {
		System.out.println("1 static");
	}

	{
		System.out.println("1 Inst");
	}

	public InstanceBlock() {
		System.out.println("1 c");
	}

	public static void main(String[] args) {
		InstanceBlock i = new InstanceBlock();
		System.out.println(";;;;;;;;;;;;;;;;;;;;;;;;;");
		A a = new A();
		System.out.println(";;;;;;;;;;;;;;;;;;;;;;;;;");
		B b = new B();
		System.out.println(";;;;;;;;;;;;;;;;;;;;;;;;;");
		A aa = new B();
	}
}
