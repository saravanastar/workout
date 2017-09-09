/**
 * 
 */
package com.ask.sample;

import java.util.Scanner;

/**
 * @author sxa8465
 *
 */
public class ViralAdvertising {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int days = scanner.nextInt();
		scanner.close();
		int totalShares = 0;
		int currentDays = 0;
		int initialMembers = 5;
		int taotalFellows = 0;
		while (days > currentDays) {
			int whoShares = (int) Math.floor(initialMembers/2);
			totalShares+=whoShares;
			taotalFellows=whoShares*=3;
			initialMembers = taotalFellows;
			currentDays++;
		}
		System.out.println(totalShares);
		

	}

}
