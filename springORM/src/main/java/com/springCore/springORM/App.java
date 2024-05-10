package com.springCore.springORM;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springCore.springORM.dao.StudentDao;
import com.springCore.springORM.entites.Student;


public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
   
    StudentDao studentDao=context.getBean("studentDao", StudentDao.class);
    Student student=new Student(41, "Pranav", "Pune");
    int r = studentDao.insert(student);
    
    System.out.println("DONE "+r);
    
    studentDao.delete(11);
    
    }
}
