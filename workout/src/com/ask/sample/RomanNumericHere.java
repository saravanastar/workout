/**
 * 
 */
package com.ask.sample;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author sarav
 *
 */
public class RomanNumericHere {
	static String[] invalidRules = { "XXXX", "IIII", "VX" };

	static Map<String, Integer> romanMap = new HashMap<String, Integer>();

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		String output;
		romanMap.put("I", 1);
		romanMap.put("V", 5);
		romanMap.put("X", 10);
		romanMap.put("L", 50);
		romanMap.put("C", 100);
		romanMap.put("D", 500);
		romanMap.put("M", 1000);
		String ip1 = in.nextLine().trim();

		output = evaluateExpression(ip1);
		System.out.println(String.valueOf(output));
		in.close();
	}

	public static String evaluateExpression(String input1) {
		if (input1 == null) {
			return null;
		}
		for (int i = 0; i < invalidRules.length; i++) {
			if (input1.contains(invalidRules[i])) {
				return "INVALID";
			}

		}

		int resultNumber = 0;
		String[] tmp = input1.split("\\+");
		for (int i = 0; i < tmp.length; i++) {
			String romanNumber = tmp[i];

			int[] inputArray = new int[romanNumber.length()];
			int index = 0;
			for (int j = 0; j < romanNumber.length(); j++) {
				String temp = String.valueOf(romanNumber.charAt(j));
				temp = temp.trim().toUpperCase();
				if (romanMap.get(temp) != null) {
					inputArray[index] = romanMap.get(temp);
					index++;
				}
			}
			inputArray = Arrays.stream(inputArray).filter(num -> num > 0).toArray();
			for (int k = 0; k < inputArray.length; k++) {
				if (k + 1 == inputArray.length) {
					break;
				}
				if (inputArray[k] >= inputArray[k + 1]) {
					BigInteger left = new BigInteger(String.valueOf(inputArray[k]));
					BigInteger right = new BigInteger(String.valueOf(inputArray[k + 1]));
					BigInteger sum = left.add(right);
					resultNumber += Integer.valueOf(sum.toString());
				}
				if (inputArray[k] < inputArray[k + 1]) {
					BigInteger left = new BigInteger(String.valueOf(inputArray[k]));
					BigInteger right = new BigInteger(String.valueOf(inputArray[k + 1]));
					BigInteger sum = right.subtract(left);
					resultNumber += Integer.valueOf(sum.toString());
				}

			}

		}
		return String.valueOf(resultNumber);
	}
}
