package com.company;

import java.util.Scanner;

public class PenultimateW {
    public static void main(String[] args) {
        //last but one word (next to last)
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any statement: ");//My name is Nazgul Maniiasova
        String name = scan.nextLine();
        //code for finding penultimate word
        String []words = name.split(" ");
        if(words.length>1) {
            System.out.println("Penultimate word in my sentence: " + words[words.length - 2]);
        } else {
            System.out.println("The statement has less than 2 words, hence penultimate word cannot be printed");
        }

    }
}
