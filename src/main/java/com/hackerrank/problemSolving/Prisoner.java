package com.hackerrank.problemSolving;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class Prisoner {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                int prisoners = Integer.parseInt(firstMultipleInput[0]);

                int sweets = Integer.parseInt(firstMultipleInput[1]);

                int chair = Integer.parseInt(firstMultipleInput[2]);

                int result = saveThePrisoner(prisoners, sweets, chair);


            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });


        bufferedReader.close();
    }

    private static int saveThePrisoner(int prisoners, int sweets, int chair) {
        int result;
        if (sweets > prisoners) {
            int rest = sweets % prisoners;
            int regularResult = chair - 1 + rest;
            if (regularResult > prisoners) {
                result = regularResult - prisoners;
            } else {
                result = regularResult;
            }
            System.out.println(result);
            return result;


        } else {
            if (chair + sweets > prisoners) {
                result = sweets - 1 - (prisoners - chair);
            } else
                result = chair - 1 + sweets;
        }
        System.out.println(result);
        return result;
    }
}
//7
//686863450 840668819 297194947
//384647703 392397885 333662329
//528293965 537271171 216018381
//999068491 999578957 912103487
//44167305 136425063 8165424
//232446711 713647937 8285374
//322911488 709444346 145586576