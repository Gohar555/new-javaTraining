package homework6;

/**
 * Created by Gohar Farmanyan
 */

public class LibDataRepo {
    static String names[] = {"Margaret", "J.K", "William", "Leo", "Charles", "Abraham", "Barack"};
    static String surnames[] = {"Atwood", "Rowling", "Shakespeare", "Tolstoy", "Dickens", "Lincoln", "Obama"};
    static String[] titles = {"The Handmaid's Tale", "Harry Potter", "The Winter's Tale", "Oliver Twist", "War and Peace", "Niagara always forever", "Presidential works"};
    static String[] categories = {"Fantasy", "Thriller", "Historical", "Romance", "Social", "Comedy", "Horror"};

    public static void ArrayToString(Object[] array) {
        for (Object object : array) {
            System.out.println(object);
        }
    }
}
