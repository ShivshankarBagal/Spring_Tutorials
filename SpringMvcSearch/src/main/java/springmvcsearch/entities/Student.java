package springmvcsearch.entities;

import java.util.Date;
import java.util.List;

public class Student {
	private String name;
	private Long id;

	private Date dob;
	private List<String> courses;
	private String gender;

	private Address address;
	private String studentType;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, Long id, Date dob, List<String> courses, String gender, Address address,
			String studentType) {
		super();
		this.name = name;
		this.id = id;
		this.dob = dob;
		this.courses = courses;
		this.gender = gender;
		this.address = address;
		this.studentType = studentType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public List<String> getCourses() {
		return courses;
	}

	public void setCourses(List<String> courses) {
		this.courses = courses;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getStudentType() {
		return studentType;
	}

	public void setStudentType(String studentType) {
		this.studentType = studentType;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", dob=" + dob + ", courses=" + courses + ", gender=" + gender
				+ ", address=" + address + ", studentType=" + studentType + "]";
	}

}
