package com.practice;
//learning queue data structure - real time
public class Customer {
	//instance variables of customer
	private boolean hasBeenServed;
	private String name;
	
	//creating the constructor to initialize the customer variables
	public Customer(String name) {
		this.name = name;
		hasBeenServed = false;
	}
	
	//when the customer is served
	public void serve() {
		hasBeenServed = true;
		System.out.println(name + " has been served");
	}
	
	//overriding the toString() method to return the name of the customer
	public String toString() {
		return name;
	}
	
	
}
