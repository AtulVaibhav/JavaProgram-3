package com.streamApi;

import java.util.Arrays;
import java.util.List;

class Student{
	private int studentId;
	private String studentName;
	private String courseEnrolled;
	private int age;
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
	public String getCourseEnrolled() {
		return courseEnrolled;
	}
	public void setCourseEnrolled(String courseEnrolled) {
		this.courseEnrolled = courseEnrolled;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Student(int studentId, String studentName, String courseEnrolled, int age) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.courseEnrolled = courseEnrolled;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", courseEnrolled=" + courseEnrolled
				+ ", age=" + age + "]";
	}
	
	
}


public class Test4 {

	public static void main(String[] args) {
		Student s1 = new Student(105,"Harsh","Java",24);
		Student s2 = new Student(103,"Amit","Web",25);
		Student s3 = new Student(101,"Arya","Java",21);
		Student s4 = new Student(107,"Vivek","CS",29);
		Student s5 = new Student(102,"Yogesh","Java",32);
		
		
		List<Student> list = Arrays.asList(s1,s2,s3,s4,s5);
//		list.stream()
//		.filter(s->s.getCourseEnrolled().equals("Java"))
//		.forEach(s->System.out.println(s.getStudentName()));
		
		list.stream()
		    .filter(s->s.getAge()>=25 && s.getAge()<30)
            .forEach(s->System.out.println(s));		

	}

}
