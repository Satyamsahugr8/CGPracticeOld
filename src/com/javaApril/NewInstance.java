package com.javaApril;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import com.java.oops.Student;

class StudentNewInstance {
	private int rollNo;
	private String Name;

	public StudentNewInstance(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		Name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", Name=" + Name + "]";
	}

	public StudentNewInstance() {
		super();
		System.out.println("Default Constructor");
	}
	
	
}

public class NewInstance {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		try {
			StudentNewInstance s = StudentNewInstance.class.newInstance();
			
			s.setName("Satyam");
			s.setRollNo(64);
			System.out.println(s);
			
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		
		
		
		//2 
		
		Constructor<StudentNewInstance> constructor = StudentNewInstance.class.getDeclaredConstructor();
		StudentNewInstance student = constructor.newInstance();
		
		Constructor<StudentNewInstance> constructor2 = StudentNewInstance.class.getDeclaredConstructor(new Class[] { int.class , String.class , Student.class });
		StudentNewInstance student2 = constructor2.newInstance();
		
		
		
	}
}
