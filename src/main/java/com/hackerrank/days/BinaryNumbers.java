package com.hackerrank.days;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashSet;

public class BinaryNumbers {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        int result = printBinaryNumber(n);
        bufferedReader.close();
    }

    private static int printBinaryNumber(int n) {
        int result = 0;
        int remainder = 0;
        HashSet<Integer> score = new HashSet<>();
        StringBuilder binaryNumber = new StringBuilder();
        while (n > 0) {
            remainder = n % 2;
            n = n / 2;
            if (remainder != 0) {
                result++;
            } else {
                score.add(result);
                binaryNumber.append(result);
                result = 0;
            }
            if (n == 0) {
                binaryNumber.append(result);
                score.add(result);
            }
        }
        System.out.println(binaryNumber.reverse());
        System.out.println(Collections.max(score));
        return Collections.max(score);
    }
}
