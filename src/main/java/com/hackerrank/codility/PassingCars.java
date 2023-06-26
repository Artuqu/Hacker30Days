package com.hackerrank.codility;

public class PassingCars {


    public static int solution(int[] A) {
        int pairs = 0;
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] == 0) {
                for (int j = i + 1; j < A.length; j++) {
                    if (A[i] == 0 && A[j] == 1) {
                        pairs++;
                    }
                }
            }
        }
        if (pairs > 1000000000) {
            return -1;
        }
        return pairs;
    }

    public static void main(String[] args) {
        int[] A = {0, 1, 0, 1, 1};

        System.out.println(solution(A));


    }
}
