package com.test.dao;

import org.springframework.data.repository.CrudRepository;

import com.test.Book;

public interface BookRepository extends CrudRepository<Book, Integer>{

	
	public Book findById(int id);
}
