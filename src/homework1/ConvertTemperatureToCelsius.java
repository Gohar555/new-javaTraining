package homework1;

import java.util.Scanner;

public class ConvertTemperatureToCelsius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float t = scanner.nextInt();
        int f = 212;
        int c = 100;
        System.out.println((t * c) / f + " Celsius");
    }
}
