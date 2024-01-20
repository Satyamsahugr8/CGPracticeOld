package com.javaApril;

class Parent {
	static void m1() {
		System.out.println("parent m1()");
	}
};


public class DataHiding extends Parent {
	static void m1() {
		System.out.println("child m1()");
	}

	public static void main(String[] args) {
		Parent p = new DataHiding();
		p.m1();// output : parent m1()
	}
}