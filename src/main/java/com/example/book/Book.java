package com.example.book;

public class Book {
	private String id;
	private String tittle;
	private String author;
	
	public Book() {
		
	}
	
	
	
	public Book(String id, String tittle, String author) {

		this.id = id;
		this.tittle = tittle;
		this.author = author;
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTittle() {
		return tittle;
	}
	public void setTittle(String tittle) {
		this.tittle = tittle;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	
}
