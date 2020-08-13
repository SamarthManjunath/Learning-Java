package com.java.streams;

import java.util.ArrayList;
import java.util.List;

//without streams
public class ProductsMain {

	public static void main(String[] args) {
		List<Products> list = new ArrayList<Products>();
		list.add(new Products(1, "samarth", 100.00));
		list.add(new Products(2, "akshu", 200.00));
		list.add(new Products(3, "gahan", 300.00));
		list.add(new Products(4, "pavan", 400.00));
		
		List<Double> productList = new ArrayList<Double>();
		for(Products products : list) {
			if(products.price < 200) {
				productList.add(products.price);
			}
		}
		System.out.println(productList);
	}

}
