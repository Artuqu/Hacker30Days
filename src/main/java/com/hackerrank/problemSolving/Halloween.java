package com.hackerrank.problemSolving;

import java.io.*;

public class Halloween {


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("OUTPUT_PATH"));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int regularPrice = Integer.parseInt(firstMultipleInput[0]);

        int discount = Integer.parseInt(firstMultipleInput[1]);

        int minimumPrice = Integer.parseInt(firstMultipleInput[2]);

        int budget = Integer.parseInt(firstMultipleInput[3]);

        int answer = howManyGames(regularPrice, discount, minimumPrice, budget);

        bufferedWriter.write(String.valueOf(answer));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

    public static int howManyGames(int regularPrice, int discount, int minimumPrice, int budget) {
        int result = 0;

        while (budget >= minimumPrice && budget >= regularPrice) {
            if (regularPrice < minimumPrice) {
                regularPrice = minimumPrice;
            }
            if (budget - regularPrice >= 0) {
                budget = budget - regularPrice;
                result++;
            }
            regularPrice = regularPrice - discount;
        }

        System.out.println(result);
        return result;
    }
}
