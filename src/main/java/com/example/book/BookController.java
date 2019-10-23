package com.example.book;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
	@Autowired
	public BookService books;
    
	@RequestMapping("/")
	public String welcome() {
		return "Welcome";
	}
	
	@RequestMapping("/books")
	public List<Book> getAllBooks() {
		return books.getAllBooks();
	}

	@RequestMapping("/books/{id}")
	public Book getBook(@PathVariable String id) {
		return books.getBook(id);
	}
	
	@RequestMapping(method = RequestMethod.POST,value="/books")
	public void addBook(@RequestBody Book book) {
		 books.addBook(book);
	}
}
