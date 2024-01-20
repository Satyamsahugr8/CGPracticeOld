package com.java.Basics;

import java.util.Scanner;

public class A1_StringAddition {

	public static void main(String[] args) {

		// Take scanner for inputs
		Scanner sc = new Scanner(System.in);

//		System.out.println("Enter two Number");
//		int a = sc.nextInt();
//		int b = sc.nextInt();
		
		System.out.println("Enter two String");
		String aa = sc.next();
		String bb = sc.next();
		
		String cc = aa + bb ;
		
		System.out.println("cc = " + cc);
		
//		AbstractCollection;
		
		sc.close();
	}
}
