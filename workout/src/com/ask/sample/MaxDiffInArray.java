package com.ask.sample;

public class MaxDiffInArray {
    public static void main(String[] args) {
    int[] input = {2,3,10,2,4,8,1};
//    int[] input = {5,10,8,7,6,5};
        System.out.println(new MaxDiffInArray().maxDifference(input));
        System.out.println(new MaxDiffInArray().maxDifference1(input));
    }
    int maxDifference(int[] a) {
        int arrayLength = a.length;
        int max = -1;
        if (arrayLength > 0) {
            int left = a[0];
            int right = a[1];

            int currentIndex = 1;

            while(currentIndex < a.length) {
                int next = 0;
                if (currentIndex +1 < a.length) {
                   next = a[currentIndex+1];
                }
                int current = a[currentIndex];
                if (right < left) {
                    left =right;
                    continue;
                }
                if (right-left > 0) {
                    max = Math.max(max, right - left);
                }
                if (current > next) {
                    left = next;

                }
                right = next;
                currentIndex++;
            }
            return max;

        }
        return max;
    }

    int maxDifference1(int[] a) {
        int max = a[1] - a[0];
        int min = a[0];
        int arrLength = a.length;
        int i;
        for (i = 1; i < arrLength; i++) {
            if (a[i] - min > max)
                max = a[i] - min;
            if (a[i] < min)
                min = a[i];
        }
        return max;
    }
}
