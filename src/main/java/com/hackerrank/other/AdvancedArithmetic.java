package com.hackerrank.other;

import java.util.ArrayList;
import java.util.List;

public interface AdvancedArithmetic {

    static void divisorSum(int n) {
        System.out.println("I implemented: AdvancedArithmetic");
        List<Integer> divisors = new ArrayList<>();
        int sum = 0;
        int divide = 1;
        while (divide <= n) {
            if (n % divide == 0) {
                divisors.add(divide);
            }
            divide++;
        }
        for (Integer divisor : divisors) {
            sum += divisor;
        }
        System.out.println(sum);
    }
}
