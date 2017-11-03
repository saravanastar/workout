/**
 * 
 */
package com.ask.sample;

import java.util.Scanner;

/**
 * @author sahar8
 *
 */
public class JumpingClouds {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int c[] = new int[n];
		for (int c_i = 0; c_i < n; c_i++) {
			c[c_i] = in.nextInt();
		}
		int totalEnergy = 100;
		for (int i = 0; i < c.length; i++) {
			int localNumber = k;
			while ((i + localNumber) >= c.length) {
				localNumber--;
			}
			/*if (localNumber <= 0) {
				break;
			}*/
			if (localNumber > 0) {
				if (c[i + localNumber] == 1) {
					totalEnergy -= 2;
				}
				totalEnergy -= 1;
				i = i + (localNumber - 1);
			}

		}
		System.out.println(totalEnergy);
		in.close();
	}

}
