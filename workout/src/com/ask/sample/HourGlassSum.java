/**
 * 
 */
package com.ask.sample;

import java.util.Scanner;

/**
 * @author sxa8465
 *
 */
public class HourGlassSum {

	int CLOCK_SIZE = 3;
	int max = 0;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HourGlassSum glassSum = new HourGlassSum();
		// Scanner input = new Scanner(System.in);

		// int[][] inputAr = new int[6][6];
		int[][] inputAr = new int[][] { {-1,1,-1,0,0,0},
			{0,-1,0,0,0,0},
			{-1,-1,-1,0,0,0},
			{0,-9,2,-4,-4,0},
			{-7,0,0,-2,0,0},
			{0,0,-1,-2,-4,0} };

		// for (int i = 0; i < inputAr.length; i++) {
		// for (int j = 0; j < inputAr.length; j++) {
		// inputAr[i][j] = input.nextInt();
		// }
		// }
		glassSum.findMaxClockSize(inputAr, 0, 0);
		System.out.println(glassSum.max);
	}

	private void findMaxClockSize(int[][] input, int row, int col) {
		// TODO Auto-generated method stub
		if (row + (CLOCK_SIZE-1) > input.length-1 && col + (CLOCK_SIZE-1) > input.length-1) {
			return;
		}
		if (col + (CLOCK_SIZE-1) > input.length-1) {
			row = row + 1;
			if (row + (CLOCK_SIZE-1) > input.length-1) {
				return;
			}
			col = 0;
		}
		int sum = 0;
		for (int i = col; i < col + CLOCK_SIZE; i++) {
			sum += input[row][i];
//			System.out.println(row +(CLOCK_SIZE - 1));
			sum += input[row +(CLOCK_SIZE - 1)][i];
		}
		sum += input[row + 1][col + 1];
		if (row == 0 && col == 0) {
			max = sum;
		} else {
			max = sum > max ? sum : max;
		}
		findMaxClockSize(input, row, col + 1);
	}

}
