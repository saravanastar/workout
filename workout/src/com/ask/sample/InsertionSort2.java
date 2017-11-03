/**
 * 
 */
package com.ask.sample;

import java.util.Scanner;

/**
 * @author sahar8
 *
 */
public class InsertionSort2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int[] ar = new int[s];
		for (int i = 0; i < s; i++) {
			ar[i] = in.nextInt();
		}
		sort(ar);
		in.close();
	}

	public static void sort(int[] ar) {

		for (int i = 0; i < ar.length; i++) {
			int position = 0;
			while (position < i) {
				if (ar[position] > ar[i]) {
					int temp = ar[position];
					ar[position] = ar[i];
					ar[i] = temp;
				}
				position++;
			}
			
			printArray(ar);
			
		}
	}

	private static void printArray(int[] ar) {
		for (int n : ar) {
			System.out.print(n + " ");
		}
		System.out.println();
	}

}
