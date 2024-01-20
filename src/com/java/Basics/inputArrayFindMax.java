package com.java.Basics;

import java.util.Scanner;

public class inputArrayFindMax {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array - ");
		int n = sc.nextInt();
		int[] intArray = new int[n];
		
		System.out.println("Enter Arrays elements - ");
		for ( int i=0 ; i<n ; i++) {
			intArray[i] = sc.nextInt();
		}
		
//		for ( int i=0 ; i<n ; i++) {
//		System.out.println(intArray[i]);
//	}
		
		int maX = -10000002;
		for ( int i=0 ; i<n ; i++) {
			if(maX  < intArray[i]) {
				maX = intArray[i];
			}
		}
		
		System.out.println("Max element of Array is "+ maX);
	

		sc.close();
	
	}
}
