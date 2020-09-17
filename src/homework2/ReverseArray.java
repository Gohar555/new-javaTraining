package homework2;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int ARRAY_LENGTH = 5;

        int[] array1 = new int[ARRAY_LENGTH];
        System.out.println("Please insert elements: ");
        for (int i = 0; i < array1.length; ++i) {
            while (!scanner.hasNextInt()) {
                System.out.println("Please enter int number: ");
                scanner.next();
            }
            array1[i] = scanner.nextInt();
        }
        for (int element : array1) {
            System.out.println(" " + element);
        }

        int[] array2 = new int[ARRAY_LENGTH];

        int j = 0;
        for (int i = array1.length - 1; i >= 0; --i) {
            array2[j] = array1[i];
            j++;
        }
        System.out.println();
        System.out.println("Reversed array is: ");
        for (int element : array2) {
            System.out.println(" " + element);
        }
    }
}
