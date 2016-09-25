/**
 * 
 */
package com.ask.sample;

/**
 * @author sahar8
 *
 */
public class ArrayReverseSubset {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {10,2,3,5,4,5,8,9,1};
		int reversePosition = 3;
		int[] reverserArrray = new int[array.length];
		
		for (int i = 0; i < array.length; i=i+3) {
			int pos = (reversePosition-1)+i;
			int count =pos-(reversePosition-1);
			for (int j = pos; j >=i; j--) {
				
 				reverserArrray[count] = array[j];
				++count;
			}
		}
		
		for (int i = 0; i < reverserArrray.length; i++) {
			System.out.println(reverserArrray[i]);
		}

	}

}
