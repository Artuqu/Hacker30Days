package com.hackerrank.problemSolving;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LibraryFine {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int d1 = Integer.parseInt(firstMultipleInput[0]);

        int m1 = Integer.parseInt(firstMultipleInput[1]);

        int y1 = Integer.parseInt(firstMultipleInput[2]);

        String[] secondMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int d2 = Integer.parseInt(secondMultipleInput[0]);

        int m2 = Integer.parseInt(secondMultipleInput[1]);

        int y2 = Integer.parseInt(secondMultipleInput[2]);

        int result = libraryFine(d1, m1, y1, d2, m2, y2);


        bufferedReader.close();


    }

    private static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
        int result = 0;
        if (m1 == m2 && y2 == y1) {
            result = (d1 - d2) * 15;
        } else if (m1 != m2 && y2 == y1) {
            result = (m1 - m2) * 500;
        } else if (y1 != y2) {
            result = (y1 - y2) * 10000;
        }
        if (result < 0) {
            result = 0;
        }
        System.out.println(result);
        return result;

    }

}
// 6 6 2015

//9 6 2016