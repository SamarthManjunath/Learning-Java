package com.practice.one;

public class InterfaceTwoClass {

	public static void main(String[] args) {
		InterfaceTwo it = (name, address) -> {
			System.out.println("Hello " + name + " and your address is " + address);
		};
		it.doSomething("samarth", "5750 E University Blvd Dallas TX");
	}

}
