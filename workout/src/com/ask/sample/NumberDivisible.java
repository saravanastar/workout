/**
 * 
 */
package com.ask.sample;

import java.util.Scanner;

/**
 * @author sahar8
 *
 */
public class NumberDivisible {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		int numberOfEntries = userInput.nextInt();
		for (int i = 0; i < numberOfEntries; i++) {
			int divisibleNumber = userInput.nextInt();
			String stringNumber = String.valueOf(divisibleNumber);
			int count = 0;
			for (int j = 0; j < stringNumber.length(); j++) {
				int divide = Integer.parseInt(String.valueOf(stringNumber.charAt(j)));
				if (divide > 0 && divisibleNumber%divide == 0) {
					count++;
				}
			}
			System.out.println(count);
		}
		userInput.close();
	}

}
