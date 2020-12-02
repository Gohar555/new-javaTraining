package homework4.ex3;

/**
 * @author Gohar Farmanyan
 */
public class PalindromeString {

    public boolean isPalindrome(String input) {
        String cleanInput = input.replaceAll("\\s+", "").toLowerCase();
        if (cleanInput.length() / 2 != 0) {
            return false;
        }
        return palindrome(cleanInput, 0, cleanInput.length() - 1);
    }

    private boolean palindrome(String text, int forward, int backward) {
        if (forward == backward) {
            return true;
        }
        if ((text.charAt(forward)) != (text.charAt(backward))) {
            return false;
        }
        if (forward < backward + 1) {
            return palindrome(text, forward + 1, backward - 1);
        }
        return true;
    }
}

