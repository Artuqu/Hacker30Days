//package com.hackerrank.problemSolving;
//
//import java.io.*;
//import java.util.List;
//import java.util.stream.Stream;
//
//public class Triplets {
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("OUTPUT_PATH"));
//
//        String[] firstInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
//        int arrLength = Integer.parseInt(firstInput[0]);
//
//        int distance = Integer.parseInt(firstInput[1]);
//
//        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//                .map(Integer::parseInt)
//                .toList();
//
//        int result = beautifulTriplets(distance, arr);
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();
//        bufferedReader.close();
//    }
//
//    public static int beautifulTriplets(int distance, List<Integer> arr) {
//        int result = 0;
//        int triplet = 1;
//        for (int i = 0; i < arr.size(); i++) {
//            int first = arr.get(i);
//            for (int j = i + 1; j < arr.size() - 1; j++) {
//                if (first + distance == arr.get(j)) {
//                    triplet++;
//                    first = arr.get(j);
//                }
//                if (triplet == 3) {
//                    result++;
//                    triplet = 1;
//                    break;
//                }
//                if (arr.get(j) - distance > first) {
//                    triplet = 1;
//                    break;
//                }
//            }
//        }
//        System.out.println(result);
//        return result;
//    }
//}
