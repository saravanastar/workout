package com.ask.sample;

import java.util.ArrayList;
import java.util.List;

public class DeltaEncoding {
	
	public static void main(String[] args) {
		
	}

	 static int[] delta_encode(int[] array) {
		 
		 List<Integer> result = new ArrayList<Integer>();
		 if (array.length > 0) {
			 result.add(array[0]);
		 }
		 
		 for (int i = 1; i < array.length; i++) {
			int resultNum = array[i] - array[i-1];
			if (Math.abs(resultNum) > 127) {
				result.add(-128);
			}
			result.add(resultNum);
		}
		return result.stream().mapToInt(i -> i).toArray();

	    }
}
