//functional programming -> using lambdas
package com.practice;

import java.lang.FunctionalInterface;

@FunctionalInterface
public interface MessagePrinter {
	public abstract void printMessage(int number1, int number2, int number3);

}
