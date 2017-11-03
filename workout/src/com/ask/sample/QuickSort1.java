/**
 * 
 */
package com.ask.sample;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author sahar8
 *
 */
public class QuickSort1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);
         int n = in.nextInt();
         int[] ar = new int[n];
         for(int i=0;i<n;i++){
            ar[i]=in.nextInt(); 
         }
         partition(ar);
         in.close();

	}

	private static void partition(int[] ar) {
		// TODO Auto-generated method stub
		int pivot = ar[0];
		List<Integer> rightArray = new ArrayList<Integer>();
		List<Integer> leftArray = new ArrayList<Integer>();
		List<Integer> equalArray = new ArrayList<Integer>();
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] < pivot) {
				leftArray.add(ar[i]);
			} else if (ar[i] > pivot) {
				rightArray.add(ar[i]);
			} else {
				equalArray.add(ar[i]);
			}
		}
		leftArray.addAll(equalArray);
		leftArray.addAll(rightArray);
		int[] resultArray = new int[leftArray.size()];
		for (int i = 0; i < leftArray.size(); i++) {
			resultArray[i] = leftArray.get(i);
		}
		printArray(resultArray);
		
	}
	
	static void printArray(int[] ar) {
        for(int n: ar){
           System.out.print(n+" ");
        }
          System.out.println("");
     }

}
