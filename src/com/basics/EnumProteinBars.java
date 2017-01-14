package com.basics;

public class EnumProteinBars {
	enum Flavors {vanilla, peanut, almond, coconut, bbq};
	
	public static void main (String[] args){
		Flavors pro1, pro2;
		
		pro1= Flavors.vanilla;
		pro2= Flavors.coconut;
		
		System.out.println("pro1 flavor: " + pro1);
		System.out.println("pro1 ordinal: " + pro1.ordinal());
		System.out.println("pro1 name: " + pro1.name());
		
		System.out.println();
		System.out.println("pro2 flavor: " + pro2);
		System.out.println("pro2 ordinal: " + pro2.ordinal());
		System.out.println("pro2 name: " + pro2.name());
	}
}
