package com.company;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

public class ConvertsectoHMS {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input seconds: " );
        int sec = scan.nextInt();
        TimeZone tz = TimeZone.getTimeZone("UTC");
        SimpleDateFormat df = new SimpleDateFormat("HH: mm: ss");
        df.setTimeZone(tz);
        String time = df.format(new Date(sec));
        System.out.println(time);
    }
}
