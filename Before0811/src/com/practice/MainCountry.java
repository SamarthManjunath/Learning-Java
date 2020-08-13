package com.practice;
// wildcards

import java.util.ArrayList;
import java.util.List;

public class MainCountry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Earth earth = new Earth();
		Country country = new Country();
		Citi citi = new Citi();
		
		build(earth);
		build(country);
		build(citi); // subtypes, build takes Earth parameters but since country and citi extends Earth,it works 
		 //we know list doesnt support subtypes or substitutions
		//it can be solved by wildcards
		
		List <Earth> earths = new ArrayList();
		earths.add(new Earth());
		earths.add(new Country());
		earths.add(new Citi());
		
		List <Country> countries = new ArrayList();
		countries.add(new Country());
		countries.add(new Country());
		countries.add(new Country());
		
		wildPrintStuffs(countries); //using wildcards we can use subtypes and substitution concept in java
		
		
		List <Citi> cities = new ArrayList();
		cities.add(new Citi());
		cities.add(new Citi());
		cities.add(new Citi());
		
		wildPrintStuffs(cities); //using wildcards we can use subtypes and substitution concept in java
		
		wildPrintCities(earths); // though the method takes citi type parameters, we can pass earth type parameters because of wildcards
		
		
	}
	
	public static void build(Earth earth) {
		System.out.println(earth.toString());
	}
	
	public static void printStuffs(List <Earth> earth) { //not using wildcard
		for(int i = 0; i < earth.size(); i++) {
			System.out.println(i + 1 + ": " + earth.toString());
		}
	}
	
	public static void wildPrintStuffs(List<? extends Earth> earth) { //using wildcard
		for(int i = 0; i < earth.size(); i++) {
			System.out.println(i + 1 + ": " + earth.toString());
		}
	}
	
	public static void wildPrintCities(List <? super Citi> citi) { //since i've made it super, we can pass building parameter to this method
		for(int i = 0; i < citi.size(); i++) {
			System.out.println(i + 1 + ":" + citi.toString());
		}
	}
}
