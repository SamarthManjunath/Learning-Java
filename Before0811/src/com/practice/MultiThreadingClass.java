package com.practice;

//class to show thread class and thus multithreading
public class MultiThreadingClass extends Thread {
	//run is the method of Thread class and can be overridden
	@Override
	public void run() {
		int i = 1;
		while(i < 100) {
			System.out.println(i + " " + this.getName());
			i++;
		}
	}
}
