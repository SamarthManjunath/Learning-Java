//main class to create the user interface for banking application
package com;

import java.util.Scanner;

public class MainBankingClass {
	
	public static void main(String [] args) {
		//database
		int accountNumber = 10002000;
		int password = 10003000;
		double checkingAccountBalance = 10000.0;
		double savingsAccountBalance = 5000.0;
		double preimumAmount = 350.0;
		double loanAmount = 50000.0;
		
		//Creating objects of all the classes / implementations / features of the bank
		CheckingAccount checkingAccount = new CheckingAccount(checkingAccountBalance);
		SavingsAccount savingsAccount = new SavingsAccount(savingsAccountBalance);
		Insurance insurance = new Insurance(preimumAmount);
		Loans loans = new Loans(loanAmount);
		
		
		Scanner scanner = new Scanner(System.in);
		
		//business logic
		while(true) {
			System.out.println("Welcome to banking application");
			//account number authentication
			System.out.println("Please enter your account number");
			int enteredAccountNumber = scanner.nextInt();
			if(enteredAccountNumber != accountNumber) {
				System.out.println("Entered account number is wrong, please try again!");
				continue;
			}
			//password authentication
			System.out.println("Great! Now enter your password. ");
			int enteredPassword = scanner.nextInt();
			if(enteredPassword != password) {
				System.out.println("Account number and password donnot match. Please try again!");
				continue;
			}
			System.out.println("Login successful");
			while(true) { //the user stays logged in - session is maintained even if the user decides to comes back to main menu
				System.out.println("Choose one of the options (Type the number)");
				System.out.println("1. checking account 2. savings account 3. insurance 4. loans 5.exit");
				int option = scanner.nextInt();
				
				//as per options
				if(option == 1) { //checking account
					System.out.println("Welome to checking account");
					System.out.println("What do you want to do here?");
					System.out.println("1. Check balance 2. Deposit 3. Withdraw");
					int checkingOption = scanner.nextInt();
					
					
					if(checkingOption == 1) { //checking account balance
						System.out.println("Checking account balance is : " + checkingAccount.getAccountBalance());
						continue;
					}
					
					
					if(checkingOption == 2) { // deposit amount to checking account
						System.out.println("Enter the amount you want to deposit");
						double depositAmount = scanner.nextDouble();
						checkingAccount.depositMoney(depositAmount);
						continue;
					}
					
					
					if(checkingOption == 3) { // withdraw money from checking account
						System.out.println("Enter the money you want to withdraw");
						double withdrawAmount = scanner.nextDouble();
						checkingAccount.withDrawMoney(withdrawAmount);
						continue;
					}	
				}
				
				
				if(option == 2) {// savings account
					System.out.println("Welome to savings account");
					System.out.println("What do you want to do here?");
					System.out.println("1. Check balance 2. Deposit 3. Withdraw");
					int savingsOption = scanner.nextInt();
					if(savingsOption == 1) { //check balance of savings account
						System.out.println("Savings account balance is : " + savingsAccount.getAccountBalance());
						continue;
					}
					
					
					if(savingsOption == 2) { // deposit money to savings account
						System.out.println("Enter the amount you want to deposit");
						double depositAmount = scanner.nextDouble();
						savingsAccount.depositMoney(depositAmount);
						continue;
					}
					
					
					if(savingsOption == 3) { // withdraw money from savings account
						System.out.println("Enter the money you want to withdraw");
						double withdrawAmount = scanner.nextDouble();
						savingsAccount.withDrawMoney(withdrawAmount);
						continue;
					}
					
				}
				if(option == 3) {//insurance
					System.out.println("Welome to insurance account");
					System.out.println("What do you want to do here?");
					System.out.println("1. Get present premium amount 2. Get premium amount payable");
					int insuranceOption = scanner.nextInt();
					if(insuranceOption == 1) { // to retrieve present insurance premium amount
						System.out.println("Present premium amount is : " + insurance.getPresentPremiumAmount());
						continue;
						
					}
					if(insuranceOption == 2) { // depending on the type of insurance and amount payable calculate new payable premium
						System.out.println("Enter if it is 1234 or not");
						int payableOption = scanner.nextInt();
						System.out.println("Enter payable amount");
						double payableAmount = scanner.nextDouble();
						System.out.println("Payable new premium will be: " + insurance.getPremiumAmountPayable(payableOption, payableAmount));
						continue;
					}
					
				}
				if(option == 4) {//loans
					System.out.println("Welome to loan account");
					System.out.println("What do you want to do here?");
					System.out.println("1. Get total loan amount 2. Calculate loan percentage after paying amount");
					int loanOption = scanner.nextInt();
					if(loanOption == 1) { // total loan amount
						System.out.println("Total loan is : " + loans.getLoanAmount());
						continue;
					}
					if(loanOption == 2) { //calculate loan percentage
						System.out.println("Enter the amount you're ready to pay!");
						double loanPayableAmount = scanner.nextDouble();
						System.out.println("The loan percentage after payment would be :"  + loans.loanPercentageCalculator(loanPayableAmount));
						continue;
						
						
					}
					
				}
				
				if(option == 5) { // logging off
					System.out.println("Logging off! Thanks for using the banking application!");
					break;
				}
				
			}
			
			
		}
	}

}
