package com.hackerrank.days;

import java.util.*;

public class Generics<T> {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Generics g = new Generics();
        g.printArray(scanner);
//        int integerListSize = scanner.nextInt();
//        List<Integer> integersList = new ArrayList<>(integerListSize);
//        while (integerListSize > 0) {
//            int nextInt = scanner.nextInt();
//            integersList.add(nextInt);
//            integerListSize--;
//        }
//        int stringsListSize = scanner.nextInt();
//        List<String> stringsList = new ArrayList<>(stringsListSize);
//        while (stringsListSize > 0) {
//            String nextString = scanner.next().trim();
//            stringsList.add(nextString);
//            stringsListSize--;
//        }
//        scanner.close();
//
//        for (Integer i : integersList) {
//            System.out.println(i);
//        }
//        for (String s : stringsList) {
//            System.out.println(s);
//        }
    }

    public void printArray(Scanner scanner) {
        List<T> listToPrint = new ArrayList<>();
        int firstListLength = scanner.nextInt();
        while (firstListLength > 0) {
            listToPrint.add((T) scanner.next().trim());
            firstListLength--;
        }
        int secondListLength = scanner.nextInt();
        while (secondListLength > 0) {
            listToPrint.add((T) scanner.next().trim());
            secondListLength--;
        }
        scanner.close();
        for (T t : listToPrint) {
            System.out.println(t);
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