package homework1;

import java.util.Scanner;

public class ConvertTemperatureToCelsius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the temperature with Fahrenheit");
        float f = scanner.nextInt();
        System.out.println(((f - 32) * 5) / 9 + " Celsius");
    }
}
