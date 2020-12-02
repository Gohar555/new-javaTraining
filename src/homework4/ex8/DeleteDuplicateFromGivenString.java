package homework4.ex8;

import java.util.Scanner;

/**
 * @author Gohar Farmanyan
 */
public class DeleteDuplicateFromGivenString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter random string:");
        String random = scanner.next();
        System.out.println("After removing duplicate chars = " + removeDuplicateChars(random));
    }

    private static String removeDuplicateChars(String random) {
        char[] arr1 = random.toCharArray();
        String targetStr = "";
        for (char value : arr1) {
            if (targetStr.indexOf(value) == -1) {
                targetStr += value;
            }
        }
        return targetStr;
    }
}
