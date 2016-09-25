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
public class AngryProfessor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		int numberOfTestCases = Integer.parseInt(userInput.next());
		
		for (int i = 0; i < numberOfTestCases; i++) {
			int numberOfStuden = Integer.parseInt(userInput.next());
			int expectedStudent = Integer.parseInt(userInput.next());
			int[] studenTimingArray = new int[numberOfStuden];
			for (int j = 0; j < numberOfStuden; j++) {
				studenTimingArray[j] = userInput.nextInt();
			}
			
			int countEligibleStuden = 0;
			boolean flag = false;
			for (int j = 0; j < numberOfStuden; j++) {
				if (studenTimingArray[j] <=0) {
					countEligibleStuden++;
				}
				if (expectedStudent == countEligibleStuden) {
					flag = true;
				}
			}
			if(flag) {
				System.out.println("NO");
			} else {
				System.out.println("YES");
			}
		}

	}

}
