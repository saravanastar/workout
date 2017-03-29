/**
 * 
 */
package com.ask.sample;

import java.util.Scanner;

/**
 * @author sxa8465
 *
 */
public class BreakingRecords {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] score = new int[n];
		for (int score_i = 0; score_i < n; score_i++) {
			score[score_i] = in.nextInt();
		}
		in.close();
		int currentMax = score[0],
		currentMin = score[0];
		int numberHigh = 0;
		int numberLow = 0;
		for (int i = 1; i < score.length; i++) {
			if (score[i]> currentMax) {
				currentMax =score[i];
				numberHigh++;
			}
			if (score[i]< currentMin) {
				currentMin =score[i];
				numberLow++;
			}
		}
		System.out.println(numberHigh + " " + numberLow);

	}

}
