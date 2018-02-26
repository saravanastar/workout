/**
 * 
 */
package com.ask.sample;

import java.util.List;
import java.util.Random;

/**
 * @author sxa8465
 *
 */
public class CardDeck {
	List<Card> cards = null;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	CardDeck() {
		// load all the cards
		
	}
	public List<Card> shuffleCard() {
		int randomNumber = 0;
		Random randomObject = new Random();
		for (int currentIndex = 1; currentIndex < cards.size(); currentIndex++) {
			randomNumber = randomObject.nextInt(currentIndex);
			//currentIndex = 25
			// random = 10
			moveOver(randomNumber, currentIndex);
		}
		return cards;
		
	}
	private void moveOver(int randomNumber, int currentIndex) {
		if (randomNumber < cards.size() && currentIndex < cards.size()) {
			Card tmepObj = cards.get(randomNumber);
			cards.add(randomNumber, cards.get(currentIndex));
			cards.add(currentIndex, tmepObj);
		}
		
	}

}


class Card {
	private String value;
	
	private String type;
}