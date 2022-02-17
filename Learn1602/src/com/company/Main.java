package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        StringBuilder text1 = new StringBuilder("This is my first line text");
        StringBuilder text2 = new StringBuilder("This is my second line of text");

        System.out.println(text1);
        System.out.println(text2);

        text1.append("and this is what I added");
        System.out.println(text1);

        text2.reverse();
        System.out.println(text2);

        for (int i  = 0;i<text2.length();i++) {
            if(text2.charAt(i) == ' ') {
                text2.deleteCharAt(i);

            }
        }
        System.out.println(text2);

        for (int i = 0; i < text2.length(); i++) {
            if (text2.charAt(i) == 't') {
                text2.insert(i++,'t');

            }
        }
        System.out.println(text2);
    }
}
