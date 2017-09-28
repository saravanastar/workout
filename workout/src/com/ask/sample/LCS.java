/**
 * 
 */
package com.ask.sample;

/**
 * @author sxa8465
 *
 */
public class LCS {
	
	public static void main(String[] args) {
		String s1 = "AGGTAB";
		String s2 = "GXTXAYB";
		LCS lcs = new LCS();
		lcs.lcsArrayCalc(s1, s2);
		
	}
	
	void lcsArrayCalc(String s1, String s2) {
		
		int resultArray[][] = new int[s1.length()+1][s2.length()+1];
		
		for (int i = 0; i < s1.length(); i++) {
				for (int j = 0; j < s2.length(); j++) {
					String temp1 = String.valueOf(s1.charAt(i));
					String temp2 = String.valueOf(s2.charAt(j));
					if (temp1.equalsIgnoreCase(temp2)) {
						int value1 = resultArray[i][j] +1;
						resultArray[i+1][j+1] = value1;
					} else {
						int value1 = resultArray[i+1][j];
						int value2 = resultArray[i][j+1];
						if (value1 > value2) {
							resultArray[i+1][j+1] = value1;
						} else {
							resultArray[i+1][j+1] = value2;
						}
					}
				}
			
		}
		System.out.println(resultArray);
		
	}

}
