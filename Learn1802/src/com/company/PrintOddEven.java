package com.company;

import java.util.Scanner;

public class PrintOddEven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input a number: ");
        int a  = scan.nextInt();
        if(a % 2 == 0) { // even number
            System.out.println("If the number is even: 1");
        } else {
                System.out.println("If the number is odd: 0");
            }

        }
    }

