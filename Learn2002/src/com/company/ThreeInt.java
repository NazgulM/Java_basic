package com.company;

import java.util.Scanner;

public class ThreeInt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the first number: ");
        int a = scan.nextInt();
        System.out.println("Input the second number: ");
        int b = scan.nextInt();
        System.out.println("Input the third number: ");
        int c = scan.nextInt();
        System.out.println("The result is: " + chec(a,b,c,true));
    }

    private static boolean chec(int x, int y, int z, boolean b1) {
        if(b1)
            return(z > y);
        return (y > x && z> y);
    }
}
