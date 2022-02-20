package com.naza;

public class CodesDope {
    public static void main(String[] args) {
        int a  = 5;
        double b = 6.2;
        System.out.println(a+b);

        double c = 3.9;
        System.out.println(c*c);

        int [][]d = {{1,2,3}, {4,5,6}, {7,8,9},};

        for (int i = 0; i<d.length;i++) {
            for (int j = 0;j<d[i].length; j++) {
                System.out.println(d[i][j]);

                int [][] numbers = {{-1,-2,-3},{0,1,2},{3},};
                for (int [] innerArray:numbers) {
                    for (int data: innerArray) {
                        System.out.println(data);

                        int[][][] test = {
                                { {1, -2, 3}, {2, 3, 4}}, {{-4, -5, 6, 9}, {1}, {2, 3}}};
                        for (int [][] array2D: test) {
                            for (int [] array1D: array2D) {
                                for (int item: array1D) {
                                    System.out.println(item);
                                }
                            }
                        }
                    }
                }
            }
        }

    }
}
