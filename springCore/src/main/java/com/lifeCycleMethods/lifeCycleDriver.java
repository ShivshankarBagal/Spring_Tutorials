package com.lifeCycleMethods;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class lifeCycleDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// Loading the Spring XML configuration
        // file into the spring container and
        // it will create the instance of
        // the bean as it loads into container
		ApplicationContext context=new ClassPathXmlApplicationContext("com/lifeCycleMethods/LifeCycleMethods.xml");
		
		
		// It will close the spring container
        // and as a result invokes the
        // destroy() method
		((AbstractApplicationContext) context).close();

	}

}
