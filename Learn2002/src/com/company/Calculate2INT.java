package com.company;

import java.util.Scanner;

public class Calculate2INT {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the first number: ");
        int a = scan.nextInt();
        System.out.println("Input the second number: ");
        int b = scan.nextInt();
        System.out.println("Input the third number: ");
        int c = scan.nextInt();
        System.out.println("The result is: " + sumoftwo(a, b, c));
    }

    private static boolean sumoftwo(int x, int y, int z) {
        return ((x + y) == z || (y + z) == x || (z + x) == y);
    }

}
