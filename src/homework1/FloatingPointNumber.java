package homework1;

import java.util.Scanner;

public class FloatingPointNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert number: ");
        double d = scanner.nextDouble();
        if (d > 0) {
            if (d < 1) {
                System.out.println("Positive small");
            } else if (d > 1000000) {
                System.out.println("Positive large");
            } else {
                System.out.println("Positive");
            }
        } else if (d < 0) {
            if (Math.abs(d) < 1) {
                System.out.println("Negative small");
            } else if (Math.abs(d) > 1000000) {
                System.out.println("Negative large");
            } else {
                System.out.println("Negative");
            }
        } else {
            System.out.println("Zero");
        }
    }
}