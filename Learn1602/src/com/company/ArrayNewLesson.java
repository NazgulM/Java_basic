package com.company;

public class ArrayNewLesson {
    public static void main(String[] args) {
        //creating an array  with 7 elements
        String [] days = {"MON","TUE","WED","THU","FRI","SAT","SUN"};//0 1 2 3 4 5 6
        //accessing element with index number 5
        System.out.println(days[5]);
        //modify elements
        days[0] = "MON_Ura";
        days[6] = "SUN_new";
        System.out.println(days[0]);
        System.out.println(days[6]);

        //number of elements in array
        System.out.println(days.length);

        //for loop over an array
        /*for (int i =0; i<days.length; i++) {
            System.out.println(days[i]);*/
            // while loop
           int [] numbers = {10,20,30,40,50};
           int a = 0;
           while (a<numbers.length) {
               System.out.println(numbers[a]);
               a++;

            }
        }
    }

