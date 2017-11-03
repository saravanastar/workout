/**
 * 
 */
package com.ask.sample;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author sahar8
 *
 */
public class LibraryFine {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		String returedDate = userInput.nextLine();
		String actualDate = userInput.nextLine();

		int[] reurnedDate = Arrays.stream(returedDate.split(" ")).map(String::trim).mapToInt(Integer::parseInt)
				.toArray();
		int[] acturaDate = Arrays.stream(actualDate.split(" ")).map(String::trim).mapToInt(Integer::parseInt).toArray();

		if (reurnedDate[2] < acturaDate[2]) {
			System.out.println("0");
		} else {
			if (reurnedDate[2] == acturaDate[2]) {

				if (reurnedDate[1] < acturaDate[1]) {
					System.out.println("0");
				} else {
					if (reurnedDate[1] == acturaDate[1] && reurnedDate[0] <= acturaDate[0]) {
						System.out.println("0");
					} else if (reurnedDate[1] == acturaDate[1] && reurnedDate[0] > acturaDate[0]) {
						System.out.println((reurnedDate[0] - acturaDate[0]) * 15);
					} else if (reurnedDate[1] > acturaDate[1]) {
						System.out.println((reurnedDate[1] - acturaDate[1]) * 500);
					}
				}
			} else {
				System.out.println(10000);
			}
		}
		userInput.close();
	}

}
