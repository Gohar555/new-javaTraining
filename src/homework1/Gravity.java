package homework1;

import java.util.Scanner;

public class Gravity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float w = scanner.nextFloat();
        float g = 9.8F;
        System.out.println((g * w) / 1.62);
    }
}
