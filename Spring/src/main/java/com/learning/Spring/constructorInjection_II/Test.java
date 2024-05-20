package com.learning.Spring.constructorInjection_II;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("application-context.xml");
		System.out.println(context.getBean("st",Student.class));	
	}

}
