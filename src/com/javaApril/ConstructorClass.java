package com.javaApril;

import java.lang.reflect.*;

public class ConstructorClass {
	private int num;
	private String name;

	ConstructorClass() {
	}

	public ConstructorClass(int num, String name) {
		super();
		this.num = num;
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "ConstructorClass [num=" + num + ", name=" + name + "]";
	}

	public static void main(String[] args) {
		try {


			Constructor<ConstructorClass> c = ConstructorClass.class.getDeclaredConstructor(new Class[] { int.class, String.class });
			Constructor<ConstructorClass> c1 = ConstructorClass.class.getDeclaredConstructor();

			
			ConstructorClass r = c.newInstance(64, "satyam");
			ConstructorClass r1 = c1.newInstance();

			System.out.println(r1);
			System.out.println(r);
			
		}

		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
