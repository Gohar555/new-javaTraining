package homework1;

import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input First number");
        int a = scanner.nextInt();
        System.out.println("Input Second number");
        int b = scanner.nextInt();
        System.out.println("Input 3th number");
        int c = scanner.nextInt();
        System.out.println("The greatest number is ");

        if (a > b && a > c) {
            System.out.println(a);
        } else if (a > b && a < c) {
            System.out.println(c);
        } else if (a < b && c < b) {
            System.out.println(b);
        } else if (a > b && b < c) {
            System.out.println(a);
        } else if (a == b && a > c) {
            System.out.println(b);
        } else if (a > b && b == c) {
            System.out.println(a);
        } else if (b > a && a == c) {
            System.out.println(b);
        } else if (a == b && b == c) {
            System.out.println("The greatest number not find");
        }
    }
}
