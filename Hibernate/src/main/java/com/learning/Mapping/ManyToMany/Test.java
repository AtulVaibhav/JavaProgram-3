package com.learning.Mapping.ManyToMany;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		Student s1 =new Student();
		s1.setStudentName("Harsh");
		
		Student s2 =new Student();
		s2.setStudentName("Amit");
		
		Student s3 =new Student();
		s3.setStudentName("Vivek");
		
		Set<Student> set1 =new HashSet<>();
		set1.add(s1);
		set1.add(s2);
		
		Set<Student> set2 =new HashSet<>();
		set2.add(s2);
		set2.add(s3);
		
		
		Set<Student> set3 =new HashSet<>();
		set3.add(s1);
		set3.add(s3);
		
		Course c1 = new Course();
		c1.setCourseName("Java");
		
		Course c2 = new Course();
		c2.setCourseName("C++");
		
		Course c3 = new Course();
		c3.setCourseName("Python");
		
		Set<Course> courseSet1 = new HashSet<>();
		courseSet1.add(c1);
		courseSet1.add(c2);
		
		Set<Course> courseSet2 = new HashSet<>();
		courseSet2.add(c2);
		courseSet2.add(c3);
		
		Set<Course> courseSet3 = new HashSet<>();
		courseSet3.add(c1);
		courseSet3.add(c3);
		
		s1.setCourses(courseSet1);
		s2.setCourses(courseSet2);
        s3.setCourses(courseSet3);
        
        c1.setStudents(set1);
        c2.setStudents(set2);
        c3.setStudents(set3);
        
        SessionFactory factory = new Configuration()
        		.configure()
        		.buildSessionFactory();
        
        Session session = factory.openSession();
        session.beginTransaction();
        session.save(s1);
        session.save(s2);
        session.save(s3);
        
        session.getTransaction().commit();
        session.close();
        
        System.out.println("Object saved successfully");
        
        
        
        
	}

}
