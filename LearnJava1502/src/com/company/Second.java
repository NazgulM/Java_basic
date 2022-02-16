package com.company;

public class Second {
    public static void main(String[] args) {
        //two binary numbers in String format
        String binary1 = "10", binary2 = "11";
        System.out.println("Enter the first binary number: "+ binary1);
        System.out.println("Enter the second binary number: "+ binary2);
        //converting strings into binary format numbers
        Integer int1 = Integer.parseInt(binary1,2);
        Integer int2 = Integer.parseInt(binary2,2);

        // adding two integers
        Integer output = int1+int2;
        //converting final output back to Binary Integer
        System.out.println("The Sym of 2 binary numbers is: ");
        System.out.println(Integer.toBinaryString(output));
    }
}
