package com.hackerrank.days;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TimeFormat {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, 0);
        System.out.println(calendar.getTime());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        String stringFormat = simpleDateFormat.format(calendar.getTime());
        String[] dateCut = stringFormat.split("-");
        System.out.println(stringFormat);

        int result = Integer.parseInt(dateCut[0]) - Integer.parseInt(dateCut[1]);
        System.out.println(result);
    }
}
