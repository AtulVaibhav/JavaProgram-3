package com.accessmodifier.pack2;

import com.accessmodifier.pack1.Student;

public class Test {

	public static void main(String[] args) {
		Student s1 = new Student();
		//System.out.println(s1.studentId);
		System.out.println(s1.studentName);
		
		Child ch = new Child();
		//System.out.println(ch.deptName);

	}

}
