package com.java.Basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FibonacciSeries {
	public static void main(String args[]) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		
		int n1 = 0;
		int n2 = 1;
		
		int n3, i;
		
		// base condition
		if (count == 1) {
			System.out.print(n1);
		} else if (count == 2) {
			System.out.print(n1 + " " + n2);
		} 
		
		// printing count>2
		else {
			System.out.print(n1 + " " + n2);
			for (i = 2; i < count; ++i)// loop starts from 2 because 0 and 1 are
			{
				n3 = n1 + n2;
				System.out.print(" " + n3);
				n1 = n2;
				n2 = n3;
			}
		}

	}
}
