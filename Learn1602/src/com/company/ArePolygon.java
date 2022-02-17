package com.company;

import java.util.Scanner;

public class ArePolygon {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the number of sides the polygon: ");
        int number = scan.nextInt();
        System.out.println("Input the length of one side of polygon: ");
        int length = scan.nextInt();
        System.out.println("The area of polygon is: " + polygonArea(number,length) + "\n");
    }

    private static double polygonArea(int number, int length) {
        return (number*length*length)/(4*Math.tan(Math.PI/number));
    }
}
