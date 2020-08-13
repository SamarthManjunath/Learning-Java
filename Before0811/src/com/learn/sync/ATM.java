package com.learn.sync;
//synchronization helps in restricting the access to threads 
//a simple ATM class to withdraw money
public class ATM {
	static synchronized void withdraw(BankAccount account, int amount) {
		int balance = account.getBalance();
		if((balance - amount) < - account.getOverdraft()) {
			System.out.println("Transaction denied");
		}else {
			account.debit(amount);
			System.out.println("$" + amount + "withdrawn");
		}
		System.out.println("The current balance is" + account.getBalance());
	}

}
