package com.java.Basics;

import java.util.Scanner;

public class A7_ReverseNumber {

	static void reverseNumber(int a) {
		// a = 123
		int rev = 0;
		
		while (a != 0) {

			int reman = a % 10;
			
			System.out.println("reman: "+reman);
			
			rev = rev * 10 + reman;
			
			System.out.println("rev: "+rev);
	
			a = a / 10;
			
			System.out.println(a);

		}

		System.out.println("Reverse Number: " + rev);

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number a :");

		int a = sc.nextInt();

		reverseNumber(a);

	}

}
