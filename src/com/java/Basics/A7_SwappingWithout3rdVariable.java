package com.java.Basics;

import java.util.Scanner;

public class A7_SwappingWithout3rdVariable {

	public static void main(String[] args) {

		// a = 4 , b = 3
		// a = 3 , b = 4

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number a");
		int a = sc.nextInt();
		System.out.println("Enter Number b");
		int b = sc.nextInt();
		
//		// with using 3rd variable
//		int t = a ;
//		a = b ;
//		b = t ;
		
		
		// without using 3rd variable
		a = a+b;
		b = a-b; // (a+b)-b = a
		a = a-b; // (a+b)-a = b
		
		System.out.println("a = "+a+", b = "+b);
		
	}

}
