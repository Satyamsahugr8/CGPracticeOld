package com.java.Basics;

import java.util.Scanner;

public class A7_ReverseNumber {

	static int reverseNumber(int x) {
		// a = 123
		int rev = 0;
		while (x != 0) {
			int remainder = x % 10;
			rev = rev * 10 + remainder;
			if (Integer.MAX_VALUE/10>rev || Integer.MIN_VALUE/10<rev) {
				return 0;
			}
			x = x / 10;
		}
        return rev;

	}

	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter Number a :");
//		int a = sc.nextInt();
		int a = 1534236469;

		System.out.println(reverseNumber(a));

	}

}
