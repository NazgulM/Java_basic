package com.company;

import com.sun.security.jgss.GSSUtil;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a, b;
        a = 50;
        b = 80;
        System.out.println("a == b - " + (a == b));
        System.out.println("a != b - " + (a != b));
        System.out.println("a > b - " + (a > b));
        System.out.println("a < b - " + (a < b));
        System.out.println("b >= a - " + (b>=a));

        boolean num1 = true;
        boolean num2 = false;
        System.out.println("num1 && num2  = " + (num1 && num2));
        System.out.println("num1 || num2 = " + (num1 || num2));
        System.out.println("!(num1 && num2)  = " + !(num1 && num2));
    }
}
