package com.ask.sample;

import java.util.Arrays;

public class ElevatorSuperstition {

	public static void main(String[] args) {

		int input = 12;
		System.out.println(getLuckyFloorNumber(input));

	}

	static int getLuckyFloorNumber(int n) {

		String[] negligbleDigits = { "13", "4" };
		int[] resultArray = new int[n];
		int count = 0;
		int currentNumber =1;
		
		Arrays.fill(resultArray, -1);
		
		while (count < n) {
			String tempNumber = String.valueOf(currentNumber);
			if (tempNumber.indexOf(negligbleDigits[0]) > -1 || tempNumber.indexOf(negligbleDigits[1]) > -1) {
				currentNumber++;
				continue;
			} else {
				resultArray[count] = currentNumber;
				count++;
				currentNumber++;
			}
		}

		return resultArray[n-1];
	}

}
