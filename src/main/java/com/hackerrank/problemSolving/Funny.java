package com.hackerrank.problemSolving;

import org.apache.commons.lang3.StringUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Funny {


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int testCases = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, testCases).forEach(
                i -> {

                    try {
                        String s = bufferedReader.readLine().replaceAll("\\s+$", "");

                        String result = funnyString(s);
                        System.out.println(result);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }

        );


        bufferedReader.close();
    }

    public static String funnyString(String s) {
        String result = "Not Funny";
        int[] regularString = new int[s.length()];
        int[] reverseString = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            regularString[i] = s.charAt(i);
            reverseString[s.length() - i - 1] = s.charAt(i);
        }
        StringBuilder resultRegularString = new StringBuilder();
        StringBuilder resultReverseString = new StringBuilder();

        for (int i = 0; i < regularString.length - 1; i++) {
            int firstRegularInt = regularString[i];
            int firstReverseInt = reverseString[i];
            int j = i + 1;
            int secondRegularInt = regularString[j];
            int secondReverseInt = reverseString[j];
            resultRegularString.append(Math.abs(secondRegularInt - firstRegularInt));
            resultReverseString.append(Math.abs(secondReverseInt - firstReverseInt));
        }
        if (resultRegularString.toString().equals(resultReverseString.toString())) {
            result = "Funny";
        }


        return result;
    }
}
