package homework1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter first number:");
        int f = scanner.nextInt();

        System.out.println("Please enter second number:");
        int k = scanner.nextInt();

        System.out.println("Please enter math operator:");
        char z = scanner.next().charAt(0);

        switch (z) {
            case '+':
                int a = f + k;
                System.out.println(f + " " + z + " " + k + " = " + a);
                break;

            case '-':
                int b = f - k;
                System.out.println(f + " " + z + " " + k + " = " + b);
                break;

            case '*':
                int c = f * k;
                System.out.println(f + " " + z + " " + k + " = " + c);
                break;

            case '/':
                if (k == 0) {
                    System.out.println("K can't be 0");
                } else {
                    int d = f / k;
                    System.out.println(f + " " + z + " " + k + " = " + d);
                    break;
                }

            case '%':
                int e = f % k;
                System.out.println(f + " " + z + " " + k + " = " + e);
                break;

            default:
                System.out.println("input data is incorrect, please add correct data");
        }
    }
}
