package com.hackerrank.objects;

import java.util.List;

public class Student extends Person {

    private List<Integer> scores;

    public Student(String firstName, String lastName, Integer idNumber, List<Integer> scores) {
        super(firstName, lastName, idNumber);
        this.scores = scores;
    }


    public char calculate() {
        int average = 0;
        for (int i = 0; i < scores.size(); i++) {
            average += scores.get(i);
        }
        average = average / scores.size();
        char grade = 0;
        if (average >= 90 && average <= 100) {
            grade = 'O';
        } else if (average >= 80 && average < 90) {
            grade = 'E';
        } else if (average >= 70 && average < 80) {
            grade = 'A';
        } else if (average >= 55 && average < 70) {
            grade = 'P';
        } else if (average >= 40 && average < 55) {
            grade = 'D';
        } else if (average < 40) {
            grade = 'T';
        }


        System.out.println("Grade: " + grade);
        return grade;
    }
}
