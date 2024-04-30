package com.learning.Hibernate.crud;

public class Main {

	public static void main(String[] args) {
		HibernateUtils hibernateUtils= new  HibernateUtilImpl();
		
//	    Student s1 = new Student("Harsh","Java");
//		System.out.println(hibernateUtils.addStudent(s1));
		
//		Student s2 =new Student("Aman","Web");
//        System.out.println(hibernateUtils.addStudent(s2));
		
//		System.out.println(hibernateUtils.findStudentById(1));
		
//		System.out.println(hibernateUtils.updateStudent(1,new Student("Harsh","CyberSecurity")));
	
        System.out.println(hibernateUtils.deleteStudent(1));	
	}

}
