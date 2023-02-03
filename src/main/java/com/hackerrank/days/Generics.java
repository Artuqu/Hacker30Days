package com.hackerrank.days;

import java.util.*;

public class Generics {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int integerListSize = scanner.nextInt();
        List<Integer> integersList = new ArrayList<>(integerListSize);
        while (integerListSize > 0) {
            int nextInt = scanner.nextInt();
            integersList.add(nextInt);
            integerListSize--;
        }
        int stringsListSize = scanner.nextInt();
        List<String> stringsList = new ArrayList<>(stringsListSize);
        while (stringsListSize > 0) {
            String nextString = scanner.next().trim();
            stringsList.add(nextString);
            stringsListSize--;
        }
        scanner.close();

        for (Integer i : integersList) {
            System.out.println(i);
        }
        for (String s : stringsList) {
            System.out.println(s);

        }
    }
}
//7
//8
//6
//7
//5
//3
//0
//9
//3
//Jenny's
//Phone
//Number