package homework3;


import java.util.Scanner;

public class IncreaseMentionedValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please add values: ");
        int ARRAY_LENGTH = 3;
        double[] array = new double[ARRAY_LENGTH];

        for (int i = 0; i < array.length; ++i) {
            while (!scanner.hasNextDouble()) {
                System.out.println("Please enter int number: ");
                scanner.next();
            }
            array[i] = scanner.nextInt();
        }
        int value = 10;
        System.out.println("Please insert index: ");
        int i = scanner.nextInt();
        double result = (array[i] + (array[i]* value)/100);
        System.out.println("Result is: " + result);
    }
}
