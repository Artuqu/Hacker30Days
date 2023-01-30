package com.hackerrank.days;

import com.hackerrank.other.NegativeValueException;

import java.util.Scanner;

public class Calculator {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();

        while (testCases > 0) {
            double P = Double.parseDouble(scanner.next());
            double N = Double.parseDouble(scanner.next());
            try {
                calculate(P, N);
            } catch (NegativeValueException e) {
                System.out.println("n and p should be non-negative");
            }
            testCases--;
        }
        scanner.close();

    }


    private static void calculate(double p, double n) throws NegativeValueException {
        if (p < 0 || n < 0) {
            throw new NegativeValueException();
        } else {
            double result = Math.pow(p, n);
            System.out.println(result);
        }
    }
}
