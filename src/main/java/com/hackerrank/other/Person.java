package com.hackerrank.other;

import static com.hackerrank.other.HairColor.BLACK;
import static com.hackerrank.other.HairColor.BLONDE;

public class Person {

    private int initialAge = 0;

    private HairColor hairColor = BLONDE;

    private int age;

    public Person() {
    }

    public void setAge(int age) {
        if (age > initialAge) {
            this.age = age;
            if (age >= 13 && age < 18) {
                System.out.println("You are a teenager.");
            } else if (age < 13) {
                System.out.println("You are young.");
            } else {
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

    public Person(int initialAge, HairColor hairColor, int age) {
        this.initialAge = initialAge;
        this.hairColor = hairColor;
        this.age = age;
    }

    public HairColor getHairColor() {
        return hairColor;
    }

    public void setHairColor(HairColor hairColor) {
        this.hairColor = hairColor;
    }

    public static void main(String[] args) {
        Person peterParker = new Person();
        Person spiderMan = peterParker;

        spiderMan.hairColor = BLACK;

        System.out.println("Hair color of Peter Parker is: " + peterParker.hairColor);
        System.out.println("Hair color of Spider-man is: " + spiderMan.hairColor);
    }
}
