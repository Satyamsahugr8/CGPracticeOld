package com.java.Basics;

import java.util.Scanner;

public class A2_CheckEvenOrOdd {
	
	public static void main(String[] args) {
		
		// Take scanner for inputs
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number");
		int a = sc.nextInt();
		
		if(a%2 == 0) {
			System.out.println("This number is even number");
		} else
			System.out.println("This number is odd number");
		
		
		sc.close();
		
	}

}
