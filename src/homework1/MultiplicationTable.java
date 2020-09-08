package homework1;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        for (int j = 0; j <= 10; ++j)
            System.out.println(i + " * " + j + " = " + i * j);
    }
}
