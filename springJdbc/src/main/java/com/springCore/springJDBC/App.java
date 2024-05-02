package com.springCore.springJDBC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        //springJDBC => jdbcTemplate
        
        ApplicationContext context= 
        		new ClassPathXmlApplicationContext("com/springCore/springJDBC/config.xml");
    
       JdbcTemplate template= context.getBean("jdbcTemplate", JdbcTemplate.class);
       
       //insert query
       String query="insert into student (id, name, city) values(?,?,?)";
       
       
       //fire query
       int result=template.update(query, 32, "Ramesh", "Pune");
    
       System.out.println("insert "+result+" record successfully");
       
    
    
    }
}
