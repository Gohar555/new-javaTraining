package homework2;


public class TwoToOne {
    public static void main(String[] args) {

        int[][] array = {{1, 2}, {1, 6}};
        System.out.println("Contents of Array:");
        System.out.println(array[0][0] + " " + array[0][1]);
        System.out.println(array[1][0] + " " + array[1][1]);
        System.out.println("Convert to one: ");
        for(int i = 0; i< array.length; ++i)
            for (int j = 0; j<array[i].length; ++j){
                System.out.println(array[i][j]);
            }
    }
}
