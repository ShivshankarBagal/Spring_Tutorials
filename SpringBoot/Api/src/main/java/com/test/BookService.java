package com.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dao.BookRepository;
import com.test.entities.Book;

@Service
public class BookService {

	@Autowired
	private BookRepository bookRepository;

	public List<Book> getAllBooks() {
		// Iterable<Book> findAll = this.bookRepository.findAll();
		// return (List<Book>) findAll;

		// Simplified version:
		return (List<Book>) bookRepository.findAll();
	}

	public Book getBookById(int id) {
		// Book book = null;
		// try {
		// book = this.bookRepository.findById(id);
		// } catch (Exception e) {
		// System.out.println(e.getMessage());
		// }
		// return book;

		// Simplified version:
		Optional<Book> optionalBook = bookRepository.findById(id);
		return optionalBook.orElse(null); // Returns null if book is not found
	}

	public Book addBook(Book book) {
		// Book save = this.bookRepository.save(b);
		// return save;

		// Simplified version:
		return bookRepository.save(book);
	}

	public void deleteBook(int id) {
		// this.bookRepository.deleteById(bid);

		// Iterator<Book> iterator = list.iterator();
		// while (iterator.hasNext()) {
		// if (iterator.next().getId() == bid) {
		// iterator.remove();
		// }
		// }

		// Simplified version:
		bookRepository.deleteById(id);
	}

	public void updateBook(Book book, int id) {
		// book.setId(id);
		// this.bookRepository.save(book);

		// Iterator<Book> itr = list.iterator();
		// while (itr.hasNext()) {
		// if (itr.next().getId() == id) {
		// Book bookById = getBookById(id);
		// bookById.setId(book.getId());
		// bookById.setName(book.getName());
		// bookById.setAuthor(book.getAuthor());
		// return bookById.toString();
		// }
		// }

		// Simplified version:
		book.setId(id); // Ensure the book ID is set for update
		bookRepository.save(book);
	}
}
