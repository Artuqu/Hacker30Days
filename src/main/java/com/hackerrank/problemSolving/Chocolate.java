package com.hackerrank.problemSolving;

import java.io.*;
import java.util.stream.IntStream;

public class Chocolate {


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("OUTPUT_PATH"));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                int n = Integer.parseInt(firstMultipleInput[0]);

                int c = Integer.parseInt(firstMultipleInput[1]);

                int m = Integer.parseInt(firstMultipleInput[2]);

                int result = chocolateFeast(n, c, m);

                bufferedWriter.write(String.valueOf(result));
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }

    private static int chocolateFeast(int money, int cost, int wrappers) {
        int result = 0;
        int rest = money / cost;
        result += rest;
        while (rest >= wrappers) {
            int extra = rest / wrappers;
            int toAdd = rest % wrappers;
            result += extra;
            rest = extra + toAdd;
        }

        System.out.println(result);
        return result;
    }
}