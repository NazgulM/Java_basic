package com.company;

public class DecimalToBinary {
    public static void main(String[] args) {
        int dec = 5;
        //converting to binary and representing in String
        String bin = Integer.toBinaryString(dec);
        System.out.println("Convert decimal to binary number: " + bin);

        int dec1 = 15;
        //converting decimal to hexadecimal number
        String hex1 = Integer.toHexString(dec1);
        System.out.println("The decimal number 5 converting to hexadecimal number is: " + hex1);

        int dec2 = 111;
        //converting decimal to octal
        String oct = Integer.toOctalString(dec2);
        System.out.println("Converting decimal to octal " + oct);

        String number = "111";
        int bnum = Integer.parseInt(number,2);///111*421=7
        String ostr = Integer.toOctalString(bnum);
        System.out.println("After conversion from binary to octal value 111: " + ostr);

        String ocnum = "7";
        int decnum = Integer.parseInt(ocnum,8);
        System.out.println("After conversion from octal 7 to decimal: " + decnum);
        String binaryVal = Integer.toBinaryString(decnum);
        System.out.println("Octal to binary result is: " + binaryVal);

        //convert from hexadecimal to decimal
        String hex = "25";
        int dec3 = Integer.parseInt(hex,16);
        System.out.println("After conversion from hex. 25 to decimal: " + dec3);







    }
}
