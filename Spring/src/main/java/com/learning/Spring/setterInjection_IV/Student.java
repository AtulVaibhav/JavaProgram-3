package com.learning.Spring.setterInjection_IV;

import java.util.List;

public class Student {
   private int studentId;
   private String studentName;
   private List<Address> addr;

public List<Address> getAddr() {
	return addr;
}
public void setAddr(List<Address> addr) {
	this.addr = addr;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public int getStudentId() {
	return studentId;
}
public void setStudentId(int studentId) {
	this.studentId = studentId;
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
@Override
public String toString() {
	return "Student [studentId=" + studentId + ", studentName=" + studentName + ", addr=" + addr + "]";
}
   
}
