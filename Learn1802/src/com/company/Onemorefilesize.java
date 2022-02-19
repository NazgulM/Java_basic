package com.company;
import java.util.Scanner;
import java.io.File;

public class Onemorefilesize {

    public static void main(String[] args) {
        System.out.println("/C:/Python397/LICENCE.txt  : " + new File("LICENCE.txt").length() + " bytes");
        System.out.println("/home/students/test.txt : " + new File("test.txt").length() + " bytes");
    }
}
