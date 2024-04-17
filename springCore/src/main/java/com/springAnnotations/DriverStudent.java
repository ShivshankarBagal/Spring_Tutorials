package com.springAnnotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriverStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		ApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
		
		Student s1=context.getBean("student",Student.class);
		System.out.println(s1);
		s1.study();

	}

}
