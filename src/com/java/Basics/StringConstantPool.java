package com.java.Basics;

public class StringConstantPool {
	
	public static void main(String[] args) {
		
		String s1 = new String("Styla");
		String s2 = new String("Styla");
		
		String s3 = "Styla";
		
		System.out.println(s1 == s2 ); // false
		// it check the reference wheather it is pointing same or not
		 
		String s4 = "Styla";
		System.out.println(s3 == s4 ); // true
	}

}
