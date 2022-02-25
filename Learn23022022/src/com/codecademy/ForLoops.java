package com.codecademy;

import java.util.ArrayList;

public class ForLoops {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            // Add your code below
            if (i % 5 !=0) {
                continue;
            }
            System.out.println(i);

        }
        ArrayList<Double> expenses = new ArrayList<Double>();
        expenses.add(74.46);
        expenses.add(63.99);
        expenses.add(10.57);
        expenses.add(81.37);

        double mostExpensive = 0;

        // Iterate over expenses
        for (double expense:  expenses) {
            if (expense > mostExpensive) {
                mostExpensive = expense;
            }
        }

        System.out.println("The most expensive is: " + mostExpensive);


    }
}


