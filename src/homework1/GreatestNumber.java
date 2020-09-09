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

        if (a > b && a > c) {
            System.out.println(a);
        } else {
            System.out.println("Biggest number is: " + Math.max(b, c));
        }
    }
}
