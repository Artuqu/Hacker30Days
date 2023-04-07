package com.hackerrank.upside;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Task2 {

    public static int ProductiveAdventurer(int[] arr) {
        // code goes here
        int result = 0;
        List<Integer> sorted = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            sorted.add(arr[i]);
        }
        Collections.sort(sorted);
        boolean compare = false;
        int days = 1;
        for (int i = 0; i < sorted.size() - 1; i++) {
            int first = sorted.get(i);
            for (int j = i + 1; j < sorted.size(); j++) {
                int second = sorted.get(j);
                if (days <= 3) {
                    if (first == second && !compare) {
                        compare = true;
                        result++;
                        days++;
                        if (j < sorted.size() - 1) {
                            sorted.remove(second);
                            j--;
                        } else {
                            return result;
                        }
                    } else if (first != second && !compare) {
                        result = -1;
                        return result;
                    } else if (first == second && compare) {
                        compare = false;
                        sorted.remove(second);
                        days = 1;
                        break;
                    } else if (first != second && compare) {
                        compare = false;
                        days = 1;
                        break;
                    }
                } else {
                    break;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine();
        String[] arr = s1.replaceAll("\\s+$", "").replace("new int[] {", "").replace("}", "").split(",");
        int[] toSend = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            toSend[i] = Integer.parseInt(arr[i]);
        }

        System.out.print(ProductiveAdventurer(toSend));
    }
}
