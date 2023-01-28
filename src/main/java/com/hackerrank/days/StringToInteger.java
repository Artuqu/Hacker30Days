package com.hackerrank.days;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringToInteger {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String S = bufferedReader.readLine();
        try {
            Integer showInteger = Integer.parseInt(S);
            System.out.println(showInteger);
        } catch (NumberFormatException exception) {
            System.out.println("Bad String");
        }
        bufferedReader.close();
    }
}
