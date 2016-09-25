/**
 * 
 */
package com.ask.sample;

import java.util.Scanner;

/**
 * @author sahar8
 *
 */
public class InsertionSortAnalysis {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		int testCases = userInput.nextInt();
		for (int i = 0; i < testCases; i++) {
			int totalElement = userInput.nextInt();
			int[] array = new int[totalElement];
			for (int j = 0; j < totalElement; j++) {
				array[j] = userInput.nextInt();
			}
			int totalcount = 0;
			for (int j = 1; j < array.length; j++) {
				int localCount = 0;
				for (int j2 = j; j2 > 0; j2--) {
					if (array[j2] < array[j2 - 1]) {
						int temp = array[j2];
						array[j2] = array[j2 - 1];
						array[j2 - 1] = temp;
						localCount++;
					}
				}
				totalcount += localCount;

			}
			System.out.println(totalcount);

		}

	}

}
