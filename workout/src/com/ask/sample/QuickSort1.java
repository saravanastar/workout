/**
 * 
 */
package com.ask.sample;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sahar8
 *
 */
public class QuickSort1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		 Scanner in = new Scanner(System.in);
//         int n = in.nextInt();
//         int[] ar = new int[n];
//         for(int i=0;i<n;i++){
//            ar[i]=in.nextInt();
//         }
//         partition(ar);
        int[] ar = {1,0,33,22,1000,719,2,4,5,-2};
		QuickSort1 quickSort1 = new QuickSort1();
		quickSort1.quickSortPivotLastElement(ar, 0, ar.length-1);
        printArray(ar);
//         in.close();

	}

	private static void partition(int[] ar) {
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

     private void quickSortPivotLastElement(int[] input, int left, int right) {
		int init = left;
		 int end = right;
		if (left < right) {
			int pivot = input[right];
			while (left < right) {
				if (input[left] < pivot) {
					left++;
					continue;
				}
				if (input[left] > pivot) {
				    if (left+1 == right) {
                        int tmp = input[right];
                        input[right] = input[left];
                        input[left] = tmp;
                        right--;
                    } else {
                        int tmp = input[right - 1];
                        input[right - 1] = pivot;
                        input[right] = input[left];
                        input[left] = tmp;
                        right--;
                    }
				}
			}
            right = right==end ? right: right+1;
			quickSortPivotLastElement(input, init, right-1);
			quickSortPivotLastElement(input, right, end);

		}
	 }

}
