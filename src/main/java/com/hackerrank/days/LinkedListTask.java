package com.hackerrank.days;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListTask {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> head = new LinkedList<>();
        int arrayLength = scanner.nextInt();

        for (int i = 0; i < arrayLength; i++) {
            head.add(scanner.nextInt());
        }
        scanner.close();
        for (Integer i : head) {
            System.out.print(i + " ");
        }
    }
}
