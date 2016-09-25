/**
 * 
 */
package com.ask.sample;

import java.util.Scanner;

/**
 * @author sahar8
 *
 */
public class RunningTimeAlgorithm {

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

	}
	public static void sort(int[] ar) {
		int operationCount = 0;
		for (int i = 0; i < ar.length; i++) {
			int position = 0;
			while (position < i) {
				if (ar[position] > ar[i]) {
					int temp = ar[position];
					ar[position] = ar[i];
					ar[i] = temp;
					operationCount++;
				}
				position++;
			}
			
//			printArray(ar);
			System.out.println(operationCount);
			
		}
	}


}
