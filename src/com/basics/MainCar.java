package com.basics;

public class MainCar {
	public static void main(String[] theArgs){
		// the MAIN method is the first method loaded when a 
		// java program is started.
		System.out.println("Hello, World!");
		//
		System.out.println();
				//instance of the Car object
		Car testCar = new Car(); // composition relationship
		// we have a Car object.
		//ask for car's speed.
		System.out.println(testCar.getBreakSpeed());
		testCar.setBreakSpeed(23);
		System.out.println(testCar.getBreakSpeed() + "<- The new break speed");
		
		Ferrari testFerrari = new Ferrari();
		System.out.println(testFerrari.getMyCost());
		
		// notice this error? MainCar's main method is static.
		
		if (testFerrari.getMyCost() > 40000) {
			System.out.println("A lot of money");
		}
	}
}
