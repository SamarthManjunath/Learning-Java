package com.practice;

import java.util.LinkedList;

public class Store {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//in java we can use queues using linkedlist - here we create customer type queue
		LinkedList<Customer> queue = new LinkedList();
		//adding customers to queue - order in which customer enters is maintained
		queue.add(new Customer("samarth"));//adding customer type elements to queue
		queue.add(new Customer("akshu"));
		queue.add(new Customer("gahan"));
		queue.add(new Customer("pavan"));
		System.out.println("Intial queue : " + queue);
		serveCustomer(queue);
		System.out.println("After queue : " + queue);

	}
	
	public static void serveCustomer(LinkedList<Customer> queue) {
		Customer c = queue.poll(); //will retrieve first element and remove from the queue
		c.serve();
	}

}
