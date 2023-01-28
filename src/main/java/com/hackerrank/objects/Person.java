package com.hackerrank.objects;

public class Person {


    private final String firstName;
    private final String lastName;
    private final Integer idNumber;

    public Person(String firstName, String lastName, Integer idNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", idNumber=" + idNumber +
                '}';
    }

    public void printPerson() {
        System.out.println(
                "Name: " + this.lastName + ", " + this.firstName
                        + "\nID: " + this.idNumber
        );

    }
}

