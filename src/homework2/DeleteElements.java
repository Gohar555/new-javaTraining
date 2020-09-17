package homework2;

import java.util.Scanner;

public class DeleteElements {
    private static int deleteElement(int arr[], int n, int x) {
        int i;
        for (i = 0; i < n; i++)
            if (arr[i] == x)
                break;

        if (i < n) {
            n = n - 1;
            for (int j = i; j < n; j++)
                arr[j] = arr[j + 1];
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ARRAY_LENGTH = 3;
        int[] arr1 = new int[ARRAY_LENGTH];
        for (int i = 0; i < ARRAY_LENGTH; ++i) {
            while (!scanner.hasNextInt()) {
                System.out.println("Please enter int number: ");
                scanner.next();
            }
            arr1[i] = scanner.nextInt();
        }
        int n = arr1.length;
        System.out.println("Please choose digit");
        int x = scanner.nextInt();

        n = deleteElement(arr1, n, x);

        System.out.println("Modified array is");
        for (int i = 0; i < n; i++)
            System.out.print(arr1[i] + " ");
    }
}
