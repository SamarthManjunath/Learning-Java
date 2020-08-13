//with method reference
package com.practice;

public class MainSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square s = new Square(4);
		
		Shapes shape = Square :: calculateArea;
		
		System.out.println("Area is: " + shape.getArea(s));

	}

}
