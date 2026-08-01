package programs.fileio;

import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

/**
 * Password Sanitizer
 *
 * Problem Statement:
 * Filter passwords that meet the following criteria:
 * - At least 5 characters long
 * - Must be alphanumeric (contains both letters and numbers)
 *
 * Constraints:
 * - Password list can be empty.
 * - Passwords can contain any characters.
 */
public class PasswordSanitizer {

    public static void main(String[] args) {
        List<String> passwords = new ArrayList<>();
        passwords.add("peC1");
        passwords.add("pass@123");
        passwords.add("word@321");
        passwords.add("wordpass");
        passwords.add("987345");
        String result = filter(passwords);
        Assert.assertNotNull(result, "Filter result should not be null");
        System.out.println(result);
    }

    /**
     * APPROACH: Iterative Filtering (Optimal)
     *
     * Time Complexity: O(N * M)
     * - N is the number of passwords, M is the average password length.
     *
     * Space Complexity: O(N)
     * - List for valid passwords.
     */
    public static String filter(List<String> passwords) {
        List<String> validPass = new ArrayList<>();

        for (String password : passwords) {
            boolean isLongEnough = password.length() >= 5;
            boolean containsOnlyLet = password.matches("[a-zA-Z]+");
            boolean containsOnlyNum = password.matches("[0-9]+");
            boolean isMixed = !(containsOnlyLet || containsOnlyNum);

            if (isLongEnough && isMixed) {
                validPass.add(password);
            }
        }

        return String.join(" ", validPass);
    }

    /**
     * APPROACH 2: Stream API (Modern)
     *
     * Time Complexity: O(N * M)
     * - N is the number of passwords, M is the average password length.
     *
     * Space Complexity: O(N)
     * - Stream collects valid passwords.
     */
    public static String filterStream(List<String> passwords) {
        return passwords.stream()
                .filter(password -> password.length() >= 5)
                .filter(password -> !password.matches("[a-zA-Z]+"))
                .filter(password -> !password.matches("[0-9]+"))
                .collect(java.util.stream.Collectors.joining(" "));
    }
}



