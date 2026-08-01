package programs.strings;

import org.testng.Assert;

import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode 13: Roman to Integer
 *
 * Problem Statement:
 * Given a roman numeral, convert it to an integer.
 *
 * Constraints:
 * - 1 <= s.length <= 15
 * - s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
 * - It is guaranteed that s is a valid roman numeral in the range [1, 3999].
 */
public class RomanToInt {

    public static void main(String[] args) {
        Assert.assertEquals(romanToInt("X"), 10);
        Assert.assertEquals(romanToInt("III"), 3);
        Assert.assertEquals(romanToInt("IV"), 4);
        Assert.assertEquals(romanToInt("IX"), 9);
        Assert.assertEquals(romanToInt("LVIII"), 58);
        Assert.assertEquals(romanToInt("MCMXCIV"), 1994);
    }

    /**
     * APPROACH: Right-to-Left Traversal (Optimal)
     *
     * Time Complexity: O(N)
     * - Single pass through the string.
     *
     * Space Complexity: O(1)
     * - Constant size map.
     */
    public static int romanToInt(String s) {
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char currentChar = s.charAt(i);
            int currentValue = romanMap.get(currentChar);

            if (currentValue < prevValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }
            prevValue = currentValue;
        }
        return result;
    }
}

