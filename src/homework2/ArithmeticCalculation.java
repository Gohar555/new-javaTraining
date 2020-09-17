package homework2;

import java.util.Scanner;

public class ArithmeticCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ARRAY_LENGTH = 10;

        double[] array = new double[ARRAY_LENGTH];
        double total = 0;
        System.out.println("Please add elements ");
        for (int i = 0; i < array.length; ++i) {
            while (!scanner.hasNextDouble()) {
                System.out.println("Please enter int number: ");
                scanner.next();
            }
            array[i] = scanner.nextDouble();
        }
        for (int i = 0; i < array.length; i++) {
            total = total + array[i];
        }

        double average = total / array.length;

        System.out.format("The average is %.3f", average);
    }
}
