/**
 * 
 */
package com.ask.sample;

import java.util.Scanner;

/**
 * @author sarav
 *
 */
public class AmazonMaximumSales {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		int arrayLength = userInput.nextInt();
		int[][] input = new int[arrayLength][3];
		for (int i = 0; i < arrayLength; i++) {
			
			input[i][0] = userInput.nextInt();
			input[i][1] = userInput.nextInt();
			input[i][2] = userInput.nextInt();
		}
		for (int i = 0; i < arrayLength; i++) {

			int startTime = input[i][0];
			int endTime = input[i][1];
			int amount = input[i][2];
			for (int j = i+1; j < arrayLength; j++) {
				int startTime1 = input[j][0];
				int endTime1 = input[j][1];
				int amount1 = input[j][2];
				if ((startTime < startTime1 && endTime > startTime1)) {
					if(amount < amount1) {
						System.out.println(startTime + " " + endTime + " "+ amount);
						if (j+1 >= arrayLength) {
							System.out.println((endTime+1) + " " + endTime1 + " "+ amount);
						}
						break;
						
					} else {
						System.out.println(startTime + " " + (startTime1-1) + " "+ amount);
						if (j+1 >= arrayLength) {
							System.out.println((startTime1) + " " + endTime1 + " "+ amount1);
						}
						break;
					}
					
				}
					
				if (endTime1 > startTime && endTime1 < endTime) {
					if(amount < amount1) {
						System.out.println(startTime + " " + (endTime1-1) + " "+ amount);
						break;
					}
				}
			}
			
			
		}
		userInput.close();
	}

}
