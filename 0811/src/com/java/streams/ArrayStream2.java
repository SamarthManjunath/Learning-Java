package com.java.streams;

import java.util.Arrays;
//program to get average of squares of a given array using streams
public class ArrayStream2 {

	public static void main(String[] args) {
		Arrays.stream(new int [] {4, 5, 2, 4, 1}) //stream of data
				.map(x -> x * x) //intermediate operation
				.average()// intermediate operation
				.ifPresent(System.out::println); // termination operation
	}

}
