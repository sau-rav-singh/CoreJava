package Linkedin;

public class Reverse {
    public static void main(String[] args) {
        String input = "My Name is Saurav Singh";

        // Reversing words
        String reversedWords = reverseWords(input);
        System.out.println("Reversed Words: " + reversedWords);

        // Reversing the entire string
        String reversedString = reverseString(input);
        System.out.println("Reversed String: " + reversedString);
    }

    static String reverseWords(String input) {
        String[] words = input.split(" ");
        StringBuilder reversed = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]).append(" ");
        }

        return reversed.toString().trim();
    }

    static String reverseString(String input) {
        char[] characters = input.toCharArray();
        StringBuilder reversed = new StringBuilder();

        for (int i = characters.length - 1; i >= 0; i--) {
            reversed.append(characters[i]);
        }

        return reversed.toString();
    }
}
