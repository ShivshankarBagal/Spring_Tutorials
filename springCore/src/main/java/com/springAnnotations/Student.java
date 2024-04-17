package com.springAnnotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("student")
public class Student {
	
	
	private String name;
	
	public void  study() {
		System.out.println("This is in Student class tudy() method");
	}

}
