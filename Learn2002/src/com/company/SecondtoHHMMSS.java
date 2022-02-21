package com.company;

import java.util.Scanner;

public class SecondtoHHMMSS {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input seconds: " );
        int sec = scan.nextInt();
        int p1 = sec % 60;
        int p2 = sec /60;
        int p3 = p2 % 60;
        p2 = p2 /60;

        System.out.println(p2 + ":" + p3 + ":" + p1);
    }
}
