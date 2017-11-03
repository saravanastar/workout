/**
 * 
 */
package com.ask.sample;

import java.util.Scanner;

/**
 * @author sahar8
 *
 */
public class StairCaseProblem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stubuserInput
		Scanner userInput = new Scanner(System.in);
		int numberOfColumn = userInput.nextInt();
		int count = 0;
		for (int i = 1; i <= numberOfColumn; i++) {
			count = numberOfColumn-i;
			for (int j = 0; j < count; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("#");
			}
			System.out.println("");
		}
		userInput.close();
	}

}
