package com.javaApril;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderDemo {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		String s = r.readLine();
		System.out.println(s);
		
	}

}
