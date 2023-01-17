package com.hackerrank.other;

public class Person {

    int initialAge = 0;

    int age;

    public Person() {
    }

    public void setAge(int age) {
        if (age > initialAge) {
            this.age = age;
            if (age >= 13 && age < 18) {
                System.out.println("You are a teenager.");
            } else if (age < 13) {
                System.out.println("You are young.");
            }else {
                System.out.println("You are old.");
            }
        } else {
            this.age = initialAge;
            System.out.println("Age is not valid, setting age to 0.");
            System.out.println("You are young.");
        }
    }

    public int getAge() {
        return age;
    }
}
