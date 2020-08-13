package com.learn.sync;

public class Users {
	//account - 1
	static final BankAccount account = new BankAccount(50);
	
	public static void main(String[] args) {
		account.topUp(100);
		
		//now lets try to make 2 users draw the same amount from same account
		//user - 1
		Thread t1 = new Thread(() -> {
			ATM.withdraw(account, 100);
		});
		
		//user - 2
		Thread t2 = new Thread(() -> {
			ATM.withdraw(account, 100);
		});
		
		t1.start();
		t2.start();
	}

}
