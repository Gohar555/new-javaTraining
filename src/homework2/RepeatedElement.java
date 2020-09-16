package homework2;

public class RepeatedElement {
    private void printRepeating(int array[], int ARRAY_LENGTH) {
        int[] count = new int[ARRAY_LENGTH];
        int i;
        System.out.println("Repeated Elements are :");
        for (i = 0; i < ARRAY_LENGTH; i++) {
            if (count[array[i]] == 1)
                System.out.print(array[i] + " ");
            else
                count[array[i]]++;
        }
    }

    public static void main(String[] args) {
        RepeatedElement repeat = new RepeatedElement();
        int array[] = {4, 2, 4, 5, 2, 3, 2, 1};
        int size = array.length;
        repeat.printRepeating(array, size);
    }
}
