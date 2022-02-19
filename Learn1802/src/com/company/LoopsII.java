package com.company;

import java.util.*;
import java.io.*;
import java.math.*;

public class LoopsII {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a  = scan.nextInt();
        for (int i=0; i<a;i++) {
          int b = scan.nextInt();
          int c = scan.nextInt();
          int d = scan.nextInt();
          int sum = b;

          for (int j=0; j<d;j++) {
              System.out.println("" + (sum+=Math.pow(2,j)*c)+"");
              System.out.println();
          }
          scan.close();
        }
    }
}
