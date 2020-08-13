package com.practice;

public class LambdaExpressionMainClass implements LambdaExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LambdaExpression le = (String name) ->{
			System.out.println("Hello" + name);
		};
		le.randomMethod("samarth");
		
		
		

	}

	@Override
	public void randomMethod(String name) {
		// TODO Auto-generated method stub
		
	}

}
