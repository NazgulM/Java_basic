package com.codecademy;

public class StringClasses {
    public static void main(String[] args) {
        String tweet = "Liz Lemon, ninjas are kind of cool... I just dont know any personally. Get on that.";
        System.out.println(tweet.length());
        // Add your first names:
        String firstName = "Nazgul";
        String lastName = "Ma";

        // What's the full name?
        System.out.println(firstName.concat(" " + lastName));
        String password = "correcthorsebatterystaple";

        // Write the code:
        System.out.println(password.equals("Correct"));

        /*If we want to know the index of the first occurrence of a character
        in a string, we can use the indexOf() method on a string.

         String letters = "ABCDEFGHIJKLMN";

        System.out.println(letters.indexOf("C"));
        This would output 2.

          Although C is the third letter in the English alphabet,
          it is located in the second index of the string.

                  Suppose we want to know the index of the first occurrence of an entire substring.
                  he indexOf() instance method can also return where the substring begins
                  (the index of the first character in the substring):
          String letters = "ABCDEFGHIJKLMN";

          System.out.println(letters.indexOf("EFG"));
          This would output 4, because EFG starts a  t index 4.

           If the indexOf() doesn’t find what it’s looking for, it’ll return a -1
         */

        String code = ".... .. / .. .----. -- / ... --- -. -. -.-- / .- -. -.. / " +
                ".. / .-.. .. -.- . / - --- / . .- - / .-. .- -- . -.";

        // Write the code:
        System.out.println(code.indexOf(". .- -"));

        //charAt
        String firstName1 = "Nazgul";
        String lastName1 = "Maniiasova";

        // What are the initials?
        System.out.println(firstName1.charAt(0));
        System.out.println(lastName1.charAt(0));

        //substring method
        /*The substring begins with the character at the specified
        index and extends to the end of the string.
        the first argument is inclusive and the second is exclusive.
        This means the resulting substring will begin at index 27 and extend up to,
        When substring() is called with two arguments,
         but not including, index 33. Therefore, the example above would output
         stella because that’s the substring that begins at index 27 and ends at index 32, one index before 33.
         */
        String line = "The Heav'ns and all the Constellations rung";
        // Change the arguments:
        System.out.println(line.substring(4, 11));

        /*
        toUpperCase(): returns the string value converted to uppercase
        toLowerCase(): returns the string value converted to lowercase
         */
        String hashtag = "#100DaysOfCode";

        // Make the hashtag lowercase:
        System.out.println(hashtag.toLowerCase());

        String str = "My name is Nazgul Maniiasova";
        System.out.println("Length of str: " + str.length());
        String str1 = "Aruuke";
        String str2 = "Baktiiarova";
        System.out.println("Full name is: " + str1.concat(" " + str2));
        System.out.println(str.indexOf("name"));
        System.out.println(str2.charAt(3));
        System.out.println(str.equals(str1));
        System.out.println(str.equalsIgnoreCase(str1));
        System.out.println(str.substring(11));
        System.out.println(str1.substring(0,4));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());

    }


}
