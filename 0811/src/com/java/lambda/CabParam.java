package com.java.lambda;

interface UberX{
	void bookCab(String source, String destination);
}

public class CabParam {

	public static void main(String[] args) {
		UberX uberx = (String source, String destination) -> {
			System.out.println("UberX booked from " + source + " to " + destination);
		};
		uberx.bookCab("Dallas", "Irving");

	}

}
