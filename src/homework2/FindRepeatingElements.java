package homework2;

import java.util.Scanner;

public class FindRepeatingElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ARRAY_LENGTH = 3;
        int[] arr1 = new int[ARRAY_LENGTH];
        int[] arr2 = new int[ARRAY_LENGTH];

        System.out.println("Please add elements of 1st array ");

        for (int i = 0; i < ARRAY_LENGTH; ++i) {
            while (!scanner.hasNextInt()) {
                System.out.println("Please enter int number: ");
                scanner.next();
            }
            arr1[i] = scanner.nextInt();
        }
        System.out.println("Please add elements of 2nd array ");

        for (int j = 0; j < ARRAY_LENGTH; ++j) {
            while (!scanner.hasNextInt()) {
                System.out.println("Please enter int number: ");
                scanner.next();
            }
            arr2[j] = scanner.nextInt();
        }

        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    System.out.println(arr1[i]);
                }
            }
        }
    }
}
