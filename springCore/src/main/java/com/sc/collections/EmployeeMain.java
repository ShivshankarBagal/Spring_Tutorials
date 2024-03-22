package com.sc.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/sc/collections/collectionConfig.xml");
		
		Employee employee1=(Employee)context.getBean("emp1");
		System.out.println(employee1.getEmpId());
		System.out.println(employee1.getEmpName());
		System.out.println(employee1.getMobilenumbers());
		System.out.println(employee1.getCourses());

	}

}
