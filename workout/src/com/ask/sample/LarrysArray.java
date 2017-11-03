/**
 * 
 */
package com.ask.sample;

import java.util.Scanner;

/**
 * @author sahar8
 *
 */
public class LarrysArray {

	/**
	 * @param args
	 */
	public static boolean isSorted(int[] a) {

		int i;
		boolean flag = true;
		for (i = 0; i < a.length; i++)
			
		{
			if (!(a[i] < a[i + 1])) {
				flag = false;
				break;
			} 
		}
		return flag;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		int testCases = userInput.nextInt();
		for (int i = 0; i < testCases; i++) {
			int arrayLength = userInput.nextInt();
			int[] userArray = new int[arrayLength];
			boolean resultFalg = false;
			for (int j = 0; j < arrayLength; j++) {
				userArray[j] = userInput.nextInt();
			}
			for (int j = 0; j < userArray.length; j++) {
				if (resultFalg) {
					break;
				}
				if (!resultFalg && (j + 2) <= (userArray.length - 1) && userArray[j] > userArray[j + 2]) {
					int count = 0;
					while (count <= 2) {
						int temp = userArray[j];
						userArray[j] = userArray[j + 1];
						userArray[j + 1] = userArray[j + 2];
						userArray[j + 2] = temp;
						if (userArray[j] < userArray[j + 1] && userArray[j + 1] < userArray[j + 2]) {
							resultFalg = true;
							break;
						}
						count++;

					}
				}
			}
			if (resultFalg && isSorted(userArray)) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}

		}
		userInput.close();
	}

}
