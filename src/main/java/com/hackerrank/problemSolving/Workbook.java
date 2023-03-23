package com.hackerrank.problemSolving;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

public class Workbook {


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
        int chapters = Integer.parseInt(firstInput[0]);
        int maxProblemPerPage = Integer.parseInt(firstInput[1]);

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .toList();
        int result = workbook(chapters, maxProblemPerPage, arr);
        System.out.println(result);

        bufferedReader.close();
    }

    public static int workbook(int chapters, int maxProblemsPerChapter, List<Integer> arr) {
        int result = 0;
        int currentPage = 0;

        for (int i = 0; i < arr.size(); i++) {
            boolean turnPage = true;
            int amountOfProblems = arr.get(i);
            if (turnPage) currentPage++;
            turnPage = false;

            for (int j = 1; j <= amountOfProblems; j++) {
                if (turnPage) currentPage++;

                if (j % maxProblemsPerChapter == 0) {
                    turnPage = true;
                } else {
                    turnPage = false;
                }
//                turnPage = (j % maxProblemsPerChapter == 0) ? true : false;

                if (j == currentPage) {
                    result++;
                }
            }
        }
        return result;
    }
}
