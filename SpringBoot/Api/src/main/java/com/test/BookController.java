package com.test;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.test.entities.Book;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

	private final BookService bookService;

	// sample Request Mapping
	@Autowired
	public BookController(BookService bookService) {
		this.bookService = bookService;
	}

	// Get All Books Handler
	@GetMapping("/all")
	public ResponseEntity<List<Book>> getAllBooks() {
		List<Book> allBooks = bookService.getAllBooks();
		return allBooks.isEmpty() ? ResponseEntity.notFound().build() : ResponseEntity.ok(allBooks);
	}

	// Get Single Book Handler
	@GetMapping("/{id}")
	public ResponseEntity<Book> getBookById(@PathVariable int id) {
		Book bookById = bookService.getBookById(id);
		return bookById != null ? ResponseEntity.ok(bookById) : ResponseEntity.notFound().build();
	}

	// Add Book Handler
	@PostMapping("/add")
	public ResponseEntity<Book> addBook(@RequestBody Book book) {
		try {
			Book addedBook = bookService.addBook(book);
			return ResponseEntity.ok(addedBook);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}

	// Delete Book Handler
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Void> deleteBook(@PathVariable int id) {
		try {
			bookService.deleteBook(id);
			return ResponseEntity.ok().build();
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}

	// update Book handler
	@PutMapping("/update/{id}")
	public ResponseEntity<Book> updateBook(@RequestBody Book book, @PathVariable int id) {
		try {
			bookService.updateBook(book, id);
			return ResponseEntity.ok(book);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
}
