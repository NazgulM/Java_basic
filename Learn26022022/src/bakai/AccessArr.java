package bakai;

public class AccessArr {
    public static void main(String[] args) {
        // Store the first element from the String array
        //String firstWord = words[0];

// Store the last element of the String array
        //String lastWord = words[words.length-1];

// Store an element from a different position in the array
        // String middleWord = words[2];

//        // Given a 2D array of integer data
//        int[][] data = {{2,4,6}, {8,10,12}, {14,16,18}};
//
//// Access and store a desired element
//        int stored = data[0][2];
//    }
        //datatype variableName = existing2DArray[row][column];

        // Using the provided 2D array
        int[][] intMatrix = {
                {1, 1, 1, 1, 1},
                {2, 4, 6, 8, 0},
                {9, 8, 7, 6, 5}
        };

        // Access the integer at the first row and fourth column of intMatrix and store it in a variable called retrievedInt
        int retrievedInt = intMatrix [0][3];

        // Print 3 times the center value of intMatrix to the console. Make sure to access the correct element!
        System.out.println((intMatrix[1][2]) * 3);
    }
}
