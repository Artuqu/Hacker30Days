package com.hackerrank.days;

import com.hackerrank.other.Person;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ClassVsInstance {


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int numbersOfCases = Integer.parseInt(bufferedReader.readLine().trim());
        List<Integer> agesList = new ArrayList<>(numbersOfCases);
        while (numbersOfCases > 0) {
            agesList.add(Integer.parseInt(bufferedReader.readLine().trim()));
            numbersOfCases--;
        }
        checkAges(agesList);


    }

    private static void checkAges(List<Integer> agesList) {
        Person person = new Person();
        for (int i = 0; i < agesList.size(); i++) {
            person.setAge(agesList.get(i));
            int age = person.getAge() + 3;
            person.setAge(age);
            System.out.println();
        }
    }
}
