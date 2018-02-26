/**
 * 
 */
package com.ask.sample;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author sxa8465
 *
 */
public class PackNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = { 5, 5, 7, 7, 7, 3, 2 };
		packNumbers(input);

	}

	static String[] packNumbers(int[] arr) {

		int count = 0;
		LinkedHashMap<String, Integer> resultMap = new LinkedHashMap<String, Integer>();
		for (int i = 0; i < arr.length; i++) {
			Integer countValue = resultMap.get(String.valueOf(arr[i]));

			if (countValue == null) {
				resultMap.put(String.valueOf(arr[i]), 1);
			} else {
				if (i > 0 && arr[i] == arr[i - 1]) {
					countValue = countValue + 1;
					resultMap.put(String.valueOf(arr[i]), countValue);
				} else {
					resultMap.put(String.valueOf(arr[i]) + "d", null);
				}
			}
		}

		String[] resultArray = new String[resultMap.entrySet().size()];

		Set<Entry<String, Integer>> entrySet = resultMap.entrySet();
		Iterator<Entry<String, Integer>> iterate = entrySet.iterator();

		while (iterate.hasNext()) {
			Map.Entry<String, Integer> entry = iterate.next();
			Integer value = entry.getValue();
			if (value != null) {
				if (value > 1) {
					resultArray[count] = entry.getKey() + ":" + value;
				} else {
					resultArray[count] = entry.getKey() + "";
				}
				count++;
			} else {
				resultArray[count] = entry.getKey().replaceAll("d", "") + "";
				
			}
		}

		return resultArray;

	}

}
