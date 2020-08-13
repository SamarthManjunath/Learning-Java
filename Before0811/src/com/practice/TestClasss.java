package com.practice;

public class TestClasss {
	public static void main(String [] args) {
		FunctionalInterface funInt = (int x) -> System.out.println(2 * x);
		funInt.abstractFunction(10);
		
	}

}
