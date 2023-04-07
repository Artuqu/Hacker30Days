package com.hackerrank.upside;

import java.util.Scanner;

public class Task1 {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(LowestPriceInRecentDays(s.nextLine()));

    }

    private static String LowestPriceInRecentDays(String arr) {
        StringBuilder result = new StringBuilder();
        String [] converted = arr.replace("new int[] {", "").replace("}", "").split(",");

        int min = Integer.parseInt(converted[0]);
        for (int i = 0; i < converted.length; i++) {
            int possibleToAdd = Integer.parseInt(converted[i]);
            if (min >= possibleToAdd) {
                result.append(possibleToAdd + " ");
                min = possibleToAdd;
            }else {
                result.append(min+ " ");
            }
        }
        return result.toString();
    }
}
