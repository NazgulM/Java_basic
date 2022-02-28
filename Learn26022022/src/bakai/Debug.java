package bakai;
import java.util.*;

public class Debug {
    //ArithmeticException: Something went wrong during an arithmetic operation; for example, division by zero.
    // NullPointerException: You tried to access an instance variable or
    // invoke a method on an object that is currently null.
    // ArrayIndexOutOfBoundsException: The index you are using is either negative
    // or greater than the last index of the array (i.e., array.length-1).
    //FileNotFoundException: Java didn’t find the file it was looking for.

    //The try statement allows you to define a block of code to be tested for errors while it is being executed
    //The catch statement allows you to define a block of code to be executed if an error occurs in the try block.
    public static void main(String[] args) {

        int width = 0;
        int length = 40;

        try {

            int ratio = length/width;
        } catch (ArithmeticException e) {

            System.err.println("ArithmeticException: " + e.getMessage());
        }
    }

}

