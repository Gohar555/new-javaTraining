package homework3;

import java.util.Scanner;

public class SumArguments {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please add values: ");
        int ARRAY_LENGTH = 3;
        int sum = 0;
        int[] array = new int[ARRAY_LENGTH];
        for (int i = 0; i < array.length; ++i) {
            while (!scanner.hasNextDouble()) {
                System.out.println("Please enter int number: ");
                scanner.next();
            }
            array[i] = scanner.nextInt();
        }
        for (int i : array)
            sum += i;
        System.out.println("The sum is " + sum);
    }
}

