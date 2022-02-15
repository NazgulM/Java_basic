package com.naza;

public class StringBuilderTask {

    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Hello Java");
        StringBuilder sb2 = new StringBuilder("Hureeee all I want is  Love");
        System.out.println(sb1);
        System.out.println(sb2);
        // add some text to the sb1
        StringBuilder sb3 = sb1.append(",  I hope i can learn you");
        System.out.println(sb3);
        //invert characters from the second sb2
        StringBuilder sb4 = sb2.reverse();
        System.out.println(sb4);

    }
}