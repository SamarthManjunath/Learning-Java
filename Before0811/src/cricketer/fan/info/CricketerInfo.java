package cricketer.fan.info;

import cricketer.info.nonsensitive.NonSensitiveInfo;

//fan UI to get cricketer info
public class CricketerInfo {
	
	
	public static void main(String[] args) {
		NonSensitiveInfo nsi = new NonSensitiveInfo();
		int runs = nsi.getRuns();
		int age = nsi.getAge();
		int boundaries = nsi.getBoundaries();
		int sixers = nsi.getSixers();
		System.out.println("Runs is : " + runs);
		System.out.println("Age is :" + age);
		System.out.println("Boundaries is : " + boundaries);
		System.out.println("Sixers is : " + sixers);
		
	}

}
