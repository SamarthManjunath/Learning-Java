//method references in functional programming
package com.practice;

public class Square {
	int length;
	//constructor to initialize the square parameters
	public Square(int length) {
		this.length = length;
	}
	
	//method to calculate area
	public int calculateArea() {
		return length  * length;
	}
}
