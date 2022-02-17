package com.company;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        int rem = 0;
        int sum = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a = scan.nextInt();
        while (a > 0) {
            rem = a%10;
            sum = sum+rem;
            a = a/10;
        }
        System.out.println("The sum of digit: " + sum);
    }
}
