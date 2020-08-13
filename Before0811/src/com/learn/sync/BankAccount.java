package com.learn.sync;

public class BankAccount {
	private int balance = 0;
	private final int overdraft;
	
	//is set during the time of construction of bank account class
	public BankAccount (int overdraft) {
		this.overdraft = overdraft;
	}
	
	//to add amount to balance
	public void topUp(int amount) {
		balance += amount;
	}
	
	//to debit amount from the balance
	public void debit(int amount) {
		balance -= amount;
	}
	
	//getter method for balance
	public int getBalance() {
		return balance;
	}
	
	//getter method for overdraft
	public int getOverdraft() {
		return overdraft;
	}

}
