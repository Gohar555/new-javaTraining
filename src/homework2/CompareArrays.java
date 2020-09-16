package homework2;

import java.util.Scanner;

public class CompareArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ARRAY_LENGTH = 3;
        int[] array1 = new int[ARRAY_LENGTH];
        int[] array2 = new int[ARRAY_LENGTH];

        System.out.println("Please add elements of 1st array ");

        for (int i = 0; i < ARRAY_LENGTH; ++i) {
            while (!scanner.hasNextInt()) {
                System.out.println("Please enter int number: ");
                scanner.next();
            }
            array1[i] = scanner.nextInt();
        }
        System.out.println("Please add elements of 2nd array ");

        for (int j = 0; j < ARRAY_LENGTH; ++j) {
            while (!scanner.hasNextInt()) {
                System.out.println("Please enter int number: ");
                scanner.next();
            }
            array2[j] = scanner.nextInt();
        }

//        if (array1[i] == array2[j]) {
//            break;
//        }
//        if (j == array2.length)
//            System.out.print(array1[i] + " ");
    }
}


