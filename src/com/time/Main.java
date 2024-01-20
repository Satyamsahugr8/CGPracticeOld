package com.time;

class A {
	
	A(){
		System.out.println("A o-argument constructor");
	}
 }
class B extends A {
	static int a = 19;
	int b = 18;
	
	B() {
		System.out.println("o-argument constructor");
	}
	
	B(int a) {
		this();
		System.out.println("1-argument constructor, where a = "+a );
	}
}

public class Main {
	static int a = 19;
	static void getData() {
		System.out.println("getData");                                                                                                                                                                                                                                        
	}
	
	int b = 18;
	
	
	public static void main(String[] args) {

		System.out.println(a);
//		getData();
		Main m = new Main();
		System.out.println(m.b);
		
		B b = new B(2);	
		
		}
}
