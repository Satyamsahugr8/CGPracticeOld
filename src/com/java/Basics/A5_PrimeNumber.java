package com.java.Basics;

import java.util.Scanner;

public class A5_PrimeNumber {
	
	static boolean isPrime(int n, int i)
	{
		// Base cases
		if (n <= 2)
			return (n == 2) ? true : false;
		
		if (n % i == 0)
			return false;
		
		if (i * i > n)
			return true;
	
		// Check for next divisor
		return isPrime(n, i + 1);
	}
	
	static void Prime(int number) {
		
		int count = 0;
		
		for(int i=2; i<(number/2) ; i++) {
			
			if(number%i == 0) {
				
				count++;
				
			}
		}
		
		if(count == 0) {
			
			System.out.println("Prime Number");
			
		} else {
			System.out.println("Not Prime");
		}
		
	}
	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number ");
		int n = sc.nextInt();

		Prime(n);
		
		// 1
	

//		// 0,1,2 
//		
//		if (n == 0 || n == 1) {
//			System.out.println("i am not a prime number ");
//		}
//		
//		else if (n == 2) {
//			System.out.println("i am prime number ");
//		} 
//		
//		else { 
//			for (int i = 2; i <= n - 1; i++) {
//				if (n % i == 0) {
//					System.out.println("I am Not a prime number");
//					break;
//				} else
//					System.out.println("I am Prime Number");
//				break;
//				}	
//		}
		
		
		//2

		
//		if (isPrime(n, 2))
//			System.out.println("Yes");
//		else
//			System.out.println("No");
		
	}
}


