/**
 * 
 */
package com.ask.sample;

/**
 * @author sxa8465
 *
 */
public class SumOfBalls {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public static int ball_count(int[] input1,int input2,int input3)
	    {
		 int sum = 0;
		 for (int i = 0; i < input1.length; i++) {
			 for (int j = i+1; j < input1.length; j++) {
				 for (int j2 = j+1; j2 < input1.length; j2++) {
					 sum = input1[i] + input1[j] +input1[j2] ;
					 if ( sum >= 2*input2) {
							return sum;
						}
				}
				
			}
			
		}
			return 0;
		    //Write code here
	    }

}
