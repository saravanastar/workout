package com.ask.sample;

import java.util.Arrays;

public class WordBreakProblem {
	
	String dictionary[] = {"mobile","samsung","sam","sung",
            "man","mango", "icecream","and",
            "go","i","love","ice","cream"};
	
	public static void main(String[] args) {
		WordBreakProblem problem = new WordBreakProblem();
		String input = "iloveicecreamandmango";
		problem.breakWord(input, input.length(), "");
	}
	
	public void breakWord(String originalString, int length, String result) {
		
		for (int i = 1; i <= originalString.length(); i++) {
			String temp = originalString.substring(0, i);
			if (Arrays.asList(dictionary).contains(temp)) {
				result+=" "+temp;
				System.out.println(result);
				breakWord(originalString.substring(i,length), length-i, result);
			}
		}
		
	}
	

}
