package com.practice;

public interface Human {
	void humanSound();
	static void helloWorld() {
		System.out.println("Hello, static method!"); // static method support in interface - java 8
	}

}
