/**
 * 
 */
package com.ask.sample;

import java.util.Scanner;

/**
 * @author sahar8
 *
 */
public class GemElements {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		int numberOfStrings = userInput.nextInt();
		String[] arrays = new String[numberOfStrings];
		for (int i = 0; i < numberOfStrings; i++) {
			arrays[i] = userInput.next();
		}
		int result =0;
		for (int i = 0; i < arrays[0].length(); i++) {
			String characterToCheck = String.valueOf(arrays[0].charAt(i));
			int internalCount = 0;
			for (int j = 1; j < arrays.length; j++) {
				if(arrays[j].indexOf(characterToCheck) > -1) {
					internalCount++;
				}
			}
			if (internalCount == arrays.length-1) {
				result++;
			}
		}
		System.out.println(result);
		userInput.close();
	}

}
