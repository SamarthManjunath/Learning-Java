package com.java.streams;

import java.util.Arrays;
import java.util.List;
//reduce is used for additions, multiplications or binary operations
public class ReduceOperation {

	public static void main(String[] args) {
		List <Integer> array = Arrays.asList(2, 3, 1, 5, 3);
		int sum = array
			.stream()
			.reduce(0, (a, b) -> a + b);
		
		System.out.println("The sum is : " + sum);
	}
}
