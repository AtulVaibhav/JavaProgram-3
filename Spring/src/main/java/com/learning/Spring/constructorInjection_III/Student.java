package com.learning.Spring.constructorInjection_III;

import java.util.List;

public class Student {
    private int studentId;
    private String studentName;
    private List<String> courses;
	
	public Student(int studentId, String studentName, List<String> courses) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", courses=" + courses + "]";
	}
    
    
}
