/**
 * 
 */
package com.ask.sample;

/**
 * @author sahar8
 *
 */
public class KindergardenCandy {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] score = {1,2,2};
		int[] score1 = {2,4,2,6,1,7,8,9,2,1};
		System.out.println(distributedCandy(score1));
		

	}
	static int distributedCandy(int[] score) {
		int nearestMaxScore = 2;
		int maxCandys = 1;
		boolean foundNearestMax = false;
		for (int i = 1; i < score.length; i++) {
			
			if (score[i] > score[i-1]) {
				if(foundNearestMax) {
					nearestMaxScore +=1 ;
				}
				maxCandys+=nearestMaxScore;
				
				foundNearestMax = true;
			} else {
				maxCandys+=1;
				nearestMaxScore=2;
				foundNearestMax = false;
			}
			if (i < score.length-1 && score[i] > score[i+1] && !foundNearestMax) {
				maxCandys+=1;
			}
		}
		return maxCandys;
		
	}

}
