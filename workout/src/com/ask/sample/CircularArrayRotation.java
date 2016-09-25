/**
 * 
 */
package com.ask.sample;

import java.util.Scanner;

/**
 * @author sahar8
 *
 */
public class CircularArrayRotation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		int n = userInput.nextInt();
		int k = userInput.nextInt();
		int q = userInput.nextInt();
		int[] array = new int[n];
		int[] queryArray = new int[q];
		
		for (int i = 0; i < n; i++) {
			array[i] = userInput.nextInt();
		}
		
		/*for (int i = 0; i < q; i++) {
			queryArray[i] = userInput.nextInt();
		}*/
		
		for (int i = 0; i < k; i++) {
		/*	int lastTemp = 0;
			for (int j = 0; j < n-1; i++) {
				if (j+1 == n-1) {
					lastTemp = array[n-1];
					break;
				}
				int temp = array[j+1]; 
				array[j+1] = array[j];
				array[j] = temp;
			}
			array[0] = lastTemp;*/
			int[] temArray = new int[n];
			System.arraycopy(array, 0, temArray, 1, n-1);
			temArray[0] = array[n-1];
			array = temArray;
			
		}
		
		for (int i = 0; i < q; i++) {
			int arrayPosition = userInput.nextInt();
			System.out.println(array[arrayPosition]);
			
		}
		
	}

}
