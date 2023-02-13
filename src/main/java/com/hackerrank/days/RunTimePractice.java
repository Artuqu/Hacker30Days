package com.hackerrank.days;

import java.util.HashMap;

public class RunTimePractice {

    public static int findNumbersOfRepetitions(String s, char c) {
//        Linear time: O(n)
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                sum++;
            }
        }
        System.out.println(sum);
        return sum;
    }
    private static int[] findNumbersOfRepetitionsV1(String s, char[] c) {
//       Quad time: O(n*m)
        int[] sums = new int[c.length];
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < c.length; j++) {
                if (s.charAt(i) == c[j]) {
                    sums[j] = sums[j] + 1;
                }
            }
        }
        for (Integer i : sums) {
            System.out.print(i + " ");
        }
        System.out.println();
        return sums;
    }
    private static int[] findNumbersOfRepetitionsV2(String s, char[] c) {
//       Optimal time: O(n+m)
        int[] sums = new int[charArray.length];
        HashMap<Character, Integer> resultMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!resultMap.containsKey(s.charAt(i))) {
                resultMap.put(s.charAt(i), 1);
            } else {
                int sum = resultMap.get(s.charAt(i));
                resultMap.put(s.charAt(i), sum + 1);
            }
        }

        for (int i = 0; i < c.length; i++) {
            sums[i] = resultMap.getOrDefault(c[i], 0);
        }
        for (Integer i : sums) {
            System.out.print(i + " ");
        }
        System.out.println();
        return sums;
    }
    static String stringToCount = "Look at me. It's me! Can't you recognize me?";
    static char[] charArray = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i'};
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        findNumbersOfRepetitions(stringToCount, 'o');
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("Time of algorithm is " + duration + "ms");

        startTime = System.currentTimeMillis();
        findNumbersOfRepetitionsV1(stringToCount, charArray);
        endTime = System.currentTimeMillis();
        duration = endTime - startTime;
        System.out.println("Time of algorithm V1 is " + duration + "ms");

        startTime = System.currentTimeMillis();
        findNumbersOfRepetitionsV2(stringToCount, charArray);
        endTime = System.currentTimeMillis();
        duration = endTime - startTime;
        System.out.println("Time of algorithm V2 is " + duration + "ms");
    }
}
