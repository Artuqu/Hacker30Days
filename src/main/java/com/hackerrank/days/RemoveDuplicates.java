package com.hackerrank.days;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class RemoveDuplicates {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        HashSet<Integer> noDuplicates = new HashSet<>();
        while (arrayLength > 0) {
            noDuplicates.add(scanner.nextInt());
            arrayLength--;
        }
//        noDuplicates.stream().sorted()
//                .forEach(System.out::println);
        LinkedList<Integer> toSort = new LinkedList<>(noDuplicates);
        Collections.sort(toSort);

        for (Integer i : toSort) {
            System.out.print(i + " ");

        }
    }
}
