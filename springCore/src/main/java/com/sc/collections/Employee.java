package com.sc.collections;

import java.util.List;
import java.util.Set;

public class Employee {
	
	private String empName;
	private int empId;
	
	private List<String> mobilenumbers;
	
	private Set<String> courses;
	
	

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public List<String> getMobilenumbers() {
		return mobilenumbers;
	}

	public void setMobilenumbers(List<String> mobilenumbers) {
		this.mobilenumbers = mobilenumbers;
	}

	public Set<String> getCourses() {
		return courses;
	}

	public void setCourses(Set<String> courses) {
		this.courses = courses;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String empName, int empId, List<String> mobilenumbers, Set<String> courses) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.mobilenumbers = mobilenumbers;
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empId=" + empId + ", mobilenumbers=" + mobilenumbers + ", courses="
				+ courses + "]";
	}
	
	
	
	

}
