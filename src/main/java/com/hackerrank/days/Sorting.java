package com.hackerrank.days;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sorting {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        Integer arraySize = Integer.valueOf(bufferedReader.readLine().trim());

        List<Integer> listToSort = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        bufferedReader.close();
        bubbleSort(listToSort);
    }

    private static void bubbleSort(List<Integer> listToSort) {
        int numberOfSwaps = 0;
        for (int i = 0; i < listToSort.size(); i++) {
            // Track number of elements swapped during a single array traversal

            for (int j = 0; j < listToSort.size() - 1; j++) {
                // Swap adjacent elements if they are in decreasing order
                int firstElement = listToSort.get(j);
                if (listToSort.get(j) > listToSort.get(j + 1)) {
                    numberOfSwaps++;
                    listToSort.set(j, listToSort.get(j + 1));
                    listToSort.set(j + 1, firstElement);
                }
            }

            // If no elements were swapped during a traversal, array is sorted
            if (numberOfSwaps == 0) {
                break;
            }
        }
        System.out.println("Array is sorted in " + numberOfSwaps + " swaps.");
        System.out.println("First Element: " + listToSort.get(0));
        System.out.println("Last Element: " + listToSort.get(listToSort.size()-1));
    }
}
