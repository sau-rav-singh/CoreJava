package Linkedin;

import java.util.Arrays;

// QUESTION: Given two strings, write a function to determine if they are anagrams of each other.
// An anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
// typically using all the original letters exactly once. The comparison should be case-insensitive
// and ignore spaces.
// Example: Input: "Saurav is Singh Hexaware", "Singh Saurav Hexaware is" -> Output: true
public class AnagramCheck {
    public static void main(String[] args) {
        String str1 = "Saurav is Singh Hexaware";
        String str2 = "Singh Saurav Hexaware is";

        if (areAnagrams(str1, str2)) {
            System.out.println("Anagram");
        } else {
            System.out.println("No");
        }
    }

    static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length())
            return false;

        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }
}
