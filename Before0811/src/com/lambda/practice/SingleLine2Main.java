package com.lambda.practice;

public class SingleLine2Main {

	public static void main(String[] args) {
		SingleLine2 abc = (s) -> s + "!";
		System.out.println(abc.toString());
		abc.run("samarth");
		
	}

}
