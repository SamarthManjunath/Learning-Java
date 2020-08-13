//Class to see the calculate federal and state tax and finally to conclude which is better
package com;

public class MainClassTax {

	public static void main(String[] args) {
		//calculating federal tax
		FederalTax federalTax = new FederalTax(70000.0, 5.0, 1000.0);
		double finalFederalTax = federalTax.getFederalTax();
		
		//calculating state tax
		StateTax stateTax = new StateTax(70000.0, 3.0, 2000.0);
		double finalStateTax = stateTax.getStateTax();
		
		//to suggest user which is better
		if(finalFederalTax > finalStateTax)
			System.out.println("State tax is better");
		else
			System.out.println("Federal tax is better");
	}

}
