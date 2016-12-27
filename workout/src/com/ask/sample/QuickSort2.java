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
        quickSort2(ar);
	}
	
	 static void printArray(int[] ar) {
         for(int n: ar){
            System.out.print(n+" ");
         }
           System.out.println("");
      }
	 
	 static int[] quickSort2(int[] ar) {
			// TODO Auto-generated method stub
		 if (ar.length > 0) {
			int pivot = ar[0];
			int[] leftArray = new int[0];
			int[] rightArray = new int[0];
			int leftIndex = 0;
			int rightIndex = 0;
			 if (ar.length > 2) {
				for (int i = 1; i < ar.length; i++) {
					if (ar[i] < pivot) {
						if(leftIndex+1 > leftArray.length) {
							int[] tempArray = new int[leftIndex+1];
							System.arraycopy(leftArray, 0, tempArray, 0, leftIndex);
							leftArray = tempArray;
						}
						leftArray[leftIndex] = ar[i];
						leftIndex++;
					}
					
					if (ar[i] > pivot) {
						if(rightIndex+1 > rightArray.length) {
							int[] tempArray = new int[rightIndex+1];
							System.arraycopy(rightArray, 0, tempArray, 0, rightIndex);
							rightArray  = tempArray;							
						} 
						rightArray[rightIndex] = ar[i];
						rightIndex++;
						
					}
					
				}
				printArray(leftArray);
				return mergeArray(quickSort2(leftArray), pivot, quickSort2(rightArray));
			} else {
				if (ar.length > 1) {
					if (ar[0] > ar[1]) {
						int temp = ar[0];
						ar[0] = ar[1];
						ar[1] = temp;
					}
				}
				 return ar;
			}
			
		 }
		 return ar;
		}   
	 
	 private static int[] mergeArray(int[] leftArray, int pivot, int[] rightArray) {
		 int[] resultArray = new int[leftArray.length+rightArray.length+1];
		 int index = 0;
		 for (int i = 0; i < leftArray.length; i++) {
			 resultArray[index] = leftArray[i];
			 index++;
		}
		 resultArray[index] = pivot;
		 index++;
		 for (int i = 0; i < rightArray.length; i++) {
			 resultArray[index] = rightArray[i];
			 index++;
		}
		 printArray(resultArray);
		return resultArray;
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
