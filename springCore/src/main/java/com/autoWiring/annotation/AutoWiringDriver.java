package com.autoWiring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.autoWiring.annotation.Employee;
public class AutoWiringDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/autoWiring/annotation/autoConfig.xml");

		
		Employee emp1=context.getBean("EmployeeConfig", Employee.class);
		System.out.println(emp1);
	}

}
