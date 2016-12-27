/**
 * 
 */
package com.ask.sample;

import java.util.Scanner;

/**
 * @author sarav
 *
 */
public class MinMaxSum {
	public static void main(String[] args) {
	      Scanner in = new Scanner(System.in);
	        long a = in.nextLong();
	        long b = in.nextLong();
	        long c = in.nextLong();
	        long d = in.nextLong();
	        long e = in.nextLong();
	        long[] input = {a,b,c,d,e};
//	        ListArrays.asList(input);
	        long min = input[0];
	        long max = 0;
	        for (int i = 0; i < input.length; i++) {
	        	long sum =0;
	        	
				for (int j = 0; j < input.length; j++) {
					if(i!=j) {
						sum+=input[j];
					}
				}
				if (i==0) {
					min = sum;
				}
				if (sum < min) {
					min = sum;
				}
				if(sum > max) {
					max = sum;
				}
			}
	        System.out.println(min + " "+max);
	}

}
