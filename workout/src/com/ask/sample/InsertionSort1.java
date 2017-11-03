/**
 * 
 */
package com.ask.sample;

import java.util.Scanner;

/**
 * @author sahar8
 *
 */
public class InsertionSort1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		int numbercount = userInput.nextInt();
		int[] array = new int[numbercount];
		for (int i = 0; i < numbercount; i++) {
			array[i] = userInput.nextInt();
		}
		boolean falg = false;
		int key = array[array.length-1];
		for (int i = array.length-2; i >=0; i--) {
			if (key < array[i]) {
				array[i+1] = array[i];
			} else {
				array[i+1] = key;
				falg = true;
			}
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[j]+ " ");
			}
			System.out.println();
			if (falg) {
				break;
			}
		}
		if (!falg) {
			array[0] = key;
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[j]+ " ");
			}
		}
		userInput.close();
	}

}
