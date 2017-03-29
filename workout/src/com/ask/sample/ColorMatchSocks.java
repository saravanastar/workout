/**
 * 
 */
package com.ask.sample;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author sxa8465
 *
 */
public class ColorMatchSocks {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int c[] = new int[n];
		for (int c_i = 0; c_i < n; c_i++) {
			c[c_i] = in.nextInt();
		}
		in.close();
		Arrays.sort(c);
		int pairSocks = 0;
		for (int i = 0; i < c.length; i++) {
			int pairNum = c[i];
			int totalItems = 0;
			int pos = i;
			while(pos<c.length && c[pos] == pairNum) {
				totalItems++;
				pos++;
			}
			i=pos-1;
			pairSocks+= totalItems/2;
		}
		System.out.println(pairSocks);
	}

}
