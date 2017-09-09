package com.ask.sample;

import java.util.ArrayList;
import java.util.List;

public class FruitShop {

	public int checkWinner(List<List<String>> codeList, List<String> shoppingCart) {
		int result = 1;
		if (codeList ==null || codeList.isEmpty() || shoppingCart ==null || shoppingCart.isEmpty()) {
			return 0;
		}
		int shoppedFruitIndex = 0;
		for (int i = 0; i < codeList.size(); i++) {
			boolean isCaughtGroup =false;
			List<String> codes = codeList.get(i);
			if (shoppingCart.size() - shoppedFruitIndex < codes.size()) {
				return 0;
			}
			for (int j = 0; j < codes.size(); j++) {
				String fruitName = codes.get(j);
				
				for ( int index=shoppedFruitIndex; index < shoppingCart.size(); index++) {
					String shoppedFruit = shoppingCart.get(index);
					if (fruitName.equalsIgnoreCase("anything")) {
						shoppedFruitIndex=index+1;
						isCaughtGroup = true;
						break;
					} else {
						if (fruitName.equalsIgnoreCase(shoppedFruit)) {
							shoppedFruitIndex=index+1;
							isCaughtGroup = true;
							break;
						} else {
							if (!isCaughtGroup) {
								continue;
							} else {
								return 0;
							}
						}
					}
				}
			}
			
		}
		return result;
		
	}
	public static void main(String[] args) {
		List<List<String>> containList = new ArrayList<List<String>>();
		List<String> shoppingCart= new ArrayList<String>();
		List<String> group1= new ArrayList<String>();
		group1.add("apple");
		group1.add("apple");
		containList.add(group1);
		
		List<String> group2= new ArrayList<String>();
		group2.add("banana");
		group2.add("anything");
		group2.add("banana");
		containList.add(group2);
		
		shoppingCart.add("orange");
		shoppingCart.add("apple");
		shoppingCart.add("orange");
		shoppingCart.add("apple");
		
		shoppingCart.add("banana");
		shoppingCart.add("orange");
		shoppingCart.add("banana");
		
		System.out.println(new FruitShop().checkWinner(containList, shoppingCart));
		
	}
}
