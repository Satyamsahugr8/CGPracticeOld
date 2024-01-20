package com.java.Basics;

import java.util.Scanner;

public class A8_PalIndrome {
	
	protected int b = 123;
	public int c = 134;
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number a");
		int a = sc.nextInt();
		
		int t = a ;
		
		int rev = 0 ;
		
		while(a!=0) {
			int reman = a % 10;
			rev= rev * 10 + reman;
			a = a/10;
		}
		
		System.out.println("Reverse Number:"+rev);
		 
		if(t == rev) {
			System.out.println("Yes palindrome");
		} else
			System.out.println("Not Palindrome");
		
	}

}
