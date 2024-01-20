package com.java.oops;

abstract class Data {
	
	 int rollNum;
	 String studentName;
	 
	 abstract void initialWork(int rollNum, String studentName);

}

public class Student extends Data {

	public Student() {
//		super();
	}
	
	public Student(int a) {
//		super();
//		this();
	}
	
	@Override
	void initialWork(int rollNum, String studentName) {
		super.rollNum = rollNum;
		super.studentName = studentName;
	}
	
}
