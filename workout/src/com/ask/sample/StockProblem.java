package com.ask.sample;

public class StockProblem {
	
	public static void main(String[] args) {
		int[] stocksArray = {100 ,180 ,260 ,310, 40 ,535, 695};
//		int[] stocksArray = {23, 13 ,25, 29, 33 ,19, 34, 45, 65, 67};
		StockProblem stockProblem = new StockProblem();
		stockProblem.findProfit(stocksArray,0);
		
	}

	private void findProfit(int[] stocksArray, int i) {
		int min = stocksArray[0];
		int max = stocksArray[0];
		for (int j = 1; j < stocksArray.length; j++) {
			if (stocksArray[j] < min ) {
					min = stocksArray[j];
			}
			if (stocksArray[j] > max) {
				max = stocksArray[j];
			}
			if (j+1 < stocksArray.length) {
				if (stocksArray[j+1]  < max) {
					int[] tempArray = new int[stocksArray.length-j];
					System.out.println(min + " " + max);
					System.arraycopy(stocksArray, j, tempArray, 0, stocksArray.length-j);
					findProfit(tempArray, j+1);
					break;
				}
			}
			if (j+1 == stocksArray.length) {
				System.out.println(min + " " + max);
			}
			
		}
	}

}
