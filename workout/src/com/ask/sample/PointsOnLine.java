/**
 * 
 */
package com.ask.sample;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author sahar8
 *
 */
public class PointsOnLine {

	/**
	 * @param args
	 */
	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        Set horizontalSet = new HashSet();
	        Set verticalSet = new HashSet();
	        int n = in.nextInt();
	        for(int a0 = 0; a0 < n; a0++){
	            int x = in.nextInt();
	            int y = in.nextInt();
	            horizontalSet.add(x);
	            verticalSet.add(y);
	        }
	        if (horizontalSet.size() == 1 || verticalSet.size() == 1) {
	        	System.out.println("YES");
	        } else {
	        	System.out.println("NO");
	        }
	    }

}
