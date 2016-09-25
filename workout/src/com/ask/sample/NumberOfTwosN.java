/**
 * 
 */
package com.ask.sample;

import java.util.Scanner;

/**
 * @author sahar8
 *
 */
public class NumberOfTwosN {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		int output = 0;
		int fuck = userInput.nextInt();
		for (int i = 1; i <= fuck; i++) {
			String numberString = String.valueOf(i);
			for (int j = 0; j < numberString.length(); j++) {
				String numer = String.valueOf(numberString.charAt(j));
				if (numer.equalsIgnoreCase("2")) {
					output++;
				}
			}
		}
		System.out.println(output);
		userInput.close();

	}

}
