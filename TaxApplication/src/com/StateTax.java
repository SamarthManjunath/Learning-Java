//Class to calculate state tax
package com;

public class StateTax {
	//create the variables to be used in the class - instance variables
	double salary, taxRate, deductions;
	
	//create a parameterized constructor which has salary, tax rate and deductions
	public StateTax(double salary, double taxRate, double deductions) {
		this.salary = salary;
		this.taxRate = taxRate;
		this.deductions = deductions;
	}
	
	//method to calculate federal tax
	public double getStateTax() {
		double finalTax = 0.0;
		finalTax = salary * (taxRate / 100) - deductions;
		return finalTax; 
	}

}
