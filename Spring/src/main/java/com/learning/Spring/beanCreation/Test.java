package com.learning.Spring.beanCreation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("application-context.xml");
         System.out.println("IOC created");
         
         context.getBean("box",Box.class);
	}

}
