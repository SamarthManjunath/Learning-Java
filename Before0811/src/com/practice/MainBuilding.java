//example for sub type and substitution principle in java

package com.practice;

import java.util.ArrayList;
import java.util.List;

public class MainBuilding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Building building = new Building();
		Office office = new Office();
		build(building);
		build(office); //since office is a sub type of building, we can pass office and it works
		
		List<Building> buildings = new ArrayList();
		buildings.add(new Building());
		buildings.add(new Office()); //sub types works for list of the parent class
		printBuildings(buildings);
		
		//subtypes are not allowed in lists
		List<Office> offices = new ArrayList();
		offices.add(new Office());
		offices.add(new Office());
		//printBuildings(offices);  cannot be done because subtypes are not allowed in lists
		
	}
	
	public static void build(Building build) {
		System.out.println("Constructing a new : " + build.toString());	
	}
	
	public static void printBuildings(List <Building> buildings) {
		for(int i = 0; i < buildings.size(); i++) {
			System.out.println(i + 1 + ": " + buildings.get(i).toString());
		}
		
		
	}

}
