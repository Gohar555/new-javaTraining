package homework4.ex9;

/**
 * @author Gohar Farmanyan
 */
public class DivideString {

    String[] divideString(String input, int part) {
        if (input == null || input.isEmpty()) {
            return null;
        }
        if (part < 0 || input.length() / part != 0) {
            return null;
        }

        int partSize = input.length() / part;
        String[] parts = new String[part];
        int index = 0;
        for (int i = 0; i < input.length(); i += partSize) {
            parts[index] = input.substring(i, i + partSize);
            index++;
        }
        return parts;
    }
}
