package com.autoWiring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	
	@Autowired
	@Qualifier("address11")
	private Address address;

	public Address getAddress() {
		return address;
	}

	
	public void setAddress(Address address) {
		System.out.println("using setter method");
		this.address = address;
	}

	public Employee(Address address) {
		super();
		this.address = address;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}
	
	

}
