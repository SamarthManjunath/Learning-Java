package com.practice;

public class PredicateMainClass {
	public static void main(String [] args) {
		Predicate isOdd = n -> n % 2 != 0 ;
		Predicate isEven = n -> n % 2 == 0;
		System.out.println(isOdd.test(3));
		System.out.println(isEven.test(4));
		
		
	}
 
}
