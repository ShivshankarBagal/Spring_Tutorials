package com.lifeCycleMethods;

public class LifeCycleMethods {

	
	
	
	// This method executes
    // automatically as the bean
    // is instantiated
	
	//here we can change the name  of init() method , 
	//then we need to change name in .xml file also
    public void init() throws Exception
    {
        System.out.println(
            "Bean LifeCycleMethods has been instantiated and I'm  in inti() Method" );
      }
    
    
    
 // This method executes
    // when the spring container
    // is closed
    public void destroy() throws Exception
    {
        System.out.println(
            "Container has been closed "
            + "and I'm the destroy() method");
    }
    
    
    
    
    
    
}
