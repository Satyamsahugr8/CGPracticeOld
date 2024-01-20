/**
 * 
 */
package com.javaApril;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Main {
	
	static double findSqrt(double a) {
		
		double t;
		double sqrt = a/2;
		
		do {
			t = sqrt;
			sqrt = (t + a/t)/2;
			
		} while( t - sqrt != 0 );
		
		return sqrt;
	}
	
	public static void main(String[] args) {
		
//		Scanner s = new Scanner(System.in);
//		double d = s.nextInt();
//		
//		System.out.println(findSqrt(d));
//		
//		
//		LinkedHashSet<Integer> ssd;
//		LinkedHashMap<Integer, String> IS;
//		
		
		try {
			
		} finally {
			System.out.println("Finally");
		}
		
		
		
	}
}
	
	
