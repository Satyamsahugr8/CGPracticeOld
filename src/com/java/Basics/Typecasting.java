package com.java.Basics;

public class Typecasting {

	public static void main(String[] args) {
		// TYPE CASTING 
		char ch = 'a';
		int N =  ch++; // this is implicit type casting
		int B = ch;
		System.out.println(N +" "+B);
		
		int A = 98;
		char C = (char)A;
		System.out.println(C); // #OUTPUT IS b
		
		double d = 10.8 ;
//    	int s = d ;  // this is possible with implicit type casting so in the next i have used explicit type casting
		int sq = (int) d ;
		System.out.println(sq);
		
		float f = (float) 1.7; // so by default 1.7 is double 
		short sw = 17 ; // 2 bytes
		int iq = sw ;   // 4 bytes <- 2 bytes 
//		short fw = iq;  // 2 bytes <- 4 bytes which is wrong X
		short r = (short) iq ;
		System.out.println(r);
		
	
		System.out.println(4 + 4); // int
		System.out.println(4 + 4.5);  // double
		System.out.println(4.5 + 4.5); // double
		System.out.println( 2/5 ); // int/int = int
		System.out.println( 2.5/5 ); // double/int = double
		System.out.println( 6/5 ); // double/double = double		
		
	}

}
