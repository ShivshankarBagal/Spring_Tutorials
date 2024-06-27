package com.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
	//get all books handler
	@GetMapping("/allBooks")
	public List<Book> book() {

		
		return this.bookService.getAllBooks();
		
	}
	//get single book handler
	@GetMapping("/book/{id}")
	public Book getBookById(@PathVariable("id") int id) {
		
		return this.bookService.getBookById(id);
	}
	
	//for adding book handler
	@PostMapping("/addBook")
	public Book addBook(@RequestBody Book book) {

		Book b= this.bookService.addBook(book);
		System.out.println("Book Added "+b);
		return b;
	}
	
	//delete book handler
	@DeleteMapping("/deleteBook/{id}")
	public void deleteBook(@PathVariable("id")int id) {
		 System.out.println("deleted successfully "+this.bookService.getBookById(id));
		 this.bookService.deleteBook(id);
		 
		
	}
}
