//usage of parallel streams -> it is quicker and should be used if we have large dataset
package com.practice;

import java.util.ArrayList;

public class CricketMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Cricketers> crickets= fillCricketingDatabase();
		//parallelStream is powerful and fast and should be used if the machine used has more cores
		crickets.parallelStream().filter(name ->{
			return name.getName().startsWith("s");
		}).forEach(System.out::println);

	}
	
	public static ArrayList<Cricketers> fillCricketingDatabase(){
		ArrayList<Cricketers> cricket = new ArrayList();
		cricket.add(new Cricketers("sehwag", 32));
		cricket.add(new Cricketers("sachin", 35));
		cricket.add(new Cricketers("kumble", 40));
		cricket.add(new Cricketers("kohli", 28));
		cricket.add(new Cricketers("rohit", 29));
		cricket.add(new Cricketers("yuvraj", 35));
		cricket.add(new Cricketers("dhoni", 35));
		return cricket;
	}
}
