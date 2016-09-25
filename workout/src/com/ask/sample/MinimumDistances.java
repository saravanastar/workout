/**
 * 
 */
package com.ask.sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @author sahar8
 *
 */
public class MinimumDistances {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int A[] = new int[n];
        for(int A_i=0; A_i < n; A_i++){
            A[A_i] = in.nextInt();
        }
        List<Integer> resultList = new ArrayList<Integer>();
        for (int i = 0; i < A.length; i++) {
			for (int j = i+1; j < A.length; j++) {
				if (A[i] == A[j]) {
					resultList.add(Math.abs(i-j));
				}
			}
		}
        Collections.sort(resultList);
        if (resultList.size() > 0) {
        	System.out.println(resultList.get(0));
        } else {
        	System.out.println("-1");
        }
	}

}
