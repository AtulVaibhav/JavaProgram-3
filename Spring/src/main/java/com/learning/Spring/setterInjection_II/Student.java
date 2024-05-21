package com.learning.Spring.setterInjection_II;

public class Student {
   private int studentId;
   private String studentName;
   private Address addr;
public Address getAddr() {
	return addr;
}
public void setAddr(Address addr) {
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
