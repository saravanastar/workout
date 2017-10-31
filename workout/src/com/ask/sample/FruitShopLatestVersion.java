package com.ask.sample;

import java.util.ArrayList;
import java.util.List;

public class FruitShopLatestVersion {

	public int checkWinner(List<List<String>> codeList, List<String> shoppingCart) {
		int result = 1;
		if (codeList ==null || codeList.isEmpty() || shoppingCart ==null || shoppingCart.isEmpty()) {
			return 0;
		}
		for (int i = 0; i < codeList.size(); i++) {
			List<String> codes = codeList.get(i);
				for (int j = 0; j <  codes.size(); j++) {
					if (shoppingCart == null || shoppingCart.isEmpty()) {
						return 0;
					}
					for (int j2 = 0; j2 < shoppingCart.size(); j2++) {
						if (shoppingCart.get(j2).equalsIgnoreCase(codes.get(j)) || codes.get(j).equalsIgnoreCase("anything")) {
							shoppingCart = shoppingCart.subList(1, shoppingCart.size());
							break;
						} else {
							shoppingCart = shoppingCart.subList(1, shoppingCart.size());
							j2=-1;
							if (codes.size() > shoppingCart.size()) {
								return 0;
							}
							continue;
							
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
//		group1.add("apple");
//		group1.add("apple");
//		containList.add(group1);
//		
//		List<String> group2= new ArrayList<String>();
//		group2.add("banana");
//		group2.add("anything");
//		group2.add("banana");
//		containList.add(group2);
//		
//		shoppingCart.add("apple");
//		shoppingCart.add("apple");
//		shoppingCart.add("orange");
//		shoppingCart.add("apple");
//		
//		shoppingCart.add("banana");
//		shoppingCart.add("orange");
//		shoppingCart.add("banana");
		group1.add("orange");
		containList.add(group1);
		
		List<String> group2= new ArrayList<String>();
		group2.add("apple");
		group2.add("apple");
		containList.add(group2);
		
		List<String> group3= new ArrayList<String>();
		group3.add("banana");
		group3.add("orange");
		group3.add("apple");
		
		containList.add(group3);
		
		List<String> group4= new ArrayList<String>();
		group3.add("banana");
		
		containList.add(group4);
		
		shoppingCart.add("orange");
		shoppingCart.add("apple");
		shoppingCart.add("apple");
		
		shoppingCart.add("banana");
		shoppingCart.add("orange");
		shoppingCart.add("apple");
		
		shoppingCart.add("banana");
		
		System.out.println(new FruitShopLatestVersion().checkWinner(containList, shoppingCart));
		
	}
}
