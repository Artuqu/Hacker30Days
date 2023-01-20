package com.hackerrank.days;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Review {


    public static void main(String[] args) throws IOException {


        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(bufferedReader.readLine().trim());
        List<String> stringsToCheck = new ArrayList<>();
        while (testCases > 0) {
            stringsToCheck.add(bufferedReader.readLine().replaceAll("\\s+$", ""));
            testCases--;
        }

        printStrings(stringsToCheck);

        bufferedReader.close();
    }

    private static void printStrings(List<String> stringsToCheck) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < stringsToCheck.size(); i++) {
            StringBuilder even = new StringBuilder("");
            StringBuilder odd = new StringBuilder("");
            String toSplit = stringsToCheck.get(i);
            for (int j = 0; j < toSplit.length(); j++) {
                if (j % 2 == 0) {
                    even.append(toSplit.charAt(j));
                } else {
                    odd.append(toSplit.charAt(j));
                }

            }
            result.add(even + " " + odd);
        }
        for (String s : result) {
            System.out.println(s);
        }
    }
}
