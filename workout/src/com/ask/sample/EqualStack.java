package com.ask.sample;

import java.io.IOException;
import java.util.*;
import java.util.stream.IntStream;



public class EqualStack {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        String[] n1N2N3 = scanner.nextLine().split(" ");
//
//        int n1 = Integer.parseInt(n1N2N3[0].trim());
//
//        int n2 = Integer.parseInt(n1N2N3[1].trim());
//
//        int n3 = Integer.parseInt(n1N2N3[2].trim());
//
//        int[] h1 = new int[n1];
//
//        String[] h1Items = scanner.nextLine().split(" ");
//
//        for (int h1Itr = 0; h1Itr < n1; h1Itr++) {
//            int h1Item = Integer.parseInt(h1Items[h1Itr].trim());
//            h1[h1Itr] = h1Item;
//        }
//
//        int[] h2 = new int[n2];
//
//        String[] h2Items = scanner.nextLine().split(" ");
//
//        for (int h2Itr = 0; h2Itr < n2; h2Itr++) {
//            int h2Item = Integer.parseInt(h2Items[h2Itr].trim());
//            h2[h2Itr] = h2Item;
//        }
//
//        int[] h3 = new int[n3];
//
//        String[] h3Items = scanner.nextLine().split(" ");
//
//        for (int h3Itr = 0; h3Itr < n3; h3Itr++) {
//            int h3Item = Integer.parseInt(h3Items[h3Itr].trim());
//            h3[h3Itr] = h3Item;
//        }
//
//        int result = equalStacks(h1, h2, h3);
//
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();
        int[] h1 = {3,2,1,1,1};
        int[] h2 = {4,3,2};
        int[] h3 = {1,1,4,1};
//        equalStacks(h1,h2,h3);
        System.out.println(equalStacks(h1,h2,h3));
    }

    private static int equalStacks(int[] h1, int[] h2, int[] h3) {
        List<Integer> h1FibL = findFib(h1);
        Collections.sort(h1FibL,Collections.reverseOrder());

        List<Integer> h2FibL = findFib(h2);
        Collections.sort(h2FibL,Collections.reverseOrder());

        List<Integer> h3FibL = findFib(h3);
        Collections.sort(h3FibL,Collections.reverseOrder());

        for (Integer value: h1FibL ) {
            if (h2FibL.contains(value) && h3FibL.contains(value)) {
                return value;
            }
        }

        return 0;
    }

    private static List<Integer> findFib(int[] h1) {
        int index = h1.length-1;
        int[] tmpArray = new int[h1.length];
        tmpArray[index] = h1[h1.length-1];
        List<Integer> resultSet = new ArrayList<>();

        for (int i = h1.length-2; i >=0; i--) {
            index--;
            int tmpNum = h1[i] + tmpArray[i+1];
            tmpArray[index] = tmpNum;
            resultSet.add(tmpNum);
        }


        return resultSet;
    }

    /*
    * Complete the equalStacks function below.
    */
    static int equalStacksMySolution(int[] h1, int[] h2, int[] h3) {
        int h1Sum = Arrays.stream(h1).sum();
        int h2Sum = Arrays.stream(h2).sum();
        int h3Sum = Arrays.stream(h3).sum();
        if (h1Sum != h2Sum && h2Sum != h3Sum) {

            for (int i = 0; i < h1.length; i++) {
                int topNode = IntStream.range(0,i).map(j -> h1[j]).sum();
                if (balanceOtherStack(h2, h1Sum-topNode, h2Sum) && balanceOtherStack(h3, h1Sum-topNode, h3Sum)) {
                    return h1Sum-topNode;
                }
            }
        }


        return 0;
    }

    private static boolean balanceOtherStack(int[] h, int reminingBalance, int hSum) {
        for (int i = 0; i < h.length; i++) {
            int topNode = IntStream.range(0,i).map(j -> h[j]).sum();
            if ((hSum-topNode) == reminingBalance) {
                return Boolean.TRUE;
            }
            if ((hSum-topNode) < reminingBalance) {
                return Boolean.FALSE;
            }
        }
        return Boolean.FALSE;
    }
}

/*

How about this logic:

Step I. get the 3 array and reverse them, create a new array out of an existing array with each element is sum of all the previous elements. eg: [3,2,1,1,1] -> [1,1,1,2,3] -> [1,2,3,5,8]

So the 3 new array formed would be [1,2,3,5,8] [2,5,9] [1,5,6,7]

Step II. Again reverse the array [8,5,3,2,1] [9,5,2] [7,6,5,1]

Step III. Take the smallest array i.e. [9,5,2] traverse the smallest array and search element in the other 2 array - if the element is existing in other 2 array, STOP there and return the number.

Eg. Here I start with elem - 9 : Which is not existing in other 2 array. Next I start with elem - 5 : it is existing in other 2 array.

Wolla! 5 is my NUMBER!
 */
