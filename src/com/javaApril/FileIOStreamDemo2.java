package com.javaApril;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileIOStreamDemo2 {

	static BufferedReader br;
	static PrintWriter pw;

	public static void main(String[] args) throws IOException {
		
		File f = new File("Text.txt");
		
		if (!f.exists()) {
			
			f.createNewFile();
			
		} 
		
		FileOutputStream fos = new FileOutputStream(f);
		
		String toWrite = "Satyam Hi Hello";
		
		fos.write(toWrite.getBytes());
	
		fos.close();
		
		
		FileInputStream fis = new FileInputStream(f);
		
		int i = fis.read();
		
		while(!(i == -1)) {
			
			char c = (char) i;
			System.out.print(c);
			
			i = fis.read();
			
		}
		fis.close();
		
	}

}
