package com.ask.sample;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int m = in.nextInt();
	        int[] temp = new int[n];
	        Arrays.fill(temp, 0);
	        for(int a0 = 0; a0 < m; a0++){
	            int a = in.nextInt();
	            int b = in.nextInt();
	            int k = in.nextInt();
	          
	            if (a==b) {
                    temp[a-1]+=k; 
                     continue;
                 }
	            for (int i = a-1; i < b; i++) {
					temp[i]+=k;
				}
	        }
	        System.out.println(Arrays.stream(temp).max().getAsInt());
	        in.close();

	}

}
