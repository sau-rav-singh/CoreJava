package Gayle;

import org.testng.Assert;

public class CheckPermutation {
    public static void main(String[] args) {
        Assert.assertTrue(arePermutations("ABC", "CBA"));
        Assert.assertFalse(arePermutations("ABCD", "CBAX"));
        Assert.assertTrue(arePermutations("aabbcc", "bbaacc"));
        Assert.assertFalse(arePermutations("abc", "abcd"));
    }

    static boolean arePermutations(String str1, String str2) {
        if (str1.length() != str2.length()) return false;

        int[] charCount = new int[256];

        for (int i = 0; i < str1.length(); i++) {
            charCount[str1.charAt(i)]++;
            charCount[str2.charAt(i)]--;
        }
        for (int count : charCount) {
            if (count != 0) return false;
        }
        return true;
    }
}
