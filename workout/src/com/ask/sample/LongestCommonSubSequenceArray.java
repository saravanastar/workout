package com.ask.sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LongestCommonSubSequenceArray {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int firstArrayLength = in.nextInt();
		int secondArrayLength = in.nextInt();
		int[] firstArray = new int[firstArrayLength];
		int[] secondArray = new int[secondArrayLength];

		for (int i = 0; i < firstArrayLength; i++) {
			firstArray[i] = in.nextInt();
		}

		for (int i = 0; i < secondArrayLength; i++) {
			secondArray[i] = in.nextInt();
		}

		int[][] buildedArray = commonSequence(firstArray, secondArray);

		int m = firstArray.length;
		int n = secondArray.length;
		List<Integer> result = new ArrayList<Integer>();
		while (m != 0 && n != 0) {
			int value = buildedArray[m][n];
			int topValue = buildedArray[m - 1][n];
			int leftValue = buildedArray[m][n - 1];
			int max = Math.max(topValue, leftValue);
			if (value == max) {
				if (value == topValue) {
					m = m - 1;
				} else {
					n = n - 1;
				}
			} else {
				result.add(firstArray[m - 1]);
				m = m - 1;
				n = n - 1;
			}
		}
		Collections.reverse(result);
		result.stream().forEach(number -> {
			System.out.print(number + " ");
		});
		in.close();
	}

	private static int[][] commonSequence(int[] a, int[] b) {

		int m = a.length;
		int n = b.length;

		int[][] result = new int[m + 1][n + 1];
		for (int i = 0; i <= m; i++) {
			for (int j = 0; j <= n; j++) {
				if (i == 0 || j == 0) {
					result[i][j] = 0;
				} else if (a[i - 1] == b[j - 1]) {
					result[i][j] = 1 + result[i - 1][j - 1];
				} else {
					result[i][j] = Math.max(result[i - 1][j], result[i][j - 1]);
				}
			}
		}
		// System.out.println(result[m][n]);
		return result;
	}
}
