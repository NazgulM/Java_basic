package com.company;

public class PositiveNegativeNumber {
    public static void main(String[] args) {
        double d = 89.6;
        //true if number the negative
        if(d < 0.0) {
            System.out.println("The number is negative: " + d);
        } else if (d > 0.0) {
            System.out.println("The number is positive: " + d);
        } else {
            System.out.println("The number is 0");
        }
    }
}
