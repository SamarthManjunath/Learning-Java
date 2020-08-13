//functional interface : an interface which has only one abstract method

package com.practice;

import java.lang.FunctionalInterface;


@FunctionalInterface
public interface GreetingMessage {

	public void greetingMessage(String name);

}
