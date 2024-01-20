package com.java.Basics;

public class ReverseStringReverseNumberPrimeNumber {

//	public static void ReverseString() {
//		String string = "Satyam";
//		char ch [] = new char[string.length()];
//		
//		for(int i=0; i < string.length(); i++) {
//			ch[i] = string.charAt(string.length()-(i+1));
//		}
//		
////		for(int i=0; i<string.length(); i++) {
////			System.out.println(ch[i]);
////		}
//		
//		String ss = new String(ch);
//		System.out.println(ss);
//
//	}

	public static void ReverseNumber() {
		int a = 12345;
		int rev = 0;
		
		while(a!=0) {
			int l = a % 10;
			rev = rev * 10 + l;
			a = a/10;
		}
		
		System.out.println(rev);
	}

	
	public static void Pallidrome() {
		int a = 121;
		int b = a;
		int rev = 0;
		
		while(a!=0) {
			int l = a % 10;
			rev = rev * 10 + l;
			a = a/10;
		}
		
		if(rev == b)
		System.out.println("pallidrome Number");
	}
	
	public static void Prime(int a) {
		
		int count = 0;
		for (int i = 2; i <= a/2; i++) {
			 if( a%i == 0) {
				 count ++;
			 }
		}
		
		if(count == 0 ) {
			System.out.println("Prime");
		} else 
			System.out.println("Not Prime");

	}
	
	public static void main(String[] args) {
//		ReverseString();
//		ReverseNumber();
//		Pallidrome();
		Prime(53);
	}
}
