/**
 * 
 */
package com.ask.sample;

import java.util.Scanner;

/**
 * @author sxa8465
 *
 */
public class JumpingCloudsRevisted {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        in.close();
        int currentPosition = -1;
        int totalEnergy = 100;
        while(currentPosition != 0) {
        	if(currentPosition == -1) {
        		currentPosition = 0;
        	}
        	currentPosition = currentPosition+k;
        	if (currentPosition > n-1) {
        		currentPosition = currentPosition%n;
//        		currentPosition-=1;
        	}
        	if(c[currentPosition] == 1) {
        		totalEnergy-=3;
        	} else {
        		totalEnergy-=1;
        	}
        }
        System.out.println(totalEnergy);
	}

}
