package com.javaApril;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FirstRankStudent {

	public static void main(String[] args) {

		Student s1 = new Student(1, "Avani", 76);
		Student s2 = new Student(34, "Mukul", 87);
		Student s3 = new Student(2, "Bhalu", 60);
		Student s4 = new Student(5, "Rajesh", 99);
		Student s5 = new Student(3, "Kopikar", 100);
		Student s6 = new Student(11, "Satyam", 56);

		ArrayList<Student> l1 = new ArrayList<Student>();
		l1.add(s1);
		l1.add(s2);
		l1.add(s3);
		l1.add(s4);
		l1.add(s5);
		l1.add(s6);

		// foreach
		for (Student s : l1) {
			System.out.println(s);
		}

		System.out.println(":::::::::::::::::::::");
//
//		Collections.sort(l1);
//
//		// foreach
//		for (Student s : l1) {
//			System.out.println(s);
//		}
//
//		System.out.println(":::::::::::::::::::::");
//
//		Collections.reverse(l1);
//		
//		// foreach
//		for (Student s : l1) {
//			System.out.println(s);
//		}
		
		
		Student min = l1.stream().min((i1,i2)->i1.compareTo(i2)).get();
		System.out.println(min);
		
		Student max = l1.stream().max((i1,i2)->i1.compareTo(i2)).get();
		System.out.println(max);
		
	}

}
