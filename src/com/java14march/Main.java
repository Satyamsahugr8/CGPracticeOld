package com.java14march;

interface i1 {
	int a = 9;
	int func();
}

interface i2 {
	int a = 8;
	int func();
}

class Imp implements i1,i2 {

	@Override
	public int func() {
		int A = i1.a;
		int B = i2.a;
		return A+B;
	}
	
}

 class Parent {
	 int a = 9;
	 String name = "Satyam";
 }
 
 class Child extends Parent {
	 
	 void method() {
		 System.out.println(a);
	 }
	 
 }



public class Main {
	
	int searchLinear(int[] a, int value) {
		for(int i = 0; i < a.length; i++) {
			if(value == a[i]) {
				return i;
			}
		}
		return -1;
	}
	
	static Parent func(boolean b) {
		if( b == true ) {
			return new Child();
		}
		return new Parent();
	}
	
	public static void main(String[] args) {
		int p = 2;
		Parent p2 = func(false);
		p2.a = 100;
		System.out.println(p);
		System.out.println(p2.a);
		System.out.println(i);
	}
	
	static Integer i = new Integer(0);
	
}
