package com.practice.one;

public class BankMain {

	public static void main(String[] args) {
		Bank bank = () -> {
			System.out.println("100 withdrawn");
		};
		bank.withDraw();
	}
}
