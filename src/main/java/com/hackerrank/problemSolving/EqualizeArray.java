package com.hackerrank.problemSolving;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EqualizeArray {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int arrLength = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .toList();

        int result = equalizeArray(arr);

        bufferedReader.close();
    }

    public static int equalizeArray(List<Integer> arr) {
        int result = 0;
        int maxTimes = 0;
        List<Integer> maxTimeValues = new ArrayList<>();
        Collections.sort(arr);
        int first = arr.get(0);
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == first) {
                maxTimes++;
            } else {
                maxTimeValues.add(maxTimes);
                maxTimes = 0;
                first = arr.get(i);
                i--;
            }
        }
        maxTimeValues.add(maxTimes);
        result = arr.size() - Collections.max(maxTimeValues);
        System.out.println(result);
        return result;
    }
}
