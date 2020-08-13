package com.java.streams;

import java.util.ArrayList;
import java.util.List;

public class CricketersMain {

	public static void main(String[] args) {
		List<Cricketers> list = new ArrayList<Cricketers>();
		//Cricketer database
		list.add(new Cricketers("sachin", 35, 10000, 250));
		list.add(new Cricketers("sehwag", 32, 8000, 150));
		list.add(new Cricketers("kohli", 30, 7000, 50));
		list.add(new Cricketers("rohit", 31, 6000, 60));
		list.add(new Cricketers("laxman", 36, 5000, 10));
		list.add(new Cricketers("pujara", 32, 3000, 0));
		list.add(new Cricketers("morgan", 28, 2000, 0));
		list.add(new Cricketers("smith", 28, 7000, 50));
		list.add(new Cricketers("dhawan", 33, 6000, 0));
		list.add(new Cricketers("ashwin", 35, 1000, 500));
		
		System.out.println("starting with s and > 7000 runs");
		list
			.stream()
			.filter(x -> x.name.startsWith("s"))
			.filter(x -> x.runs > 7000)
			.forEach(x -> System.out.println("-" + x.name));
	}

}
