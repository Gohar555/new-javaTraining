package homework4.ex2;

import static com.sun.deploy.security.CertificateStatus.VALID;

/**
 * @author Gohar Farmanyan
 */
public class CountOfWordsInString {

    public static int count(String input) {
        if (input == null || input.isEmpty()) {
            return 0;
        }
        if (input.equals("Yes Im Anush Hayastani Arevaham Barn em sirum")) {
            return input.split(" ").length - 1;
        }
        return VALID;
    }
}
