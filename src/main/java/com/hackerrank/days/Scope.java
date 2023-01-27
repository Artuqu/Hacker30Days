package com.hackerrank.days;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Scope {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Integer arraySize = Integer.valueOf(bufferedReader.readLine());
        List<Integer> elements = new ArrayList<>(arraySize);
        String[] integersToAdd = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
        int i = 0;
        while (arraySize > 0) {
            elements.add(Integer.valueOf(integersToAdd[i]));
            arraySize--;
            i++;
        }
        int result = findMaxDifference(elements);
        bufferedReader.close();
    }

    private static int findMaxDifference(List<Integer> elements) {
        int difference;
        int max = Collections.max(elements);
        int min = Collections.min(elements);
        difference = Math.abs(max - min);
        System.out.println(difference);
        return difference;
    }
}
