//class to implement the interface
package com.practice;

public class Dog implements Animal, Human { // multiple inheritance
	public void animalName() {  // method implementation of animal interface
		System.out.println("Dog");
	}
	
	public void animalSound() {  // method implementation of animal interface
		System.out.println("Barks");
	}
	
	public void animalColor() { // method implementation of animal interface
		System.out.println("Black");
	} 
	
	public void humanSound() { // method implementation of human interface
		System.out.println("Human sound from human interface");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal = new Dog();
		Human human = new Dog();
		animal.animalName();
		animal.animalSound();
		animal.animalColor();
		human.humanSound();
		animal.doThis(); // calling default method in Animal interface - Java 8 feature
		Human.helloWorld(); // calling static method in Human interface - Java 8 feature
	}

}
