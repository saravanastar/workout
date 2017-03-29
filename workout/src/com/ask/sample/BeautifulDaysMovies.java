/**
 * 
 */
package com.ask.sample;

import java.util.Scanner;

/**
 * @author sxa8465
 *
 */
public class BeautifulDaysMovies {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int i = scanner.nextInt();
		int j = scanner.nextInt();
		int k = scanner.nextInt();
		int beautifulDays = 0;
		for (int k2 = i; k2 <=j; k2++) {
			int reverNumber = Integer.parseInt(new StringBuilder(String.valueOf(k2)).reverse().toString());
			if (Math.abs(reverNumber-k2) % k == 0) {
				beautifulDays++;
			}
		}
		scanner.close();
		System.out.println(beautifulDays);
	}

}
