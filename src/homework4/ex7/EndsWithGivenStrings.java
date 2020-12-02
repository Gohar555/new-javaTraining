package homework4.ex7;

import java.util.Scanner;

/**
 * @author Gohar Farmanyan
 */
public class EndsWithGivenStrings {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter original string:");
        String original = scanner.next();

        System.out.println("Please enter given string:");
        String given = scanner.next();

        if (original.endsWith(given)) {
            System.out.println("Starts with given string");
        } else {
            System.out.println("Not Starts with given string");
        }
    }
}
