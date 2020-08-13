package com.practice;

public class MainClassPrinter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MessagePrinter mp = (int number1, int number2, int number3) -> {
			System.out.println(number1 + number2 + number3);
		};
		mp.printMessage(1, 2, 3);
	
	}

}
