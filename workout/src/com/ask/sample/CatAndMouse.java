/**
 * 
 */
package com.ask.sample;

import java.util.Scanner;

/**
 * @author sxa8465
 *
 */
public class CatAndMouse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();
            if (Math.abs(z-x) == Math.abs(z-y)) {
            	System.out.println("Mouse C");
            } else if (Math.abs(z-x) < Math.abs(z-y)) {
            	System.out.println("Cat B");
            } else if (Math.abs(z-x) > Math.abs(z-y)) {
            	System.out.println("Cat A");
            }
        }
        in.close();

	}

}
