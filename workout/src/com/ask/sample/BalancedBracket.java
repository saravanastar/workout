package com.ask.sample;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class BalancedBracket {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            String s = in.next();
            String result = isBalanced(s);
            System.out.println(result);
        }
        in.close();
    }

    private static String isBalanced(String s) {
        if (s != null && s.trim().length() > 0) {
            Stack<String> bracketStack = new Stack<>();
            Map<String, String> validBracket = buildValidStringMap();
            for (int i = 0; i < s.length(); i++) {
                String tmp = String.valueOf(s.charAt(i));
                if (validBracket.containsKey(tmp)) {
                    bracketStack.push(tmp);
                } else {
                    if (!bracketStack.isEmpty()) {
                        String checkString = bracketStack.pop();
                        if (!validBracket.get(checkString).equalsIgnoreCase(tmp)) {
                            return "NO";
                        }
                    } else {
                        return "NO";
                    }
                }
            }
            if (bracketStack.isEmpty()) {
                return "YES";
            }
        }

        return "NO";
    }
    static Map<String,String> buildValidStringMap() {
        Map<String, String> validKey = new HashMap<>();
        validKey.put("(",")");
        validKey.put("{","}");
        validKey.put("[","]");

        return validKey;
    }
}
