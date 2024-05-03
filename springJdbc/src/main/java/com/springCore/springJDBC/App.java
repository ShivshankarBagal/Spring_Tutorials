package com.springCore.springJDBC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.springCore.springJDBC.dao.StudentDao;
import com.springCore.springJDBC.entities.Student;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        //springJDBC => jdbcTemplate
        
        ApplicationContext context= 
        		new ClassPathXmlApplicationContext("com/springCore/springJDBC/config.xml");
    
     
        StudentDao studentDao = context.getBean("studentdaoimpl",StudentDao.class);
       
        Student student=new Student();
        student.setId(18);
        student.setName("Sangram");
        student.setCity("Pune");
        
        int result=studentDao.insert(student);
        
        System.out.println("insert "+result+" record successfully");
       
    
    
    }
}
