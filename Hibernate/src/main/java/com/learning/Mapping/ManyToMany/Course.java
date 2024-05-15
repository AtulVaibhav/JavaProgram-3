package com.learning.Mapping.ManyToMany;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Course {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
 private int courseId;
 private String courseName;
 
 @ManyToMany(mappedBy="courses")
 private Set<Student> students;

public Course() {
	super();
	// TODO Auto-generated constructor stub
}

public Course(String courseName, Set<Student> students) {
	super();
	this.courseName = courseName;
	this.students = students;
}

public int getCourseId() {
	return courseId;
}

public void setCourseId(int courseId) {
	this.courseId = courseId;
}

public String getCourseName() {
	return courseName;
}

public void setCourseName(String courseName) {
	this.courseName = courseName;
}

public Set<Student> getStudents() {
	return students;
}

public void setStudents(Set<Student> students) {
	this.students = students;
}
 
 
}
