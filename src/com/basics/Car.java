package com.basics;
/*
 * This represents a car.
 */

/**
 * This object represents a car
 * 
 * @author Mahesh
 * @version 01/13/2017
 */

public class Car {
	// all upper case? Its static final variable.
	private static final int SPEED=1; 
	//lowercase probably not static.
	//private final int mybreakSpeed;
	//final data cannot be changed.
	private int myBreakSpeed;
	//single line comment
	
	/**
	 * This is a 'constructor' it sets values.
	 */
	public Car() {
		//non static variables get set in the constructor.
		myBreakSpeed = 1;//this is now the default.
	}
	
	//getter and setter methods to interact with other classes.
	// void here means no return 
	public void setBreakSpeed(int theSpeed) {
		//setters set the values of instance variables (non static).
		myBreakSpeed = theSpeed; // generally parameters start "the"
		//generally instance variables start with "my"
	}
	
	
	public int getBreakSpeed(){
		return myBreakSpeed;
	}
}
