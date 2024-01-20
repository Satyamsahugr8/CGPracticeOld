package com.java.Basics;

class Num extends Exception {
	public Num(String msg) {
		super(msg);
	}
}

public class TestThrow {
	
	// defining a method
	public static void checkNum(int num) throws Num {
		if (num < 1) {
			throw new Num("\nNumber is negative, cannot calculate square");
		} else {
			System.out.println("Square of " + num + " is " + (num * num));
		}
	}

	// main method
	public static void main(String[] args) {
		try {
			TestThrow.checkNum(-3);
		} catch (Num e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Rest of the code..");
	}
}