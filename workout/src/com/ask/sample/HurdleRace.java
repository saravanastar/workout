/**
 * 
 */
package com.ask.sample;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;

/**
 * @author sxa8465
 *
 */
public class HurdleRace {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] height = new int[n];
        for(int height_i=0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
        }
        in.close();
        
       OptionalInt maxNumber =  Arrays.stream(height).max();
       if (maxNumber.getAsInt() < k) {
    	   System.out.println("0");
       } else {
    	   System.out.println(Math.abs(k-maxNumber.getAsInt()));
       }

	}

}
