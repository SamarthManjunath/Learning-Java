package com.practice;
public class MainClassGreeting implements GreetingMessage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainClassGreeting mcg = new MainClassGreeting();
		mcg.greetingMessage("samarth");
	}
	
	//functional interface's implementation
	public void greetingMessage(String name) {
		// TODO Auto-generated method stub
		System.out.println("Hello " + name);
	}

}
