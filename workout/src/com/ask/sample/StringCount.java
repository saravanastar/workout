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
 * @author sahar8
 *
 */
public class StringCount {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sampleString = "abbaccdbacd";
		LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
		for (int i = 0; i < sampleString.length(); i++) {
			String charString = String.valueOf(sampleString.charAt(i));
			if (!map.containsKey(charString)) {
				int count = 0;
				for (int j = 0; j < sampleString.length(); j++) {
					if(charString.equalsIgnoreCase(String.valueOf(sampleString.charAt(j)))){
						count++;
					}
				}
				map.put(charString, count);
			}
		}
		
		Set<Entry<String, Integer>> set = map.entrySet();
		Iterator<Entry<String, Integer>> iterate = set.iterator();
		String output = "";
		while(iterate.hasNext()) {
			Map.Entry<String, Integer> entry = iterate.next();
			output = output + entry.getKey()+entry.getValue();
		}

		System.out.println(output);
	}

}
