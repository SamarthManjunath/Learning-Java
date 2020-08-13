package com.lambda.practice;

public class FunctionMainClass {

	public static void main(String[] args) {
		//lambda expression
		Function function = (int input) -> {
			//method implementation of Function functional interface
			if(input >= 10)
				return 10 + input;
			else
				return 10 - input;
		};
		
		//testcase - 1
		int resultOne = function.test(10);
		System.out.println(resultOne); //20
		
		//testcase - 2
		int resultTwo = function.test(9);
		System.out.println(resultTwo); //1
	}

}
