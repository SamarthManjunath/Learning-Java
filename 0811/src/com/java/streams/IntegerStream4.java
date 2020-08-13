package com.java.streams;

import java.util.stream.Stream;
//usage of stream.of() where we can convert an array to a stream 
public class IntegerStream4 {

	public static void main(String[] args) {
		Stream.of("samu", "akshu", "gahan", "pavan")
				.sorted()
				.findFirst()
				.ifPresent(System.out::print);
	}

}
