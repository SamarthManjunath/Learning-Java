package com.practice.one;

public class InterfaceOneMain {
		
	public static void main(String[] args) {
		InterfaceOne iom = (name) -> {
			System.out.println("Hello " + name);
		};
		iom.doThis("samarth");
	}

}
