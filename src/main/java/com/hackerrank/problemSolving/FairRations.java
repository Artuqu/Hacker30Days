package com.hackerrank.problemSolving;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FairRations {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int arrLength = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> loaves = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .toList();

        String result = fairRotations(loaves);
        System.out.println(result);


        bufferedReader.close();
    }

    private static String fairRotations(List<Integer> loaves) {
        List<Integer> forTask = new ArrayList<>(loaves);

        String result = "NO";
        int loavesCount = 0;
        if (forTask.size() < 2) {
            return result;
        } else if (forTask.size() == 2) {
            if ((forTask.get(0) + forTask.get(1)) % 2 == 0) {
                result = "2";
            } else
                return result;

        } else if (forTask.size() > 2) {

            for (int i = 0; i < forTask.size() - 1; i++) {
                int first = forTask.get(i);
                int j = i + 1;
                int second = forTask.get(j);
                if (i == 0) {
                    if (first % 2 == 0 && second % 2 != 0) {

                    } else if (first % 2 != 0) {
                        forTask.set(i, forTask.get(i) + 1);
                        forTask.set(j, forTask.get(j) + 1);
                        loavesCount += 2;
                    }
                } else {
                    if (first % 2 == 0 && second % 2 == 0) {
                        i++;
                    }
                    if (first % 2 == 0 && second % 2 != 0) {
                        forTask.set(j, forTask.get(j) + 1);
                        forTask.set(j + 1, forTask.get(j + 1) + 1);
                        loavesCount += 2;
                        i++;
                    } else if (first % 2 != 0 && second % 2 == 0) {
                        forTask.set(i, forTask.get(i) + 1);
                        forTask.set(j, forTask.get(j) + 1);
                        loavesCount += 2;
                    } else if (first % 2 != 0 && second % 2 != 0) {
                        forTask.set(i, forTask.get(i) + 1);
                        forTask.set(j, forTask.get(j) + 1);
                        loavesCount += 2;
                        i++;
                    }
                }


            }
            int sum = forTask.stream().mapToInt(Integer::valueOf).sum();
            if (sum % 2 == 0) {
                result = String.valueOf(loavesCount);
            } else return result;
        }

        return result;
    }


}
