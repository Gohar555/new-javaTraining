package homework1;

import java.util.Scanner;

public class ConvertInchToMeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        float inch = 0.0254F;
        System.out.println(n * inch + " Meter");
    }
}
