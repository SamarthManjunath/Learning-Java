//insurance implementation of a bank. Just to give a simple calculation and premiums
package com;

public class Insurance {
	//instance variable declaration for insurance implementation
	private double premiumAmount;
	
	//constructor of insurance class
	public Insurance(double premiumAmount) {
		this.premiumAmount = premiumAmount;
	}
	
	//to get the premium amount payable
	public double getPremiumAmountPayable(int option, double payable) {
		if(option == 1234)
			return payable * 1.5;
		else
			return payable * 2.5;
	}
	
	//get premium amount
	public double getPresentPremiumAmount() {
		return premiumAmount;
		
	}

}
