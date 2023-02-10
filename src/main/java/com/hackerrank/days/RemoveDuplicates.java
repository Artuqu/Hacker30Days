package com.hackerrank.days;

import java.util.*;

public class RemoveDuplicates {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        HashSet<Integer> noDuplicates = new HashSet<>();
        LinkedList<Integer> linkedNoDuplicates = new LinkedList<>();
        while (arrayLength > 0) {
//            noDuplicates.add(scanner.nextInt());
            linkedNoDuplicates.add(scanner.nextInt());
            arrayLength--;
        }
        scanner.close();
//        noDuplicates.stream().sorted()
//                .forEach(System.out::print);
//        List<Integer> toSort = new ArrayList<>(noDuplicates);
//        Collections.sort(toSort);

//        for (Integer i : toSort) {
//            System.out.print(i + " ");
        for (int i = 0; i < linkedNoDuplicates.size() - 1; i++) {
            if (Objects.equals(linkedNoDuplicates.get(i), linkedNoDuplicates.get(i + 1))) {
                linkedNoDuplicates.remove(i + 1);
                i--;
            }
        }
        for (Integer i : linkedNoDuplicates) {
            System.out.print(i + " ");

        }

    }
}
