/**
 * 
 */
package com.ask.sample;

/**
 * @author sxa8465
 *
 */
public class Gcd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gcd gcd = new Gcd();
		System.out.println(gcd.findGcd(20,31));
	}

	private int findGcd(int a, int b) {
		if (a == 0) 
            return b;
         
        return findGcd(b%a,a);
	}

}
