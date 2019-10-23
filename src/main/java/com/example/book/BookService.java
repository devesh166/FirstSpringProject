package com.example.book;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

 

@Service
public class BookService {
	private List<Book> booklist = new ArrayList<Book>(Arrays.asList(
			new Book("java1", "Introduction to java", "Reema Mukherji"),
			new Book("java2", "Corejava", "Harshendra Varma"), 
			new Book("physics", "Concept of Physics", "HC Verma")));

	public List<Book> getAllBooks() {
		return booklist;
	}

	public void addBook(Book book) {
		booklist.add(book);

	}

	public  Book getBook(String id) {
		return booklist.stream().filter(b -> b.getId().equals(id)).findFirst().get();
	}

}
