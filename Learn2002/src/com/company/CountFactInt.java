package com.company;

import java.util.Scanner;



public class CountFactInt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scan.nextInt();

        System.out.println(result(num));
    }

    private static int result(int num) {
        int count = 0;
        for (int i = 1; i<=(int)Math.sqrt(num);i++) {
            if(num%i==0 &&i*i!=num) {
                count += 2;
            }else if(i*i==num) {
                count++;
            }
        }
        return count;
    }
}
