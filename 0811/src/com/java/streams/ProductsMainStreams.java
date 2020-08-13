package com.java.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
//to get the elements from 
public class ProductsMainStreams {

	public static void main(String[] args) {
		List<Products> list = new ArrayList<Products>();
		list.add(new Products(1, "samarth", 100.00));
		list.add(new Products(2, "akshu", 200.00));
		list.add(new Products(3, "gahan", 300.00));
		list.add(new Products(4, "pavan", 400.00));
		//stream - has a source out of which data flows out
		//has zero or more intermediate operations,
		//here we filter data and map it 
		//has a termination operation where we collect() and convert to list
		List<Double> productsList = list.stream()
									.filter(p -> p.price < 200)
									.map(p -> p.price)
									.collect(Collectors.toList());
		System.out.println(productsList);
		
		
	}

}
