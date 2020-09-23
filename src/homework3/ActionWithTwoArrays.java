package homework3;

import java.util.Scanner;

public class ActionWithTwoArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ARRAY_LENGTH = 3;

        System.out.println("Please enter int numbers of first array: ");
        int[] array1 = new int[ARRAY_LENGTH];
        for (int i = 0; i <= ARRAY_LENGTH; ++i) {
            while (!scanner.hasNextDouble()) {
                System.out.println("Please insert valid data");
                scanner.next();
            }
            array1[i] = scanner.nextInt();
        }

        System.out.println("Please enter int numbers of second array: ");
        int[] array2 = new int[ARRAY_LENGTH];
        for (int j = 0; j <= ARRAY_LENGTH; ++j) {
            while (!scanner.hasNextDouble()) {
                System.out.println("Please insert valid data");
                scanner.next();
            }
            array2[j] = scanner.nextInt();
        }
        int[] array3 = new int[ARRAY_LENGTH];
        for (int k = 0; k <= ARRAY_LENGTH; ++k) {
//            array3[k] = array1[i] + array2[j];

            System.out.println("array3 = " + array3[k]);

        }
    }
}
