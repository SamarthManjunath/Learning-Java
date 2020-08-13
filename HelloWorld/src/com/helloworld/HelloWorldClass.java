//Understanding modules, to make JDK lightweight, few modules have to be imported in modules-info.java file
package com.helloworld;

//not part of the JDK, had to import using java.desktop
import java.awt.image.BufferedImage;

public class HelloWorldClass {
	BufferedImage image;
	public static void main(String[] args) {
		System.out.println("Hello world");
	}
	
	public static void doSomethingElse() {
		System.out.println("Hello how are you");
	}
}
