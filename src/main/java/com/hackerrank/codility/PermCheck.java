package com.hackerrank.codility;

import java.util.Arrays;

public class PermCheck {
    static int solution(int[] A) {
        int result = 1;
        Arrays.sort(A);
        if (A.length == 1 && A[0] > 1) {
            return 0;
        }
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] + 1 != A[i + 1] || A[i] == A[i + 1] || A[0] > 1) {
                return 0;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {4, 1, 3, 2};
        int[] arr2 = {4, 1, 3};
        System.out.println(solution(arr));
        System.out.println(solution(arr2));
    }
}
