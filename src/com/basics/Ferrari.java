package com.basics;

/**
 * Ferrari "is a" car.
 * @author Mahesh
 * @version 01/13/2017
 */

public class Ferrari extends Car{
	//extends  - inherits from Car class
	private int myCost;
	
	public Ferrari() {
		myCost = 300000; //300k
	}
	
	public int getMyCost(){
		return myCost; // returning cost
	}
	
}
