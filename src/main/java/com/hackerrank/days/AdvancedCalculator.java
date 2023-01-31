package com.hackerrank.days;

import com.hackerrank.other.AdvancedArithmetic;

import java.util.Scanner;

public class AdvancedCalculator implements AdvancedArithmetic {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        AdvancedArithmetic.divisorSum(n);


    }
}
