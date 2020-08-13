package com.java.streams;

import java.util.Arrays;
//to filter and sort an array using streams
public class ArrayStream {

	public static void main(String[] args) {
		String [] names = {"samarth", "dheeraj", "sudha", "gahan", "akshu", "monica", "swetha", "shaurya", "sam"};
		Arrays.stream(names)
				.filter(x -> x.startsWith("s"))
				.sorted()
				.forEach(System.out::println);		
	}

}
