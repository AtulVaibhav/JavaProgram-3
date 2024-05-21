package com.learning.Spring.beanLifeCycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	AbstractApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
	Box b = context.getBean("box",Box.class);
	b.getWidth();
    context.registerShutdownHook();

	}

}
