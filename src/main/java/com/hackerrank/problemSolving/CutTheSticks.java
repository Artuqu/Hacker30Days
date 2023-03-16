package com.hackerrank.problemSolving;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CutTheSticks {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("OUTPUT_PATH"));


        int arrSize = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> sticksList = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .toList();

        List<Integer> result = cutSticks(sticksList);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(Collectors.joining("\n"))
                        + "\n"
        );

        bufferedWriter.close();
        bufferedReader.close();
    }

    public static List<Integer> cutSticks(List<Integer> sticksList) {
        LinkedList<Integer> copySticks = new LinkedList<>(sticksList);
        List<Integer> numbersOfSticks = new ArrayList<>();
        numbersOfSticks.add(copySticks.size());
        int size = copySticks.size();

        while (copySticks.size() > 0) {
            int shortestStick = Collections.min(copySticks);
            copySticks.removeAll(List.of(shortestStick));
            if (copySticks.size() > 0) {
                numbersOfSticks.add(copySticks.size());
            }
        }
        for (Integer i : numbersOfSticks) {
            System.out.println(i);

        }
        return numbersOfSticks;
    }

}
//6
//5 4 4 2 2 8