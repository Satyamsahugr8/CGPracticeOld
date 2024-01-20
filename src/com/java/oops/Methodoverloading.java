package com.java.oops;

public class Methodoverloading {

	private int i;
	
	// constructor overloading
	public Methodoverloading() {
		
	}
	
	public Methodoverloading(int i) {
		this.i = i;
	}
	
	
	@Override
	public String toString() {
		return "Methodoverloading [i=" + i + "]";
	}

	public static void main(String[] args) {
		
//	Scanner s = new Scanner(System.in);
//	int i = s.nextInt();
//	int a = s.nextInt();
//	int b = s.nextInt();
		
		int i = 2, a = 4, b = 5 ;
	
	System.out.println(Methodoverloading.m1(i)); 			
	System.out.println(Methodoverloading.m1(a,b));
	
	Methodoverloading m = new Methodoverloading();
	Methodoverloading m1 = new Methodoverloading(i);
	System.out.println(m);
	System.out.println(m1);
	
	}
	
	
	static int m1(int a){
		return(a+a);
	}
	
	
	static int m1(int a,int b) {
		return(a+b);
	}

}
