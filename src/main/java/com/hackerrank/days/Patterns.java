package com.hackerrank.days;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Patterns {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<String> names = new ArrayList<>();
        int arraySize = Integer.parseInt(bufferedReader.readLine());
        while (arraySize > 0) {
            String[] nameAndEmail = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
            if(nameAndEmail[1].contains("@gmail.com")){
                names.add(nameAndEmail[0]);
            }
            arraySize--;
        }

        Collections.sort(names);
        for (String s : names) {
            System.out.println(s);

        }
        bufferedReader.close();
    }
}
