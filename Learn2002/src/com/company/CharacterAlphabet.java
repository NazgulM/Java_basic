package com.company;

public class CharacterAlphabet<c> {
    public static void main(String[] args) {
        char c = '#';
        if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
            System.out.println(c + " is an Alphabet");
    } else {
            System.out.println(c + " is not Alphabet");
    }
        char q = 'T';
        String str =  (q >= 'a' && q <= 'z') || (q >= 'A' && q <= 'Z')
        ? q  + " is an alphabet. "
                : q + " is not an alphabet.";
        System.out.println(str);

    }

    }

