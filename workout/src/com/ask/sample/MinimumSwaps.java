package com.ask.sample;

import java.util.Arrays;

public class MinimumSwaps {
    public static void main(String[] args) {
//        int[] input = {3,4,1,2};
        int[] input = {4,3,1,2,4};

        System.out.println(new MinimumSwaps().minimumSwaps(input));
    }

    int minimumSwaps(int[] popularity) {
        int swaps = 0;
        Arrays.stream(popularity).distinct().sorted();
        swaps = popularity.length/2;
        return swaps;
    }
}
