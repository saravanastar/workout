/**
 * 
 */
package com.ask.sample;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * @author sxa8465
 *
 */
public class ArrayDS {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int input = in.nextInt();
		int[] inputArray = new int[input];
		IntStream.range(0, input).forEach(i -> {
			inputArray[i] = in.nextInt();
		});
		
		for (int j = inputArray.length-1; j >=0; j--) {
			System.out.print(inputArray[j] + " ");
		}
		
		in.close();
	}

}
