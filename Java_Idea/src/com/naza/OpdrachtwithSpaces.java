package com.naza;

public class OpdrachtwithSpaces {
    public static void main(String[] args) {
   StringBuilder sb1 = new StringBuilder("This method appends the string representation");
   for (int i = 0; i<sb1.length(); i++) {
       if (sb1.charAt(i) == ' ') {
           sb1.deleteCharAt(i);
       }
   }
   System.out.println(sb1);

        StringBuilder sb2 = new StringBuilder("This method returns the char value");
        for (int i = 0; i <sb2.length(); i++) {
            if(sb2.charAt(i) =='t'); {
                sb2.insert(i++,'t');
            }
        }
        System.out.println(sb2);

    }
}


