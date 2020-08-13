//Checking account of a bank implementation - since it is a bank application, should be secure
package com;

public class CheckingAccount {
	//creating instance variables of checking account
	private double accountBalance;
	
	//constructor of checking account
	public CheckingAccount(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	//getting account balance
	public double getAccountBalance(){
		return accountBalance;		
	}
	
	//method to deposit money
	public void depositMoney(double amount) {
		accountBalance += amount;
		System.out.println("Congrats! Deposit successful. Your account balance now is : " + accountBalance);
		
	}
	
	//method to withdraw money
	public void withDrawMoney(double amount) {
		accountBalance -= amount;
		System.out.println("Withdrawal successful! Please collect cash and your present account balance is : " + accountBalance);
	}
	
	
}
