package homework4.ex5;

import java.util.Scanner;

/**
 * @author Gohar Farmanyan
 */
public class ContainGivenString {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String first = "fghjkliouyhgf";
        String second = "k";
        String third = "m";

        if (first.contains(second)) {
            System.out.println("Is Contain");
        }
        if (first.contains(third)) {
            System.out.println("Is Not Contain");
        }
    }
}
