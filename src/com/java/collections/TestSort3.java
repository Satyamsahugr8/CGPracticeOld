package com.java.collections;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student> {
	int rollno;
	String name;
	int age;

	Student(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	public int compareTo(Student st) {
		if (age == st.age)
			return name.compareTo(st.name);
		else if (age > st.age)
			return 1;
		else
			return -1;
	}
}

//Creating a test class to sort the elements  
public class TestSort3 {
	public static void main(String args[]) {
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(101, "Vijay", 21));
		al.add(new Student(102, "A", 21));
		al.add(new Student(103, "B", 21));
		al.add(new Student(103, "D", 22));
		al.add(new Student(103, "C", 22));
		al.add(new Student(103, "B", 25));
		al.add(new Student(106, "Ajay", 27));
		al.add(new Student(105, "Jai", 21));

		Collections.sort(al);
		
		for (Student st : al) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
	}
}