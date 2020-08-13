package com.lambda.practice;

public class MainClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//lambda implementation for addition
		HelloWorld addition = (int a, int b) -> {
			System.out.println(a + b);
		};
		
		//lambda implementation for subtraction
		HelloWorld subtraction = (int a, int b) -> {
			System.out.println(a - b);
		};
		
		addition.doSomething(1, 2);
		subtraction.doSomething(2, 1);
	}

}
