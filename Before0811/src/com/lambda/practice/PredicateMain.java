package com.lambda.practice;

public class PredicateMain {

	public static void main(String[] args) {
		//lambda expression  -write once use anytime
		Predicate predicate = (int input) -> {
			//method implementation for test method of predicate interface
			if(input >= 20)
				return true;
			else
				return false;
		};
		//testcase - 1
		boolean answerOne = predicate.test(20);
		System.out.println(answerOne); //true
		
		//testcase - 2
		boolean answerTwo = predicate.test(10);
		System.out.println(answerTwo); //false
	}

}
