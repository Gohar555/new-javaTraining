package homework5;

/**
 * @author Gohar Farmanyan
 */
public class Line {

    public static boolean isBelongToTheLine(long a, long b, long c, long x, long y) {
        if (a * x + b * y + c == 0) {
            System.out.println("The point belong to the area");
        } else {
            System.out.println("The point is not belong to the area");
        }
        return true;
    }
}

