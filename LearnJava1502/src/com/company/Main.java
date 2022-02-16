package com.company;

import java.util.Scanner;

import static java.lang.Integer.sum;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        long binary1, binary2;
        int i = 0, remainder = 0;
        int [] sum = new int[20];

        System.out.println("Enter the first binary number: ");
        binary1  = scan.nextLong();
        System.out.println("Enter the second number: ");
        binary2  = scan.nextLong();

        while (binary1 != 0 || binary2 != 0) {
            sum[i++] = (int) ((binary1 % 10 + binary2 % 10 + remainder) % 2);
            remainder = (int) ((binary1 % 10 + binary2 % 10 + remainder) / 2);
            binary1 = binary1 / 10;
            binary2 = binary2 / 10;
        }
        if (remainder !=0) {
            sum[i++] = remainder;
        }
        --i;
        System.out.print("Sum of two numbers: ");
        while (i >= 0) {
            System.out.print(sum[i--]);
        }
        System.out.print("\n");

        }




    }

