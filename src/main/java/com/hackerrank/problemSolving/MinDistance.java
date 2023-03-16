package com.hackerrank.problemSolving;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class MinDistance {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int arrSize = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .toList();

        int result = maxDifference(arr);
        System.out.println(result);
        bufferedReader.close();
    }

    public static int maxDifference(List<Integer> arr) {
        int result;
        List<Integer> listOfResults = new ArrayList<>();
        for (int i = 0; i < arr.size() - 1; i++) {
            int firstNumber = arr.get(i);
            for (int j = i + 1; j < arr.size(); j++) {
                int secondNumber = arr.get(j);
                if (firstNumber == secondNumber) {
                    listOfResults.add(j - i);
                }
            }
        }
        if (listOfResults.isEmpty()) {
            result = -1;
        } else {
            result = Collections.min(listOfResults);
        }
        return result;
    }
}
