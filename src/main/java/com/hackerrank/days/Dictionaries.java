package com.hackerrank.days;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Dictionaries {

    public static void main(String[] args) {

        Map<String, Integer> dictionariesMap = new HashMap<>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        for (int i = 0; i < n; i++) {
            String name = in.next();
            int phone = Integer.parseInt(in.next());
            dictionariesMap.put(name, phone);
        }
        while (in.hasNext()) {
            String s = in.next();
            System.out.println(dictionariesMap.containsKey(s) ? s + "=" + dictionariesMap.get(s) : "Not found");
        }
        in.close();
    }
}





