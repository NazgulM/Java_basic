package com.codecademy;

import java.util.ArrayList;

class Coffee {

    public static void main(String[] args) {

        // initialize cupsOfCoffee
        int cupsOfCoffee = 1;
        // add while loop with counter

        while (cupsOfCoffee <= 100) {
            cupsOfCoffee++;
            System.out.println("Fry drinks cup of coffee #" + cupsOfCoffee);
        }

        for (int cups = 1; cups <=15; cups++) {
            System.out.println("\nCups of tea: " + cups);
        }

        ArrayList<Double> expenses = new ArrayList<Double>();
        expenses.add(74.46);
        expenses.add(63.99);
        expenses.add(10.57);
        expenses.add(81.37);

        double total = 0;

        // Iterate over expenses
        for (int i = 0; i < expenses.size(); i++) {
            total += expenses.get(i);

        }

        System.out.println("\nTotal sum of expenses: " + total);
    }

}


