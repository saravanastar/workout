/**
 * 
 */
package com.ask.sample;

import java.util.Scanner;

/**
 * @author sahar8
 *
 */
public class FunnyString {

	/**
	 * @param args
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		int testCaseCount = userInput.nextInt();
		
		for (int i = 0; i < testCaseCount; i++) {
			String inputString = userInput.next();
			StringBuffer buffer = new StringBuffer(inputString);
			String reverseString = buffer.reverse().toString();
			boolean flag = false;
			for (int j = 1; j < inputString.length(); j++) {
				for (int j2 = j; j2 < reverseString.length(); j2++) {
					int reverNumber = Math.abs((int)reverseString.charAt(j2) - (int)reverseString.charAt(j2-1));
					int dirNumberNumber = Math.abs((int)inputString.charAt(j) - (int)inputString.charAt(j-1));
					if (reverNumber == dirNumberNumber){
						flag = true;
						break;
					} else {
						flag = false;
						break;
					}
				}
				if (!flag) {
					break;
				}
			}
			if (flag) {
				System.out.println("Funny");
			} else{
				System.out.println("Not Funny");
			}
			
		}
		userInput.close();

	}

}
