package com.company;

public class IntDiv {
    public static void main(String[] args) {
        int a = 2;
        int b = 50;
        int c = 8;
        System.out.println(result(a,b,c));
    }

    private static int result(int a, int b, int c) {
        if(a%c ==0)
            return (b/c - a/c + 1); //8,16,32,40,48
        return (b/c-a/c);
    }
}
