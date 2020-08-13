package com.practice;

public class RunnableInterfaceMain {

	public static void main(String[] args) {
		Thread thread = new Thread (()-> {
			int i = 1;
			while(i < 100) {
				System.out.println(i + " " + Thread.currentThread().getName());
				i++;
			}
		});
		thread.start();
	}

}
