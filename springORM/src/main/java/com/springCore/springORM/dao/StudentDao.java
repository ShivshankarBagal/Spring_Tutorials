package com.springCore.springORM.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.springCore.springORM.entites.Student;

public class StudentDao {
	
	
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public int insert(Student student)
	{
		//insert
		
	 Integer i=(Integer) this.hibernateTemplate.save(student);
		
		return i;
	}
	
	
	//fetching single student data
	public Student getStudent(int studentId) {
		
		Student student = this.hibernateTemplate.get(Student.class, studentId);
		return student;
		
	}
	
	//fetching All student data
	public List<Student> getAllStudents(){
		
		List<Student> students=this.hibernateTemplate.loadAll(Student.class);
		return students;
	}
	
	//delete single data
	@Transactional
	public void delete(int studentId) {
		
		Student student = this.hibernateTemplate.get(Student.class, studentId);
		this.hibernateTemplate.delete(student);
	}
	
	//update
	@Transactional
	public int updateStudent(Student s) {
		 this.hibernateTemplate.update(s);
		
		return 1;
	}
	
	
	

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	
}
