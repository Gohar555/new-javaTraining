package homework3;

import java.util.Arrays;
import java.util.Scanner;

public class MultipleByTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please add values: ");
        int ARRAY_LENGTH = 10;
        int[] array = new int[ARRAY_LENGTH];
        String result = "";
        for (int i = 0; i < array.length; ++i) {
            while (!scanner.hasNextDouble()) {
                System.out.println("Please enter int number: ");
                scanner.next();
            }
            array[i] = scanner.nextInt();
        }
        int value = 2;
        System.out.println("Array is: " + Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            int num1 = array[i];

            result += (num1 * value) + " ";
        }
        System.out.println("Result is: " + result);
    }
}

