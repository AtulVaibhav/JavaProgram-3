package com.learning.Spring.beanLifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Box implements InitializingBean,DisposableBean{
	private int width;
	
	Box(){
		System.out.println("Box created");
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		System.out.println("Setter() method called");
		this.width = width;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Init() method called");
		
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("destroy() method called");
		
	}
	
	

}
