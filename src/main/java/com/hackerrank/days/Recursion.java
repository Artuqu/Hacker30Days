package com.hackerrank.days;

import java.io.*;

public class Recursion {


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("OUTPUT_PATH"));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int result = factorial(n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

    private static int factorial(int n) {
        if (n <= 1) {
            return n;
        } else {
            return n * factorial(n - 1);
        }
    }
}
