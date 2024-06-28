package com.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.test.dao.BookRepository;

@Component
public class BookService {

	@Autowired
	private BookRepository bookRepository;

	// private static List<Book> list = new ArrayList<Book>();

	// get all book
	public List<Book> getAllBooks() {

		Iterable<Book> findAll = this.bookRepository.findAll();
		return (List<Book>) findAll;

	}

	// get single book
	public Book getBookById(int id) {

		Book book = null;
		try {
			// book = list.stream().filter(e -> e.getId() == id).findFirst().get();
			book = this.bookRepository.findById(id);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			;
		}
		return book;
	}

	// add new book

	public Book addBook(Book b) {
		Book save = this.bookRepository.save(b);

		return save;
	}

	// delete book
	public void deleteBook(int bid) {

		
		this.bookRepository.deleteById(bid);
		//Iterator<Book> iterator = list.iterator();
//		while (iterator.hasNext()) {
//			if (iterator.next().getId() == bid) {
//				iterator.remove();
//			}
//		}

	}

	// update Book
	public void updateBook(Book book, int id) {
		
		book.setId(id);
		this.bookRepository.save(book);

//		Iterator<Book> itr = list.iterator();
//		while (itr.hasNext()) {
//			if (itr.next().getId() == id) {
//				Book bookById = getBookById(id);
//				bookById.setId(book.getId());
//				bookById.setName(book.getName());
//				bookById.setAuthor(book.getAuthor());
//				return bookById.toString();
//
//			}
//
//		}
//		return "ID not found";
//
		
	
	}

}
