//loan implementation for banking application
package com;

public class Loans {
	//instance variables for loan class
	private double loanAmount;
	
	//constructor of loan class
	public Loans(double loanAmount) {
		this.loanAmount = loanAmount;
	}
	
	//method to get the total loan amount
	public double getLoanAmount() {
		return loanAmount;
	}
	
	//method to get the percentage of loan left 
	public double loanPercentageCalculator(double amount) {
		return (loanAmount - amount) / loanAmount * 100;
		
	}

}
