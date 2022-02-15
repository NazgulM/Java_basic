package com.naza;

import java.util.Scanner;

public class romStart {
    public static void main(String[] args) {
        System.out.println("Hello\nAlexandra Abramova!");

        int x = 74+36;
        System.out.println(x);
        System.out.println(55+45);
        System.out.println(50/3);
        int a = -5+8*6;
        System.out.println(a);
        int b = (55+9)%9;
        System.out.println(b);
        int c = 20+-3*5/8;
        System.out.println(c);
        int d = 5+15/3*2-8%3;
        System.out.println(d);

        Scanner scan = new Scanner(System.in);
        System.out.println("Input the first number: ");
        int first = scan.nextInt();
        System.out.println("Input the msecond number: ");
        int second = scan.nextInt();
        int sum;
        sum = first*second;
        System.out.println(sum);

    }
}
