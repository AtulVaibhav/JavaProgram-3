package com.learning.Hibernate.primaryKeyGeneration;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Course {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
  private int courseId;
  private String courseName;
public Course() {
	super();
	// TODO Auto-generated constructor stub
}
public Course(String courseName) {
	super();
	this.courseName = courseName;
}
@Override
public String toString() {
	return "Course [courseId=" + courseId + ", courseName=" + courseName + "]";
}
  
  
}
