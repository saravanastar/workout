/**
 * 
 */
package com.ask.sample;

import java.util.Scanner;

/**
 * @author sahar8
 *
 */
public class CompareTriplets {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		 int a0 = in.nextInt();
	        int a1 = in.nextInt();
	        int a2 = in.nextInt();
	        int b0 = in.nextInt();
	        int b1 = in.nextInt();
	        int b2 = in.nextInt();
	        int alicePoint = 0;
	        int  bPoint = 0;
	        if (a0 > b0) {
	        	alicePoint++;
	        } else {
	        	if (b0 > a0) {
	        		bPoint++;
	        	}
	        }
	        
	        if (a1 > b1) {
	        	alicePoint++;
	        } else {
	        	if (b1 > a1) {
	        		bPoint++;
	        	}
	        }
	        
	        if (a2 > b2) {
	        	alicePoint++;
	        } else {
	        	if (b2 > a2) {
	        		bPoint++;
	        	}
	        }

	        System.out.println(""+ alicePoint + " "+ bPoint);
	}

}
