package com.java.Basics;

import java.util.Scanner;

public class A6_PrintEvenNum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
//		int n = 12 ;
		
		System.out.print("0");
		for (int i = 1; i <= n; i++) {
			if(i%2==0) {
					System.out.print(","+i);
					}
				}
		
		
		
	}

}
