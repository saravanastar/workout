/**
 * 
 */
package com.ask.sample;

import java.util.Arrays;

/**
 * @author sahar8
 *
 */
public class ThirdLargestDistinctValue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {3,12,14,6,8,1,2};
		System.out.println(thirdLargest(array));
		
	}
	static int thirdLargest(int[] arr) {
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}
		return arr[arr.length-3];
		
		
	}
}
