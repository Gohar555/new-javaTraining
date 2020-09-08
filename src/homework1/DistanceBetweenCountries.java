package homework1;

import java.util.Scanner;

public class DistanceBetweenCountries {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please add coordinates ");
        double x1 = scanner.nextInt();
        double y1 = scanner.nextInt();
        double x2 = scanner.nextInt();
        double y2 = scanner.nextInt();
        double a = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) * 1.0);

        System.out.println("Distance between 2 countries is " + a);

        double b = ((y1 - x1) / 2);
        double c = ((y2 - x2) / 2);

        System.out.println("Middle point between 2 countries is " + "(" + b + ", " + c + ")");
    }
}
