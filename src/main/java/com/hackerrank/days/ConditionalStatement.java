package com.hackerrank.days;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConditionalStatement {


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        printNumberStatus(N);
        bufferedReader.close();
    }

    private static void printNumberStatus(int n) {
        String word = "Not Weird";
        if (n > 20 && n % 2 == 0 || 2 <= n && n <= 5 && n % 2 == 0) {
            System.out.println(word);
        } else if (n >= 6 && n <= 20 && n % 2 == 0) {
            word = "Weird";
            System.out.println(word);
        } else if (n % 2 != 0) {
            word = "Weird";
            System.out.println(word);
        }
    }

}
