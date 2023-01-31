package com.hackerrank.days;

import edu.emory.mathcs.backport.java.util.LinkedList;
import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String toCheck = scanner.nextLine();
        scanner.close();

        isItPalindrome1(toCheck);
        isItPalindrome2(toCheck);
    }

    private static void isItPalindrome2(String toCheck) {
        Stack<String> fromEnd = new Stack<>();
        LinkedList queue = new LinkedList();
        boolean isPalindrome = true;
        for (int i = 0; i < toCheck.length(); i++) {
            fromEnd.push(String.valueOf(toCheck.charAt(i)));
            queue.add(String.valueOf(toCheck.charAt(i)));
        }
        while (!fromEnd.isEmpty()) {
            String begin = String.valueOf(queue.remove(0));
            String end = fromEnd.pop();
            if (!end.equals(begin)) {
                isPalindrome = false;
            }
        }
        System.out.println(isPalindrome ? "The word, " + toCheck + ", is a palindrome." : "The word, " + toCheck + ", is not a palindrome.");
    }

    private static void isItPalindrome1(String toCheck) {
        String reverse = StringUtils.reverse(toCheck);
        System.out.println(toCheck.equals(reverse) ? "The word, " + toCheck + ", is a palindrome." : "The word, " + toCheck + ", is not a palindrome.");

    }
}
