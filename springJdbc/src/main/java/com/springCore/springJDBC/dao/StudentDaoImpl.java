package com.springCore.springJDBC.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.springCore.springJDBC.entities.Student;

public class StudentDaoImpl  implements StudentDao{

	private JdbcTemplate jdbcTemplate;
	
	public int insert(Student student) {
		
		String query="insert into student (id, name, city) values(?,?,?)";
		
		int r = this.jdbcTemplate.update(query, student.getId(), student.getName(), student.getCity());
		
		
		return 0;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	
}
