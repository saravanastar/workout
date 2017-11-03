/**
 * 
 */
package com.ask.sample;

import java.util.Scanner;

/**
 * @author sahar8
 *
 */
public class SherlockSquares {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		int rowCount = userInput.nextInt();
		int count = 0;
		for (int i = 0; i < rowCount; i++) {
			int numberFrom = userInput.nextInt();
			int numberTo = userInput.nextInt();
			for (int j = numberFrom; j <= numberTo; j++) {
				int numberToCheck = (int) Math.ceil(Math.sqrt(j));
				if (numberToCheck * numberToCheck == j) {
					count++;
				}
			}
			System.out.println(count);
			count = 0;
			
		}
		userInput.close();
	}

}
