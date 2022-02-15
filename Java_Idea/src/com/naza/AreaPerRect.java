package com.naza;

public class AreaPerRect {
    public static void main(String[] args) {
        //swapping two numbers without temp
        float first = 23.5f;
        float second = 65.5f;
        System.out.println("=Before swap=");
        System.out.println("The first number: "+ first);
        System.out.println("The second number: " + second);
        //swapping
        first = first-second; //first = first - second; first = 23.5f - 65.5f
        second = first+second; //second = (23.5f - 65.5f) + 65.5f = 23.5f
        first = second-first; //first = 23.5f - (23.5-65.5f) = 65.5f
        System.out.println("=After swapping=");
        System.out.println("The first number: " + first);
        System.out.println("The second number: " + second);
}}
