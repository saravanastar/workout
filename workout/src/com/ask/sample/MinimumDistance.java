package com.ask.sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumDistance {

    public static void main(String[] args) {
        MinimumDistance minimumDistance = new MinimumDistance();

        List<List<Integer>> inputList =  new ArrayList<>();
        inputList.add(Arrays.asList(1,0,0));
        inputList.add(Arrays.asList(1,0,0));
        inputList.add(Arrays.asList(1,9,1));

//        List<List<Integer>> inputList =  new ArrayList<>();
//        inputList.add(Arrays.asList(1,1,1,1));
//        inputList.add(Arrays.asList(0,1,1,1));
//        inputList.add(Arrays.asList(0,1,0,1));
//        inputList.add(Arrays.asList(1,1,9,1));
//        inputList.add(Arrays.asList(0,0,1,1));

        System.out.println(minimumDistance.minimumDistance(3,3,inputList));
    }

    int minimumDistance(int numRows, int numColumns, List<List<Integer>> area) {
        int currentRow = 0, currentCol = 0;
        return findVal(area, currentRow, currentCol, 0,
                numRows, numColumns);
    }

    int findVal(List<List<Integer>> area, int currentRow, int currentCol, int weight,
                int numRows, int numCols) {
        int minPath = -1;
        if (currentRow >= numRows || currentCol >= numCols) {
            return minPath;
        }
        int currentVal = area.get(currentRow).get(currentCol);

        if (currentVal == 9) {
            return weight;
        }
        if (currentVal != 0) {
            if (currentRow == 0) {
                if (currentCol < numCols) {
                    int val1 = findVal(area, currentRow, currentCol + 1, weight + 1, numRows, numCols);
                    int val2 = findVal(area, currentRow + 1, currentCol, weight + 1, numRows, numCols);
                    if (val1 > 0 && val2 > 0) {
                        minPath = Math.max(val1, val2);
                    } else {
                        if (val1 > 0) {
                            minPath = val1;
                        } else {
                            minPath = val2;
                        }
                    }
                }
            } else if (currentRow < numRows && currentRow < numRows) {
                int val1 = findVal(area, currentRow, currentCol + 1, weight + 1, numRows, numCols);
                int val2 = findVal(area, currentRow + 1, currentCol, weight + 1, numRows, numCols);
                if (val1 > 0 && val2 > 0) {
                    minPath = Math.max(val1, val2);
                } else {
                    if (val1 > 0) {
                        minPath = val1;
                    } else {
                        minPath = val2;
                    }
                }

            }
        }
        return minPath;
    }
}
