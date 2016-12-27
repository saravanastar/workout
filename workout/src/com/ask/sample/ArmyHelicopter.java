/**
 * 
 */
package com.ask.sample;

/**
 * @author sarav
 *
 */
public class ArmyHelicopter {

	public static void main(String[] args) {
		String[] towerPos = { "xoooxo", "xoooxo", "xoooxo", "xoxoox", "xoxoox" };
//		{"x#o#o#o#x#o","x#o#o#o#x#x","x#o#o#o#x#x","x#o#x#o#o#x","x#o#x#o#o#x"}
		int[] mn = { 6, 5 };
		System.out.println(landingPosition(mn, towerPos));
	}

	public static int landingPosition(int[] input1, String[] input2) {
		if(input2 == null || input2.length < input1[1] || input2[0].length() < input1[0]) {
			return -1;
		}
		String[] result = new String[input1[1]];
		int max = 0;
		for (int i = 0; i < input2.length; i++) {
			for (int j = i+1; j < input2.length; j++) {
				int commonStrngs = getLongestCommonSubstring(input2[i].replaceAll("#", ""), input2[j].replaceAll("#", ""));
				if (max < commonStrngs) {
					max = commonStrngs;
				}
			}
		}
		return max;
		// Write code here

	}
	
	public static int getLongestCommonSubstring(String a, String b){
		int m = a.length();
		int n = b.length();
	 
		int max = 0;
	 
		int[][] dp = new int[m][n];
	 
		for(int i=0; i<m; i++){
			for(int j=0; j<n; j++){
				if(a.charAt(i) == b.charAt(j) && String.valueOf(b.charAt(j)).equalsIgnoreCase("o")){
					if(i==0 || j==0){
						dp[i][j]=1;
					}else{
						dp[i][j] = dp[i-1][j-1]+1;
					}
	 
					if(max < dp[i][j])
						max = dp[i][j];
				}
	 
			}
		}
	 
		return max;
	}

}
