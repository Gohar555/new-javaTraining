package homework4.ex10;

import java.util.Scanner;

/**
 * @author Gohar Farmanyan
 */
public class Recursion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter original string:");
        String original = scanner.next();
        String reversed = reverseString(original);
        System.out.println("The reversed string is: " + reversed);
    }

    public static String reverseString(String str)
    {
        if (str.isEmpty())
            return str;

        return reverseString(str.substring(1)) + str.charAt(0);
    }
}
