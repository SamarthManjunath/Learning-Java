package com.lambda.practice;

public class BankMainClass {
	public static void main(String[] args) {
		//method implementation of getAccountNumber() of bank1
		Bank bank1 = (int accountNumber) -> {
			System.out.println(accountNumber);
		};
		bank1.getAccountNumber(123456);
		
		//method implementation of getAccountNumber() of bank2
		Bank bank2 = (int accountNumber) -> {
			System.out.println(accountNumber);
		};
		bank2.getAccountNumber(234567);
	}

}
