package com.test;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

	@Autowired
	private BookService bookService;

	@RequestMapping(value = "/book", method = RequestMethod.GET)

	public String getBook() {
		System.out.println("book mehod");
		return "This is Book()";
	}

	// get all books handler
	@GetMapping("/allBooks")
	public ResponseEntity<List<Book>> book() {

		List<Book> allBooks = this.bookService.getAllBooks();
		if (allBooks.size() <= 0) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.status(HttpStatus.CREATED).body(allBooks);
	}

	// get single book handler
	@GetMapping("/book/{id}")
	public ResponseEntity<Book> getBookById(@PathVariable("id") int id) {

		Book bookById = this.bookService.getBookById(id);

		if (bookById == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(bookById));

	}

	// for adding book handler
	@PostMapping("/addBook")
	public ResponseEntity<Book> addBook(@RequestBody Book book) {
		Book b = null;
		try {
			b = this.bookService.addBook(book);
			System.out.println("Book Added " + b);
			return ResponseEntity.of(Optional.of(b));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
	}

	// delete book handler
	@DeleteMapping("/deleteBook/{id}")
	public ResponseEntity<Void> deleteBook(@PathVariable("id") int id) {
		try {
			this.bookService.deleteBook(id);
			return ResponseEntity.ok().build();
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}

	}

	// update book handler
	@PutMapping("/updateBook/{id}")
	public ResponseEntity<Book> updateBook(@RequestBody Book book, @PathVariable("id") int id) {
		try {
			this.bookService.updateBook(book, id);
			return ResponseEntity.ok().body(book);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();

		}

	}

}
