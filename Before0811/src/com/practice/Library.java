//streams are used to filter the contents based on specific fixed conditon 

package com.practice;

import java.util.ArrayList;

public class Library {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Book> books = populateLibrary();
		books.stream().filter(book ->{
			return book.getAuthor().startsWith("p");
		}).forEach(System.out::println);
		 
	}
	
	//method to populate the books
	public static ArrayList<Book> populateLibrary(){
		ArrayList<Book> book = new ArrayList();
		book.add(new Book("samarth", "book-1"));
		book.add(new Book("sandeep", "book-2"));
		book.add(new Book("patil", "book-3"));
		book.add(new Book("dheeraj", "book-4"));
		return book;
	}

}
