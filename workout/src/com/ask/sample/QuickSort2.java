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
public class QuickSort2 {

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
        quickSort(ar);
	}
	
	 static void printArray(int[] ar) {
         for(int n: ar){
            System.out.print(n+" ");
         }
           System.out.println("");
      }
	 
	 
	 static void quickSort(int[] ar) {
			// TODO Auto-generated method stub
			int pivot = ar[0];
			List<Integer> rightArray = new ArrayList<Integer>();
			List<Integer> leftArray = new ArrayList<Integer>();
			List<Integer> equalArray = new ArrayList<Integer>();
			if (ar.length > 2) {
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
			quickSort(resultArray);
			} else {
				if (ar[0] > ar[1]) {
					int temp = ar[0];
					ar[0] = ar[1];
					ar[1] = temp;
					printArray(ar);
				}
			}
			
			
		}   

}
