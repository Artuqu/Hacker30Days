package com.hackerrank.days;

import com.hackerrank.objects.Student;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Inheritance {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] firstInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
        String firstName = firstInput[0];
        String lastName = firstInput[1];
        Integer idNumber = Integer.parseInt(firstInput[2]);
        Integer arraySize = Integer.parseInt(bufferedReader.readLine().trim());
        List<Integer> grades = new ArrayList<>(arraySize);

        String[] scoresToAdd = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
        int i = 0;
        while (arraySize > i) {
            grades.add(Integer.parseInt(scoresToAdd[i]));
            i++;
        }
        Student student = new Student(firstName, lastName, idNumber, grades);
        student.printPerson();
        student.calculate();
        bufferedReader.close();
    }

}
