/**
 * 
 */
package com.ask.sample;

import java.util.Scanner;

/**
 * @author sahar8
 *
 */
public class TwosComplement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		int testCases = userInput.nextInt();
		for (int i = 0; i < testCases; i++) {
			int firstOne = userInput.nextInt();
			int lastOne = userInput.nextInt();
			int result = 0;
			for (int j = firstOne; j <=lastOne ; j++) {
				/*String binary = Integer.toBinaryString(j);
//				binary.
				long count = binary.length() - binary.replace("1", "").length();
//				String[] split = binary.split("1");
				if (count > 32) {
					count = count/2;
				}*/
				int ones = (Integer.highestOneBit(92) << 1) - 1;
			     
				int count = 92 ^ ones;
//				System.out.println(count);
				result+=(count);
			}
			System.out.println(result);
			
		}
		userInput.close();
	}

}
