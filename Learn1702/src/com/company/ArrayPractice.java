package com.company;
import java.io.*;
public class ArrayPractice {
    public static void main(String[] args) {
        //create the console object
        Console cnsl
                = System.console();

        if (cnsl == null) {
            System.out.println(
                    "No console available");
            return;
        }

        String fmt = "%2$5s %3$10s%n";

        // Read line
        String un = cnsl.readLine(
                fmt, "Enter", "Username : ");

        // Print username
        System.out.println(
                "Username : " + un);

        // Read password
        // into character array
        char[] pwd = cnsl.readPassword(
                fmt, "Enter", "Password : ");

        // Print password
        System.out.println(
                "Password : " + pwd);
    }

    }

