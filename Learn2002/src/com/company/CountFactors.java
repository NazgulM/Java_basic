package com.company;

import java.util.Scanner;

public class CountFactors {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scan.nextInt();
        int count = 0;
        //logic for finding the difference factors
        System.out.println("The below are the different factors of the given number");
        for(int i = 1; i<=num; i++){
            if(num%i ==0){
                System.out.println(i + " ");
                count++;
            }
        }
        System.out.println("The number of factors of the given numbers: " + count);
    }
}
