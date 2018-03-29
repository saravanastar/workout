package com.ask.sample;

public class CoinChangeProblem {
    public static void main(String[] args) {
        int arr[] = {2,5,3,6};

        int m = arr.length;
        int n = 10;
        System.out.println(findNumber(arr,n));
    }

    private static int findNumber(int[] arr, int n) {
        int[][] tempArry = new int[arr.length][n+1];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <= n; j++) {
                if(j==0 || i==0) {
                    tempArry[i][j] = 1;
                    continue;
                }
                if (j >= arr[i]) {
                    tempArry[i][j] = tempArry[i][j-arr[i]] + tempArry[i-1][j];
                } else {
                    tempArry[i][j] = tempArry[i][j-1];
                }
            }
        }
        return tempArry[arr.length-1][n];
    }
}
