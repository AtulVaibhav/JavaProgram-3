package com.learning;

class Student{
	int studentId;
	String studentName;
	
	Student(int id,String name){
		studentId=id;
		studentName=name;
	}
	
	public void show(){
		System.out.println("Id :"+studentId);
		System.out.println("Name :"+studentName);
	}
}

public class Constructor_II {

	public static void main(String[] args) {
		Student s1 = new Student(1001,"Harsh");
		s1.show();
		Student s2 = new Student(1003,"Aman");
		s2.show();

	}

}
