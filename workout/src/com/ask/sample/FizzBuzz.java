/**
 * 
 */
package com.ask.sample;

/**
 * @author sahar8
 *
 */
public class FizzBuzz {

	/**
	 * @param args
	 */
	public static final String FIZZ = "Fizz";
	public static final String BUZZ = "Buzz";
	public static final String WOOF = "Woof";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FizzBuzz().solution(24);

	}

	public void solution(int N) {
		StringBuilder resultString = new StringBuilder("");
		for (int i = 1; i <= N; i++) {
			resultString.setLength(0);
			if (i % 3 == 0) {
				resultString.append(FIZZ);
			}
			if (i % 5 == 0) {
				resultString.append(BUZZ);
			}
			if (i % 7 == 0) {
				resultString.append(WOOF);
			}
			if (resultString.length() == 0) {
				resultString.append(i);
			}
			System.out.println(resultString.toString());
		}
	}

}
