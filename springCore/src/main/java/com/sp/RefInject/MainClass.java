package com.sp.RefInject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/sp/RefInject/ReferanceConfig.xml");
		
		Customer customer=(Customer)context.getBean("customer1");
		
		System.out.println(customer.getcustomerId());
		System.out.println(customer.getCustomerName());
		System.out.println(customer.getOrder());

	}

}
