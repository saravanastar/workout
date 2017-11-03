/**
 * 
 */
package com.ask.sample;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author sxa8465
 *
 */
public class Factorial {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		BigInteger fact = new BigInteger("1");
		 for(int i=1;i<=number;i++){    
		      fact=fact.multiply(new BigInteger(String.valueOf(i))) ;   
		  }
		 System.out.println(fact.toString());
		 in.close();
	}
	

}
