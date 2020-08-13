package com.lambda.practice;

public class ConsumerMainClass {
	public static void main(String[] args) {
		//lambda expression
		Consumer consumer = (int input) -> {
			//method implementation of test in consumer functional interface
			if(input >= 10)
				System.out.println("Greater than 10");
			else
				System.out.println("Lesser than 10");
		};
		//testcase - 1
		consumer.test(9); //less than 10
		
		//testcase - 2
		consumer.test(30);//greater than 10
	}

}
