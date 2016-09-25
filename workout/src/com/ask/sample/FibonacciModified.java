/**
 * 
 */
package com.ask.sample;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author sahar8
 *
 */
public class FibonacciModified {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		String input = userInput.nextLine();
		int[] inout = Arrays.stream(input.split(" ")).mapToInt(Integer::parseInt).toArray();
		int inNumber = inout[2];
		BigInteger output = new BigInteger("0");
		BigInteger number1 = new BigInteger(""+inout[0]);
		BigInteger number2 = new BigInteger(""+inout[1]);
		for (int i = 0; i < inNumber-2; i++) {
			output = number2.multiply(number2).add(number1);
			number1 = number2;
			number2 = output;
		}
		System.out.println(output.toString());

	}

}
