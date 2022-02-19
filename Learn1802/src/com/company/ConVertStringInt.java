package com.company;

import java.util.Scanner;

public class ConVertStringInt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input a number (String): ");
        String str = scan.next();
        int result = Integer.parseInt(str);
        System.out.printf("The integer value is: %d", result);
        System.out.printf("\n");

    }
}
