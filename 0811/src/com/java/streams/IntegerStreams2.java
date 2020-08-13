package com.java.streams;

import java.util.stream.IntStream;
//program to skip first 5 integers using streams
public class IntegerStreams2 {

	public static void main(String[] args) {
		IntStream
				.range(1, 10)
				.skip(5)
				.forEach(x -> System.out.println(x));
		System.out.println();
	}

}
