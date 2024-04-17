package com.stereotypeAnnotations;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component
@Component("studentDetails")

@Scope("prototype") //this is for telling  scope of bean
public class Student {
	
	@Value("AMit Tate")
	private String studentName;
	
	@Value("Parali")
	private String city;
	
	//for list of values
	
	@Value("#{listOfSkills}")
	private List<String> skills;
	

	public List<String> getSkills() {
		return skills;
	}

	public void setSkills(List<String> skills) {
		this.skills = skills;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", city=" + city + ", skills=" + skills + "]";
	}
	
	

}
