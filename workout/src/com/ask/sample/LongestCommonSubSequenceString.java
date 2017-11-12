package com.ask.sample;

import java.util.Arrays;
import java.util.Scanner;

public class LongestCommonSubSequenceString {
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
		
		StringBuilder builder = new StringBuilder();

		Arrays.stream(firstArray).forEach(builder::append);
		String a = builder.toString();
		builder = new StringBuilder();
		Arrays.stream(secondArray).forEach(builder::append);
		String b = builder.toString();

		int[][] buildedArray = commonSequence(a, b);
		
		int m = a.length();
		int n = b.length();
		StringBuilder result = new StringBuilder();
		while (m !=0 && n != 0) {
			int value = buildedArray[m][n];
			int topValue = buildedArray[m-1][n];
			int leftValue = buildedArray[m][n-1];
			int max = Math.max(topValue, leftValue);
			if (value == max) {
				if (value == topValue) {
					m = m-1;
				} else {
					n = n-1;
				}
			} else {
				result.append(a.charAt(m-1)).append(" ");
				m = m-1;
				n = n-1;
			}
		}
		System.out.println(result.reverse().toString());
		in.close();
	}

	private static int[][] commonSequence(String a, String b) {
		
		
		int m = a.length();
		int n = b.length();

		int[][] result = new int[m + 1][n + 1];
		for (int i = 0; i <= a.length(); i++) {
			for (int j = 0; j <= b.length(); j++) {
				if (i == 0 || j == 0) {
					result[i][j] = 0;
				}else if (a.charAt(i - 1) == b.charAt(j - 1)) {
					result[i][j] = 1 + result[i - 1][j - 1];
				} else {
					result[i][j] = Math.max(result[i - 1][j], result[i][j - 1]);
				}
			}
		}
//		System.out.println(result[m][n]);
		return result;
	}
}
