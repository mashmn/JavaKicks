package com.Cognitive.Extra;

import java.util.Scanner;

public class Calculator {
	
	public static void main (String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Tye an expression: ");
		
		String in = input.nextLine();
		
		System.out.println("Typed expression: " + in);
		
		String out = input.findInLine("(");
		
		System.out.println("This character " + out + " was  found in your expression");
		
	}
}