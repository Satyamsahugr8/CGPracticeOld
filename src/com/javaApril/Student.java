package com.javaApril;

public class Student implements Comparable<Student> {
	
	private int studentRoll;
	private String StudentName;
	private int mark;
	
	public int getStudentRoll() {
		return studentRoll;
	}
	public void setStudentRoll(int studentRoll) {
		this.studentRoll = studentRoll;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
	public Student(int studentRoll, String studentName, int mark) {
		super();
		this.studentRoll = studentRoll;
		StudentName = studentName;
		this.mark = mark;
	}
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Student [studentRoll=" + studentRoll + ", StudentName=" + StudentName + ", mark=" + mark + "]";
	}
	@Override
	public int compareTo(Student o) {
		return this.mark - o.mark;
	}

}
