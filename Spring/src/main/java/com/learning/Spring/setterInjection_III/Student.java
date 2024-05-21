package com.learning.Spring.setterInjection_III;

import java.util.List;

public class Student {
   private int studentId;
   private String studentName;
   private List<String> courses;
   
public List<String> getCourses() {
	return courses;
}
public void setCourses(List<String> courses) {
	this.courses = courses;
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
	return "Student [studentId=" + studentId + ", studentName=" + studentName + ", courses=" + courses + "]";
}
   
}
