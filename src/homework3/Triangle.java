package homework3;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number:");
        double a = scanner.nextDouble();
        System.out.println("Please enter 2nd number:");
        double b = scanner.nextDouble();
        System.out.println("Please enter 3rd number:");
        double c = scanner.nextDouble();

        if (a >= (b + c) || c >= (b + a) || b >= (a + c)) {
            System.out.println("Not a Triangle");
        } else if (a == b && b == c) {
            System.out.println("Equilateral Triangle");
            double area = (Math.sqrt(3) / 4) * (a * a);
            System.out.println("Equilateral Triangle area is: " + area);
        } else if (((a * a) + (b * b)) == (c * c) || ((a * a) + (c * c)) == (b * b) || ((c * c) + (b * b)) == (a * a)) {
            System.out.println("Right Triangle");
            double area = (a * b) / 2;
            System.out.println("Right Triangle area is: " + area);
        } else if (a != b && b != c && c != a) {
            System.out.println("Scalene Triangle");
        } else if ((a == b && b != c) || (a != b && c == a) || (c == b && c != a)) {
            System.out.println("Isosceles Triangle");
        }

    }
}
