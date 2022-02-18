package com.company;

import java.util.Scanner;

public class Twinkle {
    public static void main(String[] args) {
        System.out.println("\nTwinkle, twinkle, little star, \n\tHow I wonder what you are!\n\t\tUp above the world so high, \n\t\tLike a diamond in the sky.\nTwinkle, twinkle, little star, \n\tHow I wonder what you are");

        char s1, s2, s3;
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the number: ");
        int number = scan.nextInt();

        System.out.printf("%d + %d%d + %d%d%d\n", number,number,number,number,number,number);
    }
}
