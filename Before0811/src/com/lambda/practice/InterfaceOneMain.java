package com.lambda.practice;

public class InterfaceOneMain {

	public static void main(String[] args) {
		//one implementation
		InterfaceOne one = () -> System.out.println("Hello World One");
		one.run();
		
		//second implementation
		InterfaceOne two = () -> System.out.println("Hello World Two");
		two.run();
		
	}

}
