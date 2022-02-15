package com.nazgul;

import static java.awt.Color.black;

class Pen {


    String color;

    public void printColor () {
        System.out.println("The color of this pen is: " + this.color);
    }
}
public class PrintColor {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        String blue;
        p1.color = "blue";

        Pen p2 = new Pen();
        String violet;
        p2.color = "violet";

        Pen p3 = new Pen();
        String red;
        p3.color = "red";

        p1.printColor();
        p2.printColor();
        p3.printColor();
    }
}

