package homework2;

import java.util.Scanner;

public class ConvertIntToArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please add the number: ");

        int num = scanner.nextInt();
        int[] digits = Integer.toString(num).chars().map(c -> c - '0').toArray();

        System.out.println("Array is: ");

        for (int d : digits)
            System.out.println(d);
    }
}