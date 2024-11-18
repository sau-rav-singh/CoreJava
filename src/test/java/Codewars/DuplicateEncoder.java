package Codewars;

public class DuplicateEncoder {

    //convert a string to a new string where each character in the new string is "(" if that character appears only once in the original string, or ")" if that character appears more than once in the original string

    public static void main(String[] args) {
        System.out.println(encode("din").equals("((("));
        System.out.println(encode("recede").equals("()()()"));
    }

    static String encode(String word) {
        word = word.toLowerCase();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < word.length(); ++i) {
            char c = word.charAt(i);
            result.append(word.lastIndexOf(c) == word.indexOf(c) ? "(" : ")");
        }
        return result.toString();
    }
}
