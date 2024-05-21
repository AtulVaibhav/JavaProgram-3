package com.learning.Spring.setterInjection_IV;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("application-context.xml");
		System.out.println(applicationContext.getBean("s4",Student.class));

	}

}
