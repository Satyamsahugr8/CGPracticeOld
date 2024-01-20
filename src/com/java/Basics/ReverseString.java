package com.java.Basics;

/**
 * @author satyasah
 *
 */
public class ReverseString {

	static boolean checkPalindromeString(String input) {
		boolean result = true;
		int length = input.length();

		for (int i = 0; i < length / 2; i++) {
			if (input.charAt(i) != input.charAt(length - i - 1)) {
				result = false;
				break;
			}
		}

		return result;
	}

	public static void main(String[] args) {

//		String str = "sassas";
//
//		String s = "s";
//		1 -> 1 0 
//		String ste = "aaa";
//		3 -> 2 1

		String stre = "sasas";

////		5 -> 3 0,1,2
//		String stree = "sasasas";
////		7 -> 4 3
//		String streee = "sasasasas";
////		9 -> 5 4

//		reverseString(stre);
		
		
	   if(checkPalindromeString(stre)) {
		   System.out.println("Pallindrome");
	   }

	}

	
}
