package com.java.Basics;

import java.util.Iterator;

//Logical programs:

//1.addition of two numbers //
//2.factorial of number //
//3.fibonacci series //
//4.reverse string or number //
//5.swap two numbers without using third variable //
//6.palindrome number // 
//7.write a program to find out given number prime or not //
//8.Write a program to concatenate two strings and print the value of it.  //
//9.Write a program to get a number "n" from the user and print the even number from 0 to n number //
//10.logical operator example 

public class LogicalProgramming {
	
	int a;
	int b;

	// 2
	public static int factorial(int number) {
		if (number == 0) {
			return 1;
		} else
			return number * factorial(number - 1);
	}

	// 3
	public static void fabonacci(int number) {

		int a = 0;
		int b = 1;
		int c;

		// base condition
		if (number == 0) {

			System.out.println("series should have atleast 1 as series");

		} else if (number == 1) {

			System.out.print(a);
			System.out.println();

		} else if (number == 2) {

			System.out.print(a + " " + b);
			System.out.println();

		} else {

			System.out.print(a + " " + b);
			for (int i = 2; i < number; i++) {
				c = a + b;
				System.out.print(" " + c);
				a = b;
				b = c;
			}

		}
	}

	// 4
	public static void reverseString(String s) {
		String newString = "";
		char temp;
		for (int i = 0; i < s.length(); i++) {
			temp = s.charAt(i);
			newString = newString + temp; // adds each character in front of the existing string
		}
		System.out.println("Reversed word: " + newString);

	}

	// 6
	public static void PalindromeString(String s) {
		boolean ss = true;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(0) != s.charAt(s.length() - 1)) {
				ss = false;
			}
		}

		if (ss == true) {
			System.out.println("pallindrome");
		} else {
			System.out.println("No");
		}
	}

	// 4
	public static void reverseNumber(int a) {
		int b = a;
		int rev = 0;
		int remain;

		while (a != 0) {
			remain = a % 10;
			rev = rev * 10 + remain;
			a = a / 10;
		}

		System.out.println(rev);
	}

	// 7Prime
	public static void isPrime(int a) {

		int count = 0;
		for (int i = 2; i < a / 2; i++) {
			if (a % i == 0) {
				count++;
			}
		}

		if (count == 0) {
			System.out.println("prime");
		} else {
			System.out.println("Not Prime");
		}

	}

	// 8
	static boolean isArmstrong(int n) {
		
		int temp, digits = 0, last = 0, sum = 0;
		
		temp = n;

		// this is for total digits
		while (temp > 0) {
			temp = temp / 10;
			digits++;
		}
		
//		System.out.println("Total :"+digits);
		
		temp = n;
		
		// calculate sum == n
		while (temp > 0) {
			
			last = temp % 10;
			
			sum += (Math.pow(last, digits));

			temp = temp / 10;
		}
		
		if (n == sum)			
			return true;
		else
			return false;
	}

	public static void main(String[] args) throws CloneNotSupportedException {

//		System.out.println(factorial(0));
//		System.out.println(factorial(6));
//
//		fabonacci(0);
//		fabonacci(3);
//		fabonacci(10);

//		reverseString("Satyam");

//		String  s = "SASSAS";
//		PalindromeString(s);

//		reverseNumber(1991362);

//		isPrime(3);
		
		System.out.println(isArmstrong(153));
		
	}

}
