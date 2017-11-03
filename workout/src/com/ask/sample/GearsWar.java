/**
 * 
 */
package com.ask.sample;

import java.util.Scanner;

/**
 * @author sahar8
 *
 */
public class GearsWar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		int totalQuery = userInput.nextInt();
		for (int i = 0; i < totalQuery; i++) {
			int number = userInput.nextInt();
			if (number %2==0) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
		userInput.close();

	}

}
