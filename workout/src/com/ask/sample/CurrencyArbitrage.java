/**
 * 
 */
package com.ask.sample;

import java.util.Arrays;

/**
 * @author sahar8
 *
 */
public class CurrencyArbitrage {
	
	public static final int USD_AMOUNT = 100000;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] quotes = {"1.1837 1.3829 0.6102","1.1234 1.2134 1.2311"};
		int[] array = arbitrage(quotes);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
	
	static int[] arbitrage(String[] quotes) {
		int outputPos = 0;
		int[] outputAray = new int[quotes.length];
		for (int i = 0; i < quotes.length; i++) {
//			double[] quoteRates = Arrays.stream(quotes[i].split(" ")).map(String::trim).mapToDouble(Double::parseDouble)
//					.toArray();
			String[] quoteRates = quotes[i].split(" ");
			double conversionProfitRate = USD_AMOUNT;
			for (String quoteConverstion : quoteRates) {
				conversionProfitRate = conversionProfitRate/Double.valueOf(quoteConverstion);
			}
			
			if (conversionProfitRate-USD_AMOUNT > 0) {
				outputAray[outputPos]  = (int) (conversionProfitRate-USD_AMOUNT);
			} else {
				outputAray[outputPos] = 0;
			}
			outputPos++;
		}
		
		return outputAray;


    }

}
