package com.java.lambda;

@FunctionalInterface
interface Uber{
	void bookCab();
}

public class Cab {

	public static void main(String[] args) {
		Uber cab = () -> {
			System.out.println("Uber booked");
		};
		cab.bookCab();

	}

}
