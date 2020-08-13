package com.practice;

public class RunnableInterface implements Runnable {

	@Override // run method
	public void run() {
		int i = 1;
		while(i < 100) {
			System.out.println(i + " " + Thread.currentThread().getName());
			i++;
		}
		
	}
}
