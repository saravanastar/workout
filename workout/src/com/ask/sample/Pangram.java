/**
 * 
 */
package com.ask.sample;

import java.util.Scanner;

/**
 * @author sahar8
 *
 */
public class Pangram {

	/**
	 * @param args
	 */
	private static final int NO_OF_LETTERS_OF_ALPHABET = 26;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		String sentence = userInput.nextLine();
		System.out.println(isPangram(sentence)?"pangram":"not pangram");

	}
	
	 private static boolean isPangram(String sentence) {
		 
	        if (sentence.length() < NO_OF_LETTERS_OF_ALPHABET) {
	            return false;
	        }
	 
	        for (char ch = 'A'; ch <= 'Z'; ch++) {
	            if (sentence.indexOf(ch) < 0
	                    && sentence.indexOf((char) (ch + 32)) < 0) {
	                return false;
	            }
	        }
	 
	        return true;
	    }

}
