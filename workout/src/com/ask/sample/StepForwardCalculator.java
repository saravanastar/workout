package com.ask.sample;

import java.util.Scanner;

public class StepForwardCalculator {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String opr = in.next();
		int result = solve(opr);
		System.out.println(result);
		in.close();

	}

	static int solve(String opr) {
		int result = 0;
		for (int i = 0; i < opr.length(); i++) {
			String specString = String.valueOf(opr.charAt(i));

			int prev = 0;
			int next = 0;
			switch (specString) {
			case "+":
				prev = Integer.parseInt(String.valueOf(opr.charAt(i - 1)));
				next = Integer.parseInt(String.valueOf(opr.charAt(i + 1)));
				result = prev + next;
				break;
			case "-":
				prev = Integer.parseInt(String.valueOf(opr.charAt(i - 1)));
				next = Integer.parseInt(String.valueOf(opr.charAt(i + 1)));
				result = prev - next;
				break;
			case "*":
				prev = Integer.parseInt(String.valueOf(opr.charAt(i - 1)));
				next = Integer.parseInt(String.valueOf(opr.charAt(i + 1)));
				result = prev * next;
				break;
			case "/":
				prev = Integer.parseInt(String.valueOf(opr.charAt(i - 1)));
				next = Integer.parseInt(String.valueOf(opr.charAt(i + 1)));
				result = prev / next;
				break;
			}
		}
		return result;
	}

}
