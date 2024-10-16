package Codewars;

import java.util.HashMap;

import static org.testng.Assert.assertTrue;

public class Scramblies {

    //Complete the function scramble(str1, str2) that returns true if a portion of str1 characters can be rearranged to match str2, otherwise returns false
    //scramble('rkqodlw', 'world') ==> True

    public static void main(String[] args) {
        assertTrue(scramble("cedewaraaossoqqyt", "codewars"));
    }

    public static boolean scramble(String str1, String str2) {
        HashMap<Character, Integer> countMap = new HashMap<>();
        for (char c : str1.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }
        for (char c : str2.toCharArray()) {
            if (!countMap.containsKey(c) || countMap.get(c) == 0) {
                return false;
            }
            countMap.put(c, countMap.get(c) - 1);
        }
        return true;
    }
}
