/**
 * 
 */
package com.ask.sample;

/**
 * @author sahar8
 *
 */
public class BinaryGap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new BinaryGap().solution(9));

	}

	private int solution(int N) {

		String binaryString = Integer.toBinaryString(N);

		String[] binaryStringArray = binaryString.split("1");
		int length = Integer.parseInt(String.valueOf(binaryString.charAt(binaryString.length()-1)))==1?binaryStringArray.length:binaryStringArray.length-1;
		int size = 0;
		for (int i = 1; i < length; i++) {
			if (binaryStringArray[i].length() > size) {
				size = binaryStringArray[i].length();
			}
		}
		
		return size;
		
	}

}
