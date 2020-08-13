package com.practice;
//thread has 5 stages, 1. New 2. start 3. Run 4. Wait 5. Terminate

public class MultithreadingMainClass {
	public static void main(String[] args) {
		
		//thread-1
		MultiThreadingClass mtc = new MultiThreadingClass();//new stage
		mtc.start(); //start state - >inturn will call run state
		
		//thread-2
		MultiThreadingClass mtc1 = new MultiThreadingClass();//new stage
		mtc1.start(); //start state - >inturn will call run state
		
		
		
	}
}
