package com.practice;

public class MainClass {
	public static void main(String [] agrs) {
		Answerable phone = () -> {return "Hello";};
		System.out.println(phone.answer());
		
		
	}

}
