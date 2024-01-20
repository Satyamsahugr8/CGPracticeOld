package com.java.generics;
// Java program to Demonstrate that Not Using Generics
// Can cause Run Time Exceptions

// Importing all utility classes
import java.util.*;

// Main class
public class GFG {

	// Main driver method
	public static void main(String[] args)
	{
		// Creating an ArrayList
		// Declaring object without any type specified
		ArrayList al = new ArrayList();

		// Adding elements to the above object
		// Custom input elements
		al.add("Sachin");
		al.add("Rahul");

		// Compiler will allows this operation
		al.add(10);

		String s1 = (String)al.get(0);
		String s2 = (String)al.get(1);

		// Try block to check for exceptions
		try {

			// Causes Runtime Exception
			String s3 = (String)al.get(2);
		}

		// Catch block to handle the exceptions
		catch (Exception e) {
			// Display the exception
			System.out.println("Exception: " + e);
		}
		
		System.out.println("-----------------");

		System.out.println("Using generics");
		GFG2 gfg = new GFG2();
		gfg.main(args);
	}
}




//Java Program to Illustrate Conversion of
//Runtime Exceptions into compile time errors
//Using generics

//Main class
class GFG2 {

	// Main driver method
	public static void main(String[] args)
	{
		// Creating an ArrayList
		// Declaring object of string type
		ArrayList<String> al = new ArrayList<String>();

		// Adding elements to the ArrayList
		// Custom input elements
		al.add("Sachin");
		al.add("Rahul");

		// Now compiler does not allow this operation
//		al.add(10);

		String s1 = al.get(0);
		String s2 = al.get(1);
//		String s3 = al.get(2);
		System.out.println("s1:"+s1);
		System.out.println("s2:"+s2);
	}
}

