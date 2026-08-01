package programs.strings;

import org.testng.Assert;

/**
 * Separate Characters By Type
 *
 * Problem Statement:
 * Given a string containing lowercase letters, uppercase letters, and digits,
 * print the lowercase characters, uppercase characters, and digits separately.
 *
 * Constraints:
 * - 1 <= input.length <= 10^4
 * - input consists of alphanumeric characters.
 */
public class SeparateCharactersByType {

    public static void main(String[] args) {
        String input = "sumitM28";
        String[] result = separateByType(input);
        Assert.assertEquals(result[0], "sumit");
        Assert.assertEquals(result[1], "M");
        Assert.assertEquals(result[2], "28");
    }

    /**
     * APPROACH: Stream API (Optimal)
     *
     * Time Complexity: O(N)
     * - Single pass through the string.
     *
     * Space Complexity: O(N)
     * - StringBuilder for each character type.
     */
    public static String[] separateByType(String input) {
        StringBuilder lower = new StringBuilder();
        StringBuilder upper = new StringBuilder();
        StringBuilder digits = new StringBuilder();

        input.chars().filter(Character::isLowerCase).forEach(c -> lower.append((char) c));
        input.chars().filter(Character::isUpperCase).forEach(c -> upper.append((char) c));
        input.chars().filter(Character::isDigit).forEach(c -> digits.append((char) c));

        return new String[]{lower.toString(), upper.toString(), digits.toString()};
    }

    /**
     * APPROACH 2: Iterative (Alternative)
     *
     * Time Complexity: O(N)
     * - Single pass through the string.
     *
     * Space Complexity: O(N)
     * - StringBuilder for each character type.
     */
    public static String[] separateByTypeIterative(String input) {
        StringBuilder lower = new StringBuilder();
        StringBuilder upper = new StringBuilder();
        StringBuilder digits = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (Character.isLowerCase(c)) {
                lower.append(c);
            } else if (Character.isUpperCase(c)) {
                upper.append(c);
            } else if (Character.isDigit(c)) {
                digits.append(c);
            }
        }

        return new String[]{lower.toString(), upper.toString(), digits.toString()};
    }
}

