package com.company;
import java.util.Arrays;
public class ArrayExc {
    public static void main(String[] args) {
        float numbers [] = new float[5];
        System.out.println(Arrays.toString(numbers));
        numbers [0] = 14;
        numbers[1] = 4;
        numbers[2] = 1;
        System.out.println(Arrays.toString(numbers));

        int [] numbers2;
        numbers2 = new int[]{12,35,35,55};

        System.out.println(Arrays.toString(numbers2));
        for (int i = 0; i < numbers2.length; i++) {
        if(numbers2[i] > 50) {
            numbers2 [i] = 50;
        }
            System.out.println(numbers2[i]);
 }
    }
}
