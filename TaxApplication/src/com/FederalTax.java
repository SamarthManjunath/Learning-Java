//Class to calculate federal tax
package com;

public class FederalTax {
	//create the variables to be used in the class - instance variables
	double salary, taxRate, deductions;
	
	//create a parameterized constructor which has salary, tax rate and deductions
	public FederalTax(double salary, double taxRate, double deductions) {
		this.salary = salary;
		this.taxRate = taxRate;
		this.deductions = deductions;
	}
	
	//method to calculate federal tax
	public double getFederalTax() {
		double finalTax = 0.0;
		finalTax = salary * (taxRate / 100) - deductions;
		return finalTax; 
	}

}
