package com.springCore.springORM.dao;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.springCore.springORM.entites.Student;

public class StudentDao {
	
	
	private HibernateTemplate hibernateTemplate;
	
	public int insert(Student student)
	{
		//insert
		
	 Integer i=(Integer) this.hibernateTemplate.save(student);
		
		return 1;
	}
}
