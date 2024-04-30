package com.learning.Hibernate.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtilImpl implements HibernateUtils {

	private static SessionFactory factory=null;
	
	private static SessionFactory getSessionFactory(){
		if(factory==null){
			factory = new Configuration()
					.configure("hibernate.cfg.xml")
					.buildSessionFactory();
		}
		return factory;
	}
	
	@Override
	public String addStudent(Student student) {
		Session session = getSessionFactory().openSession();
		session.beginTransaction();
		session.save(student);
		session.getTransaction().commit();
		return "Student added successfully";
	}

	@Override
	public Student findStudentById(int studentId) {
		Session session = getSessionFactory().openSession();
		return session.get(Student.class,studentId);
	}

	@Override
	public String updateStudent(int id,Student updatedStudent) {
		Session session= getSessionFactory().openSession();
		session.beginTransaction();
		Student student =session.get(Student.class, id);
		if(student!=null){
		 student.setStudentName(updatedStudent.getStudentName());
		 student.setCourses(updatedStudent.getCourses());
		 session.save(student);
		 session.getTransaction().commit();
		 return "Student updated successfully";
		}
		return "Updation failed";
	}

	@Override
	public String deleteStudent(int studentId) {
		Session session=getSessionFactory().openSession();
		session.beginTransaction();
		Student s = session.get(Student.class, studentId);
		if(s!=null){
			session.delete(s);
			session.getTransaction().commit();
			return "Student deleted successfully";
		}
		return "Deletion failed";
	}

}
