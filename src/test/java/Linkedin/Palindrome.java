package Linkedin;

public class Palindrome {
    // QUESTION: Given a string, determine if it is a palindrome. A palindrome reads the same backward
    // as forward. The comparison should be case-insensitive.
    // Example: Input: "Madam" -> Output: true
    //          Input: "Hello" -> Output: false

    public static void main(String[] args) {
        String name = "Madam";
        StringBuilder rev = new StringBuilder();
        int count = name.length();

        // Reverse the string
        for (int i = count - 1; i >= 0; i--) {
            rev.append(name.charAt(i));
        }

        // Check if it is a palindrome (case-insensitive)
        if (name.equalsIgnoreCase(rev.toString())) {
            System.out.println("Palindrome");
        }
    }
}
