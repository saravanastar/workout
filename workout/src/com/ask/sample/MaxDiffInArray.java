package com.ask.sample;

public class MaxDiffInArray {
    public static void main(String[] args) {
//    int[] input = {7,2,3,10,2,4,8,1};
        int[] input = {5, 10, 8, 7, 6, 5};


//        System.out.println(new MaxDiffInArray().maxDifference(input));
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

    int maxDifference2(int[] a) {
        int result = -1;
        boolean smallerItemFlag = false;
        if (a.length > 0) {
            int min = a[0], max=a[0];

            for(int index=1; index< a.length; index++) {
                if (a[index] > max) {
                    max = a[index];

                }else  {
                    if (a[index] > max) {
                        smallerItemFlag = true;
                    }
                    max = a[index];
                    min = a[index];

                }
                result = Math.max(result, max-min);
            }
            if (smallerItemFlag) {
                return -1;
            }
            if (min < max) {
                return max-min;
            }
        }
        return result;

    }
}
