/**
 * 
 */
package com.ask.sample;

import java.util.Scanner;

/**
 * @author sahar8
 *
 */
public class Kangaroos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int x1 = in.nextInt();
		int v1 = in.nextInt();
		int x2 = in.nextInt();
		int v2 = in.nextInt();
		if (x2 > x1 && v2 > v1) {
			System.out.println("NO");
		} else {
			boolean flag = false;
			while (x1 <= 10000) {
				x1 = x1+v1;
				x2=x2+v2;
				if (x1 == x2) {
					flag = true;
					break;
				}
			}
			if (flag) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
		in.close();
	}

}
