//streams in java -> functional programming, internal iterator
package com.practice;

public class Book {
	//instance variables of Book class
	private String author;
	private String title;
	
	//toString() method
	@Override
	public String toString() {
		return "Author : " + author + ", title; " + title + "]";
	}
	
	//getters and setters
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	//constructor to intialize the class variables
	public Book(String author, String title) {
		this.title = title;
		this.author = author;
	}
	
	
	
	
}
