/**
 * 
 */
package com.ask.sample;

import java.util.Scanner;

/**
 * @author sxa8465
 *
 */
public class SavePrisnors {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int totalTestCase = in.nextInt();
		for (int i = 0; i < totalTestCase; i++) {
			int totalPrisnor = in.nextInt();
			int totalSweets = in.nextInt();
			int startNumber = in.nextInt();
			int temp = Math.abs(startNumber + totalSweets)-1;
			if (temp > totalPrisnor) {
				int result =  (Math.abs(totalSweets - (totalPrisnor - startNumber))%totalPrisnor)-1;
				if (result ==0 ) {
					System.out.println(totalPrisnor);
				} else {
					System.out.println(result);
				}

			} else {
				System.out.println(startNumber + totalSweets - 1);
			}
		}
		in.close();
	}

}
