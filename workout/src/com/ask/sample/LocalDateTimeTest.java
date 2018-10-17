package com.ask.sample;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeTest {
    public static void main(String[] args) {
        LocalDate date = LocalDate.parse("2018-06-22");
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = null;
        if (time != null) {
             dateTime = date.atTime(time);
        } else {
            dateTime = date.atStartOfDay();
        }

        System.out.println(dateTime);
    }

    public LocalDateTime converToDateTime(String date, String time) {
        LocalDateTime localDateTime = null;

        if (date == null) {
            return null;
        }
        LocalDate dateLocal = LocalDate.parse(date, DateTimeFormatter.ofPattern("yyy"));
        if (time != null) {
            LocalTime timeLocal = LocalTime.parse(time, DateTimeFormatter.ofPattern("hh:mm"));
            localDateTime = dateLocal.atTime(timeLocal);
        } else {
            localDateTime = dateLocal.atStartOfDay();
        }
        return localDateTime;
    }
}
