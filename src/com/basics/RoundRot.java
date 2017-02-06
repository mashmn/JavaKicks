package com.basics;

import java.util.Scanner;

public class RoundRot {

	public static void main (String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first word: ");
		String word1 = scan.nextLine();
		System.out.println("\n Enter second word: ");
		String word2 = scan.nextLine();
		System.out.println("");
		System.out.printf("Words entered are: %s and %s ",word1, word2);
		roundrot(word1,word2);
	}
	
	private static void roundrot(String word1, String word2) {
		// TODO Auto-generated method stub
		
		if (word1.length() == word2.length()){
			String[] word2_arry = new String[word2.length()];
			word2_arry=word2.split("");
			
			StringBuffer replace_w = new StringBuffer();
			for (int i = 0; i < word2.length(); i++) {
				replace_w.append( word2_arry[i] );
				   //result.append( optional separator );
				}
			String mynewword2 = replace_w.toString();
			
			System.out.println(mynewword2);
			
			if (word1==mynewword2){
			System.out.println("Round rotation words detected!");
			}
			else {
				System.out.println("These words aren't Round rotation words!");	
			}
		}
		else {
			System.out.println("The lengths of these 2 words do not match.");
		}
		return;
		
	}

}
