/**
 * 
 */
package com.ask.sample;

import java.util.Scanner;

/**
 * @author sarav
 *
 */
public class MaximumSubArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		int arrayLength = userInput.nextInt();
		int[] array = new int[arrayLength];
		for (int i = 0; i < arrayLength; i++) {
			array[i] = userInput.nextInt();
		}
		System.out.println(maxSubArray(array));
		userInput.close();
	}
	
	  public static int maxSubArray(int[] array) {
	       int newsum=array[0];
	       int max=array[0];
	       for(int i=1;i<array.length;i++){
	           newsum=Math.max(newsum+array[i],array[i]);
	           max= Math.max(max, newsum);
	       }
	       return max;
	    }

}
