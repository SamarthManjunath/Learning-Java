package com.java.streams;

public class Book {
	String author;
	public String getAuthor() {
		return author;
	}

	public String getBookName() {
		return bookName;
	}

	String bookName;
	
	public Book(String author, String bookName) {
		this.author = author;
		this.bookName = bookName;
	}

}
