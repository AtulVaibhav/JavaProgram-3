package com.learning.Spring.constructorInjection_I;

public class Student {
    private int studentId;
    private String studentName;
	public Student(int studentId, String studentName) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + "]";
	}
    
    
}
