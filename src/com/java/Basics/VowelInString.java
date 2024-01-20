package com.java.Basics;

public class VowelInString {

	public static void main(String[] args) {

		String s = "sat";

		char vowel[] = { 'a', 'e', 'i', 'o', 'u' };

		for (int i = 0; i < vowel.length; i++) {

			for (int j = 0; j < s.length(); j++) {
//				System.out.println(s.charAt(j));
//				System.out.println(vowel[i]);
				if (s.charAt(j) == vowel[i]) {
					System.out.println("Present vowel at: " + j);
//					System.out.println(j);
					break;
				}
			}
		}
		
		check();
	}

	private static void check() {
		
	}
}
