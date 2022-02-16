package com.company;

import java.util.Scanner;

public class ChrckJava {
    public static void main(String[] args) {
        System.out.println("\nJava Version: " + System.getProperty("java.version"));
        System.out.println("Java Runtime Version: " + System.getProperty("java.runtime.version"));
        System.out.println("Java Home: " + System.getProperty("java.home"));
        System.out.println("Java Vendor: " + System.getProperty("java.vendor"));
        System.out.println("Java Vendor URL: " + System.getProperty("java.vendor.url"));
        System.out.println("Java Class Path: " + System.getProperty("java.class.path"));

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first integer: ");
        int a  = scan.nextInt();
        System.out.println("Enter second integer: ");
        int b = scan.nextInt();
        if (a == b)
            System.out.printf("%d ==%d\n", a,b);
        if (a != b)
            System.out.printf("%d != %d\n", a,b);
        if (a < b)
            System.out.printf("%d < %d\n",a,b);
        if (a > b)
            System.out.printf("%d > %d\n",a,b);
        if (a <= b)
            System.out.printf("%d <= %d\n",a,b);
        if (a >= b)
            System.out.printf("%d >= %d\n",a,b);
    }
}
