package homework4.ex4;

import static homework4.Constants.INVALID;
import static homework4.Constants.VALID;

/**
 * @author Gohar Farmanyan
 */
public class Pakagic {

    String checkBrackets(String input) {
        if (input == null || input.isEmpty()) {
            return INVALID;
        }
        int length = input.length();
        if (length % 2 != 0) {
            return INVALID;
        }
        if (input.matches("[()]+")) {
            if (input.replace(")", "").length() == length / 2) {
                return VALID;
            }
        } else {
            return INVALID;
        }
        return INVALID;
    }


}
