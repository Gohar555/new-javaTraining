package homework1;

import java.util.Scanner;

public class OddEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number ");
        float a = scanner.nextFloat();

        if (a % 2 == 0) {
            System.out.println("Even number");
        } else
            System.out.println("Odd number");

        System.out.println("Bye!");
    }
}
