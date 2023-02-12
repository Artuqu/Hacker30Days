package com.hackerrank.days;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        while (arraySize > 0) {
            int n = scanner.nextInt();
            int divide = 0;
            String prime = "Prime";
            String notPrime = "Not prime";
            if (n <= 1) {
                System.out.println(notPrime);
            } else {
                for (int j = 1; j <= n / 2; j++) {
                    if (n % j == 0) {
                        divide++;
                    }
                    if (divide > 2) {
                        System.out.println(notPrime);
                        divide = 0;
                        break;
                    }
                }
                divide++;
                if (divide > 2) {
                    System.out.println(notPrime);
                } else if (divide == 2) {
                    System.out.println(prime);
                }
            }
            arraySize--;
        }
        scanner.close();
    }
}
