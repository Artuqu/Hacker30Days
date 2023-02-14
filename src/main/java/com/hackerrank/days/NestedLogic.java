package com.hackerrank.days;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.time.Duration;
import java.time.LocalDate;

public class NestedLogic {

    public static void main(String[] args) throws IOException, ParseException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] firstInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
        String[] secondInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
        bufferedReader.close();

        StringBuilder returnDate = new StringBuilder();
        StringBuilder dueDate = new StringBuilder();

        if (firstInput[firstInput.length - 1].length() == 2) {
            returnDate.append("20").append(firstInput[firstInput.length - 1]).append("-");
        } else if (firstInput[firstInput.length - 1].length() == 1) {
            returnDate.append("200").append(firstInput[firstInput.length - 1]).append("-");
        }
        if (secondInput[secondInput.length - 1].length() == 2) {
            dueDate.append("20").append(secondInput[secondInput.length - 1]).append("-");
        } else if ((secondInput[secondInput.length - 1].length() == 1)) {
            dueDate.append("200").append(secondInput[secondInput.length - 1]).append("-");
        } else {
            returnDate.append(firstInput[firstInput.length - 1]).append("-");
            dueDate.append(secondInput[secondInput.length - 1]).append("-");
        }

        for (int i = 1; i < firstInput.length; i++) {
            int firstInputLength = (firstInput[firstInput.length - i - 1]).length();
            int secondInputLength = (secondInput[secondInput.length - i - 1]).length();
            if (firstInputLength == 1) {
                returnDate.append("0").append(firstInput[firstInput.length - i - 1]);
            }
            if (secondInputLength == 1) {
                dueDate.append("0").append(secondInput[secondInput.length - i - 1]);
            }
            if (firstInputLength > 1) {
                returnDate.append(firstInput[firstInput.length - i - 1]);
            }
            if (secondInputLength > 1) {
                dueDate.append(secondInput[secondInput.length - i - 1]);
            }
            if (i < firstInput.length - 1) {
                returnDate.append("-");
                dueDate.append("-");
            }
        }

        LocalDate localDateReturn = LocalDate.parse(returnDate);
        LocalDate localDateDue = LocalDate.parse(dueDate);

        sameCalendarMonthAndYear(firstInput, secondInput);

        Duration differance = Duration.between(localDateDue.atStartOfDay(), localDateReturn.atStartOfDay());
        System.out.println(

                countFines(differance.toDays(), firstInput, secondInput));
    }

    private static boolean sameCalendarMonthAndYear(String[] returnDate, String[] dueDate) {
        return returnDate[1].equals(dueDate[1]) && returnDate[2].equals(dueDate[2]);
    }

    private static boolean sameCalendarYearOnly(String[] returnDate, String[] dueDate) {
        return returnDate[2].equals(dueDate[2]) && !returnDate[1].equals(dueDate[1]);
    }

    private static int countFines(long duration, String[] firstInput, String[] secondInput) {
        int fine = 0;
        if ((int) duration <= 0) {
            return fine;
        } else if (duration > 0 && sameCalendarMonthAndYear(firstInput, secondInput)) {
            fine = (int) (duration * 15);
        } else if (duration > 0 && sameCalendarYearOnly(firstInput, secondInput)) {
            fine = (int) ((Integer.parseInt(firstInput[1]) - Integer.parseInt(secondInput[1])) * 500);
        } else {
            fine = 10000;
        }
        return fine;
    }
}
