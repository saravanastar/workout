/**
 * 
 */
package com.ask.sample;

import java.util.Arrays;

/**
 * @author sarav
 *
 */
public class AmazonAutomata {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] blocks = {"5", "-2", "4","Z", "X", "9","+","+"};
		System.out.println(totalScore(blocks, 8));

	}
	
	public static int totalScore(String[] blocks, int n) {
		String regex = "-?[0-9]{0,10}";
		if (blocks ==null || blocks.length == 0) {
			return 0;
		}
		int[] stepScore = new int[blocks.length];
		int stepIndex = 0;
		for (int index = 0; index < blocks.length; index++) {
			String stepValue = blocks[index];

			switch(stepValue) {
			case "X": 
				stepScore[stepIndex] = 2*stepScore[stepIndex-1];
				break;
			case "+":
				stepScore[stepIndex] = stepScore[stepIndex-2]+stepScore[stepIndex-1];
				break;
			case "Z":
				stepScore[stepIndex-1] = 0;
				stepIndex-=2;
				break;
			default:
				if(stepValue.matches(regex)) {
					stepScore[stepIndex] =Integer.parseInt(stepValue);
				}
				break;
			}
			stepIndex++;
		}
		
		return Arrays.stream(stepScore).sum();
		
	}

}
