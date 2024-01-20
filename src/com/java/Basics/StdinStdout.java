package com.java.Basics;

import java.util.Scanner;

public class StdinStdout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String myString = scanner.next();
		int myInt = scanner.nextInt();
		scanner.close();
//		String myString1 = scanner.next();

		System.out.println("myString is: " + myString);
		System.out.println("myInt is: " + myInt);
//		System.out.println("myString1 is: " + myString1);
		

	}

}
