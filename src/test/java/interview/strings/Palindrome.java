package interview.strings;

// QUESTION: Given a string, determine if it is a palindrome. A palindrome reads the same backward
// as forward.
public class Palindrome {

    public static void main(String[] args) {
        // Approach 1: Simple case-insensitive check
        String name = "Madam";
        System.out.println("StringBuilder Approach: " + isPalindromeStringBuilder(name));

        // Approach 2: With alphanumeric filtering
        String phrase = "A man, a plan, a canal: Panama";
        System.out.println("Two-Pointer Approach: " + isPalindromeTwoPointer(phrase));
    }

    /**
     * Approach 1: Using StringBuilder
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     * Use for simple case-insensitive palindrome check
     */
    public static boolean isPalindromeStringBuilder(String s) {
        StringBuilder rev = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            rev.append(s.charAt(i));
        }
        return s.equalsIgnoreCase(rev.toString());
    }

    /**
     * Approach 2: Two Pointers with alphanumeric filtering
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     * Use when string contains special characters and needs alphanumeric-only check
     */
    public static boolean isPalindromeTwoPointer(String s) {
        int left = 0, right = s.length() - 1;

        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }
        return true;
    }
}

