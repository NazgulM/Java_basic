package com.naza;

import java.util.Scanner;

public class Averageetc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("First number: ");
        int a = scan.nextInt();
        System.out.println("Second number:  ");
        int b = scan.nextInt();
        System.out.println("Third number: ");
        int c = scan.nextInt();
        System.out.println("The average number is: " + (a+b+c)/3);
    }
}
