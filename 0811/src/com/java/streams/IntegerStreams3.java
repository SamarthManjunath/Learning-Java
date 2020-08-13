package com.java.streams;

import java.util.stream.IntStream;

public class IntegerStreams3 {
//program to add first 9 numbers using IntStream
	public static void main(String[] args) {
		System.out.println(
				IntStream
						.range(1, 10)
						.sum());
	}

}
