//implementation of an interface

package com.practice;

public interface Animal {

	public void animalName(); //abstract methods by default and no need of explicitly declaring them as abstract
	public void animalSound();
	public void animalColor();
	default void doThis() {
		System.out.println("Default method"); // Java 8 feature - supports default methods in interface
	}
	
	
}
