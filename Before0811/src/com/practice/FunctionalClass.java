package com.practice;

public class FunctionalClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunctionalInterfaceOne fi = (name) -> {
			System.out.println("Hello functional interface");
		};
		
		fi.doSomething("samarth");

	}

}
