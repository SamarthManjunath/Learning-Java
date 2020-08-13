package com.learn.sync;
//to show deadlock
//avoid using nested synchronized blocks to that it does not result in deadlock
public class Kitchen {
	//create 2 objects, spoon and bowl
	public static Object spoon = new Object();
	public static Object bowl = new Object();

	public static void main(String[] args) {
		//cook one
		Thread cook1 = new Thread(() -> {
			synchronized(spoon) {
				System.out.println("Cook 1 : Holding spoon");
				System.out.println("Cook 2 : Waiting for bowl");
				
				synchronized(bowl) {
					System.out.println("Holding both spoon and bowl");
				}
			}
		});
		
		//cook two
		Thread cook2 = new Thread(() -> {
			synchronized(spoon) {
				System.out.println("Cook 1 : Holding spoon");
				System.out.println("Cook 2 : Waiting for bowl");
				
				synchronized(bowl) {
					System.out.println("Holding both spoon and bowl");
				}
			}
			
		});
		
		//starting the threads
		cook1.start();
		cook2.start();
	}

}
