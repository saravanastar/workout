package com.ask.sample;

public class StringPermutation {
	
	public static void main(String[] args) {
		String inputString = "AABC";
		StringPermutation permutaiton = new StringPermutation();
		permutaiton.findPermutation(inputString, 0, inputString.length()-1);
	}

	private void findPermutation(String inputString, int pos, int n) {
		if (pos == n) {
			System.out.println(inputString);
		}
		for (int i = pos; i < inputString.length(); i++) {
			inputString = swap(inputString, pos,i);
			findPermutation(inputString, pos+1, n);
		}
			
	}
	
	 public String swap(String a, int i, int j)
	    {
	        char temp;
	        char[] charArray = a.toCharArray();
	        temp = charArray[i] ;
	        charArray[i] = charArray[j];
	        charArray[j] = temp;
	        return String.valueOf(charArray);
	    }

}
