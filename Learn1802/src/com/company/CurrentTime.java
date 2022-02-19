package com.company;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.*;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class CurrentTime {
    public static void main(String[] args) {
        System.out.format("\nCurrent Date time: %tc%n\n", System.currentTimeMillis());

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        System.out.println(formatter.format(date));

        System.out.println(java.time.LocalDate.now());

        System.out.println(java.time.LocalTime.now());

        System.out.println(java.time.LocalDateTime.now());

        System.out.println(java.time.Clock.systemUTC().instant());
         //creating object
        java.util.Date date1 = new java.util.Date();
        System.out.println(date1);
        //creating a new object of the Class Date
        long millis = System.currentTimeMillis();
        java.util.Date date3 = new java.util.Date(millis);
        System.out.println(date3);

        long millis1 = System.currentTimeMillis();

        java.sql.Date date4 = new java.sql.Date(millis1);
        System.out.println(date4);

        // using Calendar
        SimpleDateFormat cdt  = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");
        cdt.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("GMT")));
        System.out.println("\nNow: " + cdt.format(System.currentTimeMillis()));

    }
}
