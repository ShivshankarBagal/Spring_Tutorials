package com.stereotypeAnnotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentDriver {
	
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/stereotypeAnnotations/stereotypeConfig.xml");
	
	    Student student=context.getBean("studentDetails", Student.class);
	   
	    System.out.println(student.getStudentName());
	    System.out.println(student.hashCode());
	    System.out.println(student.getSkills());
	    
	    
	    Student student2=context.getBean("studentDetails", Student.class);
	    System.out.println(student2.hashCode());
	}

}
