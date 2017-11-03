/**
 * 
 */
package com.ask.sample;

import java.util.Scanner;


/**
 * @author sahar8
 *
 */
public class UtopianTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		int noOfInputs = userInput.nextInt();
		int initialGrowth = 1;
		for (int i = 0; i < noOfInputs; i++) {
			int cycleCount = userInput.nextInt();
			if(cycleCount <= 0 ){
				System.out.println(initialGrowth);
				continue;
			}
			for (int j = 1; j <= cycleCount; j++) {
				if (j%2 == 0 ) {
					initialGrowth+=1;
				} else {
					initialGrowth*=2;
				}
			}
			System.out.println(initialGrowth);
			initialGrowth = 1;
		}
		userInput.close();
	}

}
