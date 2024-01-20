package com.javaApril;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class StudentT implements Serializable {
	int id;
	String name;
	transient int age;// Now it will not be serialized

	public StudentT(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
}

public class TransientKeywordDemo {
	
	public static void main(String args[]) throws IOException {
		
		StudentT s1 = new StudentT(211, "ravi", 22);// creating object
		
		// writing object into file
		FileOutputStream f = new FileOutputStream("StudentT.txt");
		
		ObjectOutputStream out = new ObjectOutputStream(f);
		
		out.writeObject(s1);
		out.flush();
		out.close();
		
		f.close();
		
		System.out.println("success");
		
	}
}