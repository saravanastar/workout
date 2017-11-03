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
public class BonAppetit {
	
	static int bonAppetit(int n, int k, int b, int[] ar) {
		
		int totalSum = IntStream.range(0, ar.length).filter(i -> i!=k).map(i -> ar[i]).sum();
		totalSum = totalSum/2;
		if (totalSum == b) {
			return -1;
		} else {
			return b-totalSum;
		}
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int b = in.nextInt();
        int result = bonAppetit(n, k, b, ar);
		if (result == -1) {
			System.out.println("Bon Appetit");
		} else {
			System.out.println(result);
        }
		in.close();
    }

}
