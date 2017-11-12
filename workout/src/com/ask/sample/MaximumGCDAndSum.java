package com.ask.sample;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaximumGCDAndSum {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] A = new int[n];
		for (int A_i = 0; A_i < n; A_i++) {
			A[A_i] = in.nextInt();
		}
		int[] B = new int[n];
		for (int B_i = 0; B_i < n; B_i++) {
			B[B_i] = in.nextInt();
		}
		int res = maximumGcdAndSum(A, B);
		System.out.println(res);
		in.close();
	}

	private static int maximumGcdAndSum(int[] a, int[] b) {
		// TODO Auto-generated method stub
		int maxGCD = 0;
		int m = a.length;
		int n = b.length;
//		int[][] gcdArray = new int[m][n]; 
		int lstI = 0;
		int lstJ = 0;
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				int gcd = GCDOfTwoNum(a[i], b[j]);
//				gcdArray[i][j] = gcd;
				if (gcd > 0 && gcd > maxGCD) {
					maxGCD = gcd;
					lstI = i;
					lstJ = j;
				}
			}
		}
		int maxSum = a[lstI] + b[lstJ];
//		for (int i = 0; i < m; i++) {
//			for (int j = 0; j < n; j++) {
//				if (gcdArray[i][j] == maxGCD) {
//					maxSum = Math.max(maxSum, a[i]+b[j]);
//				}
//			}
//			
//		}
		return maxSum;
	}

	static int GCDOfTwoNum(int n1, int n2) {
		int gcd = 0;
		for (int i = 1; i <= n1 && i <= n2; ++i) {
			if (n1 % i == 0 && n2 % i == 0)
				gcd = i;
		}
		return gcd;
	}
}
