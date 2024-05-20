package com.learning.Spring.constructorInjection_IV;

import java.util.List;



public class Student {
    private int studentId;
    private String studentName;
    private List<Address> addr;
	
	public Student(int studentId, String studentName, List<Address> addr) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", addr=" + addr + "]";
	}

	

	
    
    
}
