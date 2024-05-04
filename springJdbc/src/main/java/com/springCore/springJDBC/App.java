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
       
        //insert
//        Student student=new Student();
//        student.setId(121);
//        student.setName("Sangram");
//        student.setCity("Pune");
//        
//        int result=studentDao.insert(student);
//        
//        System.out.println("insert "+result+" record successfully");
       
        
        //update
//        Student student1=new Student();
//      student1.setId(121);
//      student1.setName("Manish");
//      student1.setCity("Nagar");
//      int result1 = studentDao.change(student1);
//      System.out.println("changes "+result1+"  successfully");
//      
       
        //delete
        Student student2=new Student();
        student2.setId(121);
        int result=studentDao.delete(121);
        System.out.println("delete "+result+"  successfully");
        
    }
}
