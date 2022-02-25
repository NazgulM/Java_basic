package com.codecademy;

import java.util.ArrayList;

public class ForLoopRemove {
    public static ArrayList<String> removeAnts(ArrayList<String> lunchBox) {
        // Add your code below
        for (int i = 0; i < lunchBox.size(); i++) {
            if (lunchBox.get(i) == "ant"){
                lunchBox.remove(lunchBox.get(i));
                i--;
            }
        }
        return lunchBox;
    }


    public static void main(String[] args) {
        ArrayList<String> lunchContainer = new ArrayList<String>();
        lunchContainer.add("apple");
        lunchContainer.add("ant");
        lunchContainer.add("ant");
        lunchContainer.add("sandwich");
        lunchContainer.add("ant");
        lunchContainer = removeAnts(lunchContainer);
        System.out.println(lunchContainer);

        for  (int i = 0; i < 28; i++) {
            System.out.println("Congrats on finishing Java loops!" + i);
        }

        int i = 99;

        while (i > 0) {

            System.out.println(i + " bottles of soda on the wall.");
            i--;

        }

        // Rebuild here:
        for (int j = 99;j > 0;j--) {

            System.out.println(j + " bottles of soda on the wall.");

        }

    }
}

