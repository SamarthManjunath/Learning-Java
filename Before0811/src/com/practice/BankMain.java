package com.practice;

public class BankMain {
	public static void main(String[] args) {
		Bank bank = (String name) -> {
			System.out.println(name + " opened a new account");
		};
		bank.accountInfo("Patil");
	}

}
