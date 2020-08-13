package com.practice;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListClass {
	public static void main(String [] args) {
		ArrayList<Student> list = new ArrayList<>(); //creating an array list of type Student class
		
		Student s1 = new Student(1, "Samarth", 213317);
		Student s2 = new Student(2, "Akshu", 12345);
		Student s3 = new Student(3, "Gahan", 43434);
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		
		Iterator itr = list.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		

	}

}
