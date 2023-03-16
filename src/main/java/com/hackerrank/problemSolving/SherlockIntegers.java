package com.hackerrank.problemSolving;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class SherlockIntegers {


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(bufferedReader.readLine());

        IntStream.range(0, testCases).forEach(data -> {
            try {
                String[] multipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
                int a = Integer.parseInt(multipleInput[0]);
                int b = Integer.parseInt(multipleInput[1]);

                int result = squares(a, b);



            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });


        bufferedReader.close();
    }

    private static int squares(int a, int b) {
        int result = 0;
        int maxSquare = (int) Math.sqrt(b);
        int twoMaxSquare = maxSquare * maxSquare;
        while (twoMaxSquare >= a) {
            maxSquare--;
            result++;
            twoMaxSquare = maxSquare * maxSquare;
        }

        System.out.println(result);
        return result;

    }
}
