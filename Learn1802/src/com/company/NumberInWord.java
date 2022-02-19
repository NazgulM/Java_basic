package com.company;

public class NumberInWord {
    public static void main(String[] args) {
        int number = 1;
        //nested-f
        /*if (number ==1) {
            System.out.println("One");
        } else if (number ==2) {
            System.out.println("Two");
        } else if (number==3) {
            System.out.println("Three");
        } else if (number==4) {
            System.out.println("Four");
        } else if (number==5) {
            System.out.println("Five");
        } else if (number==6) {
            System.out.println("Six");
        } else {
            System.out.println("Other");*/
        //switch-case
        switch (number) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
            default:
                System.out.println("Other");


        }
        }
    }

