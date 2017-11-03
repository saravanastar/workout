/**
 * 
 */
package com.ask.sample;

import java.util.Scanner;

/**
 * @author sahar8
 *
 */
public class SumOfArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int countOfArray = scan.nextInt();
		int[][] array = new int[countOfArray][countOfArray];
		for (int i = 0; i < countOfArray; i++) {
			for (int j = 0; j < countOfArray; j++) {
				array[i][j] = scan.nextInt();
			}
			
		}
		int leftPos = 0;
		int rightPos = countOfArray-1;
		int rightCount = 0;
		int leftCount = 0;
		for (int i = 0; i < array.length; i++) {
			/*for (int j = 0; j < array.length; j++) {
				
			}*/
			leftCount+= array[i][leftPos];
			rightCount+= array[i][rightPos];
			leftPos++;
			rightPos--;
			
		}
		System.out.println(leftCount-rightCount);
		scan.close();
	}

}
