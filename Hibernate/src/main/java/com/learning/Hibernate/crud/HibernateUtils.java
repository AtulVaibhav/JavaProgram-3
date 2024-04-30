package com.learning.Hibernate.crud;

public interface HibernateUtils {
     String addStudent(Student student);
     Student findStudentById(int studentId);
     String updateStudent(int id,Student updatedStudent);
     String deleteStudent(int studentId);
}
