package com.java.streams;

import java.util.Arrays;
import java.util.List;
//to filter elements from list using streams
public class ListStream {

	public static void main(String[] args) {
		List<String> people = Arrays.asList("samarth", "akshu", "pavan", "gahan", "amma", "appa", "gahan", "swetha", "sudha");
		people
			.stream()
			.map(String :: toLowerCase)
			.filter(x -> x.startsWith("s"))
			.forEach(System.out::println);
	}
}
