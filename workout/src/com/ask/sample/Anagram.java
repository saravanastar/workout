package com.ask.sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Anagram {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String a = scanner.nextLine();
        int result  =0;
        String anagramString = "";
        String b = scanner.nextLine();
        List<Character> dataString = new ArrayList<>();
        char[] temp = a.toCharArray();
        for (int index = 0; index < temp.length; index++) {
            dataString.add(temp[index]);
        }
        temp = b.toCharArray();
        for (int index = 0; index < temp.length ; index++) {
            Arrays.stream(args).collect(Collectors.toList());
            if (dataString.contains(temp[index])) {
                System.out.println(temp[index]);
                result+=2;
                anagramString = anagramString + String.valueOf(temp[index]);
                int removeIndex = dataString.indexOf(temp[index]);
                dataString.remove(removeIndex);
            }
        }
        int length = a.length() + b.length();
        System.out.print(length-result);
        scanner.close();
    }
}
