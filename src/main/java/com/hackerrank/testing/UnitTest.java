package com.hackerrank.testing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class UnitTest {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        try {
            int t = Integer.parseInt(bufferedReader.readLine().trim());
            IntStream.range(0, t).forEach(tItr -> {
                try {
                    String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                    int n = Integer.parseInt(firstMultipleInput[0]);

                    int k = Integer.parseInt(firstMultipleInput[1]);
                    List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                            .map(Integer::parseInt)
                            .collect(Collectors.toList());
                    System.out.println(Arrays.toString(TestDataEmptyArray.getEmptyArray()));
                    System.out.println(Arrays.toString(TestDataExactlyTwoDifferentMinimums.get_array()));
                    System.out.println(TestDataExactlyTwoDifferentMinimums.get_expected_result());
                    System.out.println(Arrays.toString(TestDataUniqueValues.get_array()));
                    System.out.println(TestDataUniqueValues.get_expected_result());
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }


            });
        } catch (NumberFormatException e) {
            System.out.println("OK");
        }
        bufferedReader.close();
    }
}
