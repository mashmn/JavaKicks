package com.basics;

public class CracklePop {
	public static void main (String[] args){
		int a;
		for (a=1;a<=100;a++){
			if (a%3==0 && a%5==0){
				System.out.println("CracklePop ");
			}
			else if (a%5==0) {
				System.out.println("Pop ");
			}
			else if (a%3==0) {
				System.out.println("Crackle ");
			}
			else{
				System.out.println(a + " ");
			}
		}
	}
}
