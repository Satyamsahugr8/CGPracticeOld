package com.java.collections;

import java.util.*;

public class Employee {
	private String name;
	private int age;
	private int Salary;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	
	public Employee(String name, int age, int salary) {
		super();
		this.name = name;
		this.age = age;
		Salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", Salary=" + Salary + "]";
	}
	
	public static void main(String[] args) {
		List<Employee> employee = new ArrayList<Employee>();
		employee.add(new Employee("ctyam",22,400000));
		employee.add(new Employee("dAtyamsahu",20,400500));
		employee.add(new Employee("acayank",22,406500));
		employee.add(new Employee("bahu",22,402330));
		
//		Collections.sort(employee,(o1,o2)->o1.Salary-o2.Salary);
		Collections.sort(employee,(o1,o2)->o1.name.compareTo(o2.name));
		System.out.println(employee);
	}
	
	
	
	
	

}
