/**
 * 
 */
package com.ask.sample;

/**
 * @author sahar8
 *
 */
public class CyclicRotation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] inputArray = {2, 3, 4, 5, 6, 7, 1};
		System.out.println(new CyclicRotation().solution(inputArray,7,3).toString());
	}

	private int[] solution(int[] A, int N, int K) {
		// TODO Auto-generated method stub
		int subArrayLength = A.length-K;
		int[] subArray = new int[A.length];
		System.arraycopy(A, K-1, subArray, 0, subArrayLength+1);
		System.arraycopy(A, 0, subArray, subArrayLength+1, K-1);
		for (int i = 0; i < subArray.length; i++) {
			System.out.print(subArray[i]);
		}
		return subArray;
	}

}
