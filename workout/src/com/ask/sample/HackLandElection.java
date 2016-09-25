/**
 * 
 */
package com.ask.sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;


/**
 * @author sahar8
 *
 */
public class HackLandElection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] electionWinner = {"Victor","Veronica","Ryan","Dave","Maria","Maria","Farah","Farah","Ryan","Veronica"};
		electionWinner(electionWinner);
	}
	
	static String electionWinner(String[] votes) {
		String winner = null;
		int maxCount = 0;
		List<String> votersList = Arrays.asList(votes);
		HashMap<Integer,List<String>> containerMap = new HashMap<Integer,List<String>>();
		for (String voterName : votersList) {
			int count = Collections.frequency(votersList,voterName);
			if (containerMap.containsKey(count)) {
				List<String> elctionersList = containerMap.get(count);
				elctionersList.add(voterName);
			}  else {
				List<String> elctionersList = new ArrayList<String>();
				elctionersList.add(voterName);
				containerMap.put(count, elctionersList);
			}
			if (count > maxCount) {
				maxCount = count;
			}
		}
		List<String> elctionersList = containerMap.get(maxCount);
		Collections.sort(elctionersList);
		winner = elctionersList.get(elctionersList.size()-1);
//		System.out.println(winner);
		return winner;


    }
}
