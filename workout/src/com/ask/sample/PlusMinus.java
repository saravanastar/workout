/**
 * 
 */
package com.ask.sample;

import java.util.Scanner;

/**
 * @author sahar8
 *
 */
public class PlusMinus {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner userInput = new Scanner(System.in);
		int arrayCount = userInput.nextInt();
		int positiveCount = 0;
		int negativeCount = 0;
		int zeroCount = 0;
		for (int i = 0; i < arrayCount; i++) {
			int numberToValidate = userInput.nextInt();
			
			if(numberToValidate > 0){
				positiveCount++;
			} else if (numberToValidate < 0) {
				negativeCount++;
			} else {
				zeroCount++;
			}
			
		}
		System.out.println((double)positiveCount/arrayCount);
		System.out.println((double)negativeCount/arrayCount);
		System.out.println((double)zeroCount/arrayCount);
		

	}

}
