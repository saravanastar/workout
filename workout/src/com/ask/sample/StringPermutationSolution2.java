package com.ask.sample;

public class StringPermutationSolution2 {

    public static void main(String[] args) {
        StringPermutationSolution2 stringPermutationRetry = new StringPermutationSolution2();
        String inputString = "ABC";
        int fixNumber = 0;
        stringPermutationRetry.findPermutation(inputString, fixNumber);
    }

    private void findPermutation(String inputString, int fixNumber) {
        if (fixNumber < inputString.length()-1) {
//            System.out.println(inputString);

            for (int index = fixNumber; index < inputString.length();index++) {
                String resultString = swapChar(inputString, fixNumber, index);
                System.out.println(resultString);
                findPermutation(resultString, fixNumber+1);
            }
        }


    }

    private String swapChar(String inputString, int fixNumber, int index) {
        char[] charArray = inputString.toCharArray();
        char tempValue = charArray[fixNumber];
        charArray[fixNumber] = charArray[index];
        charArray[index] = tempValue;
        return String.valueOf(charArray);
    }
}
