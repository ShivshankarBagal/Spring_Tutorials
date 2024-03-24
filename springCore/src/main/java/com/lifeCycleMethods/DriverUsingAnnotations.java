package com.lifeCycleMethods;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriverUsingAnnotations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/lifeCycleMethods/UsingAnnotations.xml");
		
		((AbstractApplicationContext) context).close();
	}

}
