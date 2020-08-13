package com.java.streams;

import java.util.stream.IntStream;
//program to print 1 to 10 using IntStrem
public class IntegerStreams {

	public static void main(String[] args) {
		IntStream
				.range(1, 10)
				.forEach(System.out::println);
		System.out.println();
		
		
}
	
}
