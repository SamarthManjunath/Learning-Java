package com.java.streams;
import java.util.ArrayList;

public class Library {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			ArrayList<Book> books = populateLibrary();
			books
				.stream()
				.filter(x -> x.author.startsWith("s"))
				.forEach(x -> System.out.println(x.author));
			 
		}
		
		//method to populate the books
		public static ArrayList<Book> populateLibrary(){
			ArrayList<Book> book = new ArrayList();
			book.add(new Book("samarth", "book-1"));
			book.add(new Book("sandeep", "book-2"));
			book.add(new Book("patil", "book-3"));
			book.add(new Book("dheeraj", "book-4"));
			book.add(new Book("akshu", "book-5"));
			book.add(new Book("monica", "book-6"));
			book.add(new Book("gahan", "book-7"));
			book.add(new Book("shaurya", "book-8"));
			return book;
		}

	}


