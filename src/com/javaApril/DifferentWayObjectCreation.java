package com.javaApril;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class Students {
	private int sNo;
	private String sName;

	public Students() {

	}
	
	public Students(int sNo, String sName) {
		super();
		this.sNo = sNo;
		this.sName = sName;
	}



	@Override
	public String toString() {
		return "Student [sNo=" + sNo + ", SName=" + sName + "]";
	}

}

//public class DifferentWayObjectCreation {
//	
//	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
//		String classPath = "com.java12April.Student";
//		Class classs = Class.forName(classPath);
//		Student student = (Student) classs.newInstance();
//		
//		System.out.println(student);
//	}
//}

public class DifferentWayObjectCreation {
	
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		Constructor<Students> cons = Students.class.getConstructor();
		Students student = cons.newInstance();
		
		Constructor<Students> cons2 = Students.class.getDeclaredConstructor(new Class[] { int.class, String.class });
		Students student2 = cons2.newInstance(64,"SatyamSahu");
		
		
		System.out.println(student);
		System.out.println(student2);
		
		System.out.println(";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;");
		
		System.out.println(student.getClass().getName());
	}
}
