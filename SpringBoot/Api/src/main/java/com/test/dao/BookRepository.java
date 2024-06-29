package com.test.dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.test.entities.Book;

public interface BookRepository extends CrudRepository<Book, Integer>{

	
	public Optional<Book> findById(int id);
}
