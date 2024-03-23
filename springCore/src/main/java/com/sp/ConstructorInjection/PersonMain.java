package com.sp.ConstructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/sp/ConstructorInjection/ConstructorConfig.xml");
		
		Person p1=(Person)context.getBean("person1");
		System.out.println(p1);

	}

}
