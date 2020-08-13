package com.practice.one;

public class InterfaceThreeMain {

	public static void main(String[] args) {
		InterfaceThree it3 = (number1, number2) -> {
			System.out.println("Sum is" + number1 + number2);
		};
		it3.doThis(3, 5);
	}

}
