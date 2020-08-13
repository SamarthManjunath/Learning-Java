package com.lambda.practice;

public class SingleLineMain {

	public static void main(String[] args) {
		//lambda expression to add 2 numbers
		SingleLine expression1 = (int number1, int number2) -> {
			return number1 + number2;
		};
		expression1.doSomething(10, 20);
		
		//lambda expression to subtract 2 numbers
		SingleLine expression2 = (int number1, int number2) -> {
			return number1 - number2;
		};
		expression2.doSomething(20, 10);
	}
}
