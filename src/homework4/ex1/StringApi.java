package homework4.ex1;

import static homework4.Constants.OUT_OF_BOUNDS;

/**
 * @author Gohar Farmanyan
 */
public class StringApi {

    String getCharAtIndex(String input, int k) {
        if (input == null || input.isEmpty()) {
            return OUT_OF_BOUNDS;
        }
        if (k < 0 || k > input.length()) {
            return OUT_OF_BOUNDS;
        }
        return String.valueOf(input.charAt(k));
    }
}
