package com.hackerrank.days;

import java.io.*;
import java.util.stream.IntStream;

public class BitwiseAnd {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("OUTPUT_PATH"));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                int N = Integer.parseInt(firstMultipleInput[0]);

                int K = Integer.parseInt(firstMultipleInput[1]);

                int res = bitwiseAnd(N, K);

                bufferedWriter.write(String.valueOf(res));
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }

    private static int bitwiseAnd(int N, int K) {
        int max = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j <= N; j++) {
                int result = i & j;
                if (result < K && result > max) {
                    max = result;
                }
            }
        }
        return max;
    }
}
//3
//5 2
//8 5
//2 2