package com.company;

import com.sun.security.jgss.GSSUtil;

public class ASCIIfind {
    public static void main(String[] args) {
        char ch = 'Z';
        int ascii = ch;
        // cast char to int
        int castAscii  = (int) ch;
        System.out.println("The ASCII value of " + ch + " is " +ascii);
        System.out.println("The ASCII value of " + ch + " is " + castAscii);

        int number = -2;
        System.out.println("The number is: " + number);
        if (number%2==0) { // even number
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
        System.out.println("Bye");
    }
}
