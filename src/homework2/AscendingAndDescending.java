package homework2;

import java.util.Random;
import java.util.Scanner;

public class AscendingAndDescending {
    public static void main(String[] args) {
        int num, i, j, n;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Enter the number of integers to sort:");
        num = scanner.nextInt();

        int array[] = new int[num];

        System.out.println("Enter " + num + " integers: ");

        for (i = 0; i < num; i++)
            array[i] = random.nextInt();

        for (i = 0; i < ( num - 1 ); i++) {
            for (j = 0; j < num - i - 1; j++) {
                if (array[j] > array[j+1])
                {
                    n = array[j];
                    array[j] = array[j+1];
                    array[j+1] = n;
                }
            }
        }

        System.out.println("Sorted by Ascending:");

        for (i = 0; i < num; i++)
            System.out.println(array[i]);

        for (i = 0; i < ( num - 1 ); i++) {
            for (j = 0; j < num - i - 1; j++) {
                if (array[j] < array[j+1])
                {
                    n = array[j];
                    array[j] = array[j+1];
                    array[j+1] = n;
                }
            }
        }

        System.out.println("Sorted by descending:");

        for (i = 0; i < num; i++)
            System.out.println(array[i]);
    }
}
