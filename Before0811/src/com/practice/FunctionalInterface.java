package com.practice;

public interface FunctionalInterface {
	
	void abstractFunction(int x);
	
	default void helloFunction() {
		System.out.println("Hello");
	}

}
