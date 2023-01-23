package com.hackerrank.days;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class twoDArray {


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = findBiggestHourGlass(arr);

        bufferedReader.close();
    }

    private static int findBiggestHourGlass(List<List<Integer>> arr) {
        int currentResult = 0;
        int result = 0;
        for (int i = 0; i < arr.size() - 2; i++) {
            for (int j = 0; j < arr.get(i).size() - 2; j++) {
                currentResult += arr.get(i).get(j) + arr.get(i).get(j + 1) + arr.get(i).get(j + 2);
                currentResult += arr.get(i + 1).get(j + 1);
                currentResult += arr.get(i + 2).get(j) + arr.get(i + 2).get(j + 1) + arr.get(i + 2).get(j + 2);
                if (j == 0 && i == 0) {
                    result = currentResult;
                }
                if (currentResult >= result) {
                    result = currentResult;
                }
                currentResult = 0;
            }
        }

        System.out.println(result);
        return result;
    }
}
//0 -4 -6 0 -7 -6
//-1 -2 -6 -8 -3 -1
//-8 -4 -2 -8 -8 -6
//-3 -1 -2 -5 -7 -4
//-3 -5 -3 -6 -6 -6
//-3 -6 0 -8 -6 -7

//-1 -1 0 -9 -2 -2
//-2 -1 -6 -8 -2 -5
//-1 -1 -1 -2 -3 -4
//-1 -9 -2 -4 -4 -5
//-7 -3 -3 -2 -9 -9
//-1 -3 -1 -2 -4 -5

