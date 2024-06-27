package com.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
public class BookService {

	private static List<Book> list = new ArrayList<Book>();
	static {
		list.add(new Book(11, "learn C", "Harry"));
		list.add(new Book(21, "Pyhon", "Bhuvan"));
		list.add(new Book(31, "Dot net", "Raman"));
		list.add(new Book(41, "JAVA", "NANA"));

	}

	// get all book
	public List<Book> getAllBooks() {

		return list;
	}

	// get single book
	public Book getBookById(int id) {

		Book book;
		book = list.stream().filter(e -> e.getId() == id).findFirst().get();
		return book;
	}

	// add new book

	public Book addBook(Book b) {
		list.add(b);
		return b;
	}

	// delete book
	public void deleteBook(int bid) {
		
		  Iterator<Book> iterator = list.iterator();
		    while (iterator.hasNext()) {
		        if (iterator.next().getId() == bid) {
		            iterator.remove();
		        }
		    }

//		list = list.stream().filter(book -> {
//			if (book.getId() != bid) {
//				return true;
//			} else {
//				return false;
//			}
//		}).collect(Collectors.toList());

	}

//	public boolean deleteBookById(int id) {
//        Optional<Book> book = bookRepository.findById(id);
//        if (book.isPresent()) {
//            bookRepository.delete(book.get());
//            return true;
//        } else {
//            return false;
//        }
//    }
}
